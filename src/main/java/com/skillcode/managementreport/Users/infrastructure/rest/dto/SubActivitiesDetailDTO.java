package com.skillcode.managementreport.Users.infrastructure.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubActivitiesDetailDTO {
    private UUID id;
    private String subactivityName;

    private ActivitiesDetailDTO activityDetail;
    private List<DetailInfoDTO> detailInfoEntities;
}
