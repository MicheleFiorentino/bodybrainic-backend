package com.mf.bodybrainic.model.dto;

import com.mf.bodybrainic.model.Person;
import com.mf.bodybrainic.model.enums.SexType;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@SuperBuilder
@NoArgsConstructor
public class PersonDTO {
    private String fiscalCode;
    private String name;
    private String surname;
    private LocalDate dateOfBirth;
    private SexType sex;
    private String email;
    private String phoneNumber;
    private String imagePath;

    public PersonDTO(Person person){
        this.fiscalCode = person.getFiscalCode();
        this.name = person.getName();
        this.surname = person.getSurname();
        this.dateOfBirth = person.getDateOfBirth();
        this.sex = person.getSex();
        this.email = person.getEmail();
        this.phoneNumber = person.getPhoneNumber();
        this.imagePath = person.getImagePath();
    }

    public Person getPerson() {
        Person person = new Person();
        person.setFiscalCode(this.fiscalCode);
        person.setName(this.name);
        person.setSurname(this.surname);
        person.setDateOfBirth(this.dateOfBirth);
        person.setSex(this.sex);
        person.setEmail(this.email);
        person.setPhoneNumber(this.phoneNumber);
        person.setImagePath(this.imagePath);
        return person;
    }

}
