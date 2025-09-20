package com.skillcode.managementreport.Users.infrastructure.rest.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DetailInfoDto {
    @NotBlank(message = "El detalle de función no puede estar vacío")
    @Size(max = 100, message = "El detalle de función no debe superar los 100 caracteres")
    private String functionDetail;

    @NotBlank(message = "La actividad no puede estar vacía")
    private String activity;

    @NotBlank(message = "La subactividad no puede estar vacía")
    private String subActivity;

    @NotBlank(message = "La estrategia no puede estar vacía")
    private String stategy;

    @NotBlank(message = "El tipo de lugar no puede estar vacío")
    private String typePlace;

    @NotBlank(message = "La zona administrativa no puede estar vacía")
    private String administrationZona;

    @NotBlank(message = "El espacio público no puede estar vacío")
    private String publicSpace;

    @NotNull(message = "La latitud no puede ser nula")
    @DecimalMin(value = "-90.0", message = "La latitud no puede ser menor a -90")
    @DecimalMax(value = "90.0", message = "La latitud no puede ser mayor a 90")
    private Double latitude;

    @NotNull(message = "La longitud no puede ser nula")
    @DecimalMin(value = "-180.0", message = "La longitud no puede ser menor a -180")
    @DecimalMax(value = "180.0", message = "La longitud no puede ser mayor a 180")
    private Double longitude;

    @NotBlank(message = "La dirección no puede estar vacía")
    private String direction;

    @NotNull(message = "El ID de usuario no puede ser nulo")
    private Long userId;
}
