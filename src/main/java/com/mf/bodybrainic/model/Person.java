package com.mf.bodybrainic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mf.bodybrainic.model.enums.SexType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;


@Entity
@Getter
@Setter
public class Person {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 20)
    private String fiscalCode;

    @Column(length = 50)
    private String name;

    @Column(length = 50)
    private String surname;

    @Column
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    @Column
    private SexType sex;

    @Column
    private String email;

    @Column(length = 15)
    private String phoneNumber;

    @Column(length = 512)
    private String imagePath;

    @JsonIgnore
    @OneToMany(mappedBy = "person")
    private Set<Doctor> personDoctors;

    @JsonIgnore
    @OneToMany(mappedBy = "person")
    private Set<Patient> personPatients;

}
