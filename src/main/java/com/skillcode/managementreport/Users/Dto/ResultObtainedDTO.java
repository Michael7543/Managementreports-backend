package com.skillcode.managementreport.Users.Dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ResultObtainedDTO(
       Long id,

       @NotBlank
       @Size(max = 255)
       String name,

       @NotNull
       @Min(0)
       Integer stock,

       Long userId,
       Long generalInfoId
){}