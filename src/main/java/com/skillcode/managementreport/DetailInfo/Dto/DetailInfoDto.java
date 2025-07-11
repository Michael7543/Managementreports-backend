package com.skillcode.managementreport.DetailInfo.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetailInfoDto {
    private long id;
    private String function_detail;
    private String activity;
    private String sub_activity;
    private String stategy;
    private String type_place;
    private String administration_zona;
    private String public_space;
    private Integer latitude;
    private Integer longitude;
    private String direction;
    private long user_id;

}
