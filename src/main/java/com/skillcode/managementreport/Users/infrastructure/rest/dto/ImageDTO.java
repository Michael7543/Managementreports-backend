package com.skillcode.managementreport.Users.infrastructure.rest.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ImageDTO(
        Long id,

        @NotBlank
        @Size(max = 255)
        String fileName,

        @NotBlank
        @Size(max = 255)
        String publicUrl,

        Long userId,
        Long generalInfoId
) {
}