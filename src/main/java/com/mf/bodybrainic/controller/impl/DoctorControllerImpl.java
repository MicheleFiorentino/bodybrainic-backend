package com.mf.bodybrainic.controller.impl;

import com.mf.bodybrainic.controller.api.DoctorController;
import com.mf.bodybrainic.model.dto.DoctorPersonDTO;
import com.mf.bodybrainic.service.api.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
}
