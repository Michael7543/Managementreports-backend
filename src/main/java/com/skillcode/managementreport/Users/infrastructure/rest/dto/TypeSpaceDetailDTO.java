package com.skillcode.managementreport.Users.infrastructure.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TypeSpaceDetailDTO {
    private UUID id;
    private String name;

    private List<DetailInfoDTO> detailInfo;
}
