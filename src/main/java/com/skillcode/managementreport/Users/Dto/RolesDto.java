package com.skillcode.managementreport.Users.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RolesDto {
    private long id;
    @NotBlank(message = "El nombre del rol no puede estar vacío")
    @Size(max = 50, message = "El nombre del rol no debe superar los 50 caracteres")
    private String roleName;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Size(max = 200, message = "La descripción no debe superar los 200 caracteres")
    private String description;


}
