package com.mf.bodybrainic.controller.impl;

import com.mf.bodybrainic.controller.api.DoctorController;
import com.mf.bodybrainic.model.dto.DoctorPersonDTO;
import com.mf.bodybrainic.service.api.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/bodybrainic/doctor")
public class DoctorControllerImpl implements DoctorController {

    @Autowired
    private DoctorService doctorService;

    @Override
    @GetMapping(path="/all")
    @ResponseBody
    public ResponseEntity<List<DoctorPersonDTO>> readAllDoctors(){
        List<DoctorPersonDTO> doclist = doctorService.getAllDoctors();
        return ResponseEntity.ok().body(doclist);
    }

    @Override
    @GetMapping(path="/byId")
    @ResponseBody
    public ResponseEntity<DoctorPersonDTO> readDoctorById(@RequestParam Long id){
        DoctorPersonDTO dp = doctorService.getDoctorById(id);
        if(dp != null)
            return ResponseEntity.ok().body(dp);
        else
            return ResponseEntity.notFound().build();
    }

    @Override
    @GetMapping(
            path="/avatarByPath",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    @ResponseBody
    public ResponseEntity<byte[]> readDoctorAvatar(@RequestParam String path) throws IOException {
        try {
            // Load the image from the classpath (resources folder)
            ClassPathResource imageResource = new ClassPathResource("static/data/profileImgs/" + path);

            // Read the image bytes into a byte array
            byte[] imageBytes = Files.readAllBytes(imageResource.getFile().toPath());

            // Return the ResponseEntity with the image bytes
            return ResponseEntity.ok(imageBytes);
        } catch (IOException e) {
            // Handle the case when the image is not found or there is an error reading the file
            return ResponseEntity.notFound().build();
        }
    }
}
