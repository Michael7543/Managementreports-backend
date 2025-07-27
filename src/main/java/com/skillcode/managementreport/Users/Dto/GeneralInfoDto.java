package com.skillcode.managementreport.Users.Dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Time;
import java.sql.Timestamp;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GeneralInfoDto {
    private long id;
    @NotBlank(message = "El campo 'order_service' no puede estar vacío")
    @Size(max = 100, message = "El campo 'order_service' no debe superar los 100 caracteres")
    private String orderService;

    @NotNull(message = "La fecha no puede ser nula")
    private Timestamp fecha;

    @NotNull(message = "La hora de inicio no puede ser nula")
    private Time timeStart;

    @NotNull(message = "La hora de fin no puede ser nula")
    private Time timeEnd;

    @NotBlank(message = "El código no puede estar vacío")
    @Size(max = 20, message = "El código no debe superar los 20 caracteres")
    private String code;

    @NotBlank(message = "El receptor no puede estar vacío")
    @Size(max = 100, message = "El receptor no debe superar los 100 caracteres")
    private String receiver;

    @NotNull(message = "El ID de usuario no puede ser nulo")
    private Long userId;
}
