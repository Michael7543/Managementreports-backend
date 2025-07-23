package com.skillcode.managementreport.Users.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record SupportStaffDTO(
        Long id,

        @NotBlank
        @Size(max = 255)
        String staffName,

        Long userId,
        Long generalInfoId
) {}