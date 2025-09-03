package com.skillcode.managementreport.Users.infrastructure.rest.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ObservationDTO(
        Long id,

        @NotBlank
        @Size(max = 500)
        String description,

        Long userId,
        Long generalInfoId
) {
}