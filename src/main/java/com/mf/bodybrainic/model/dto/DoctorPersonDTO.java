package com.mf.bodybrainic.model.dto;

import com.mf.bodybrainic.model.Doctor;
import com.mf.bodybrainic.model.Person;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class DoctorPersonDTO extends PersonDTO{
    private Integer id;
    private String specialization;
    public DoctorPersonDTO(Doctor doctor, Person person){
        super(person);
        this.id = doctor.getId();
        this.specialization = doctor.getSpecialization();
    }
}
