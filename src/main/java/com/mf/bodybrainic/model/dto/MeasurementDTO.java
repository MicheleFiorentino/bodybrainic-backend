package com.mf.bodybrainic.model.dto;

import com.mf.bodybrainic.model.Measurement;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class MeasurementDTO {
    private Integer id;
    private String mTimestamp;
    private String csvPath;
    private Integer patientId;

    public MeasurementDTO(Measurement measurement){
        this.id = measurement.getId();
        this.mTimestamp = measurement.getMTimestamp().toString();
        this.csvPath = measurement.getCsvPath();
        this.patientId = measurement.getPatient().getId();
    }
}
