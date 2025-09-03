package com.skillcode.managementreport.Users.infrastructure.rest.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LocationDetailDTO {
    private UUID id;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String direction;

    private List<DetailInfoDTO> detailInfo;
}
