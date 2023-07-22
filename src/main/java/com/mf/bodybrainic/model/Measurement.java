package com.mf.bodybrainic.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.mf.bodybrainic.model.enums.MeasurementType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.OffsetDateTime;


@Entity
@Getter
@Setter
public class Measurement {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private OffsetDateTime mTimestamp;

    @Enumerated(EnumType.STRING)
    @Column
    private MeasurementType mType;

    @Column(length = 512)
    private String csvPath;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "patient_id", nullable = false)
    private Patient patient;

}
