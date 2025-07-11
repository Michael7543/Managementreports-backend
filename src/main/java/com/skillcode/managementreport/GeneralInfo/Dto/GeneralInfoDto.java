package com.skillcode.managementreport.GeneralInfo.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeneralInfoDto {
    private long id;
    private String order_service;
    private Timestamp fecha;
    private Time time_start;
    private Time time_end;
    private String code;
    private String receiver;
    private long user_id;
}
