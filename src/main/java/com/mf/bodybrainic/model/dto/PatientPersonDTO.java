package com.mf.bodybrainic.model.dto;

import com.mf.bodybrainic.model.Patient;
import com.mf.bodybrainic.model.Person;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PatientPersonDTO extends PersonDTO{
    private Integer id;
    private String medicalCondition;
    private Integer weight;
    private String country;
    private Integer doctorId;

    public PatientPersonDTO(Patient patient, Person person){
        super(person);
        this.id = patient.getId();
        this.medicalCondition = patient.getMedicalCondition();
        this.weight = patient.getWeight();
        this.country = patient.getCountry();
        this.doctorId = patient.getDoctor().getId();
    }
}
