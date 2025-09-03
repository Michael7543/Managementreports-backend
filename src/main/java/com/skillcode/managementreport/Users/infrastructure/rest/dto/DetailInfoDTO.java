package com.skillcode.managementreport.Users.infrastructure.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetailInfoDTO {
    private UUID id;
    private String observations;

    private ActivitiesDetailDTO activitiesDetail;
    private SubActivitiesDetailDTO subActivitiesDetail;
    private LocationDetailDTO locationDetail;
    private GeneralInfoDTO generalInfo;
    private TypeSpaceDetailDTO typeSpaceDetail;
    private AdministrationZoneDetailDTO administrationZoneDetail;
    private PublicSpaceDetailDTO publicSpaceDetail;
    private FunctionDetailDTO functionDetail;
}
