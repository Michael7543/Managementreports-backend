package com.skillcode.managementreport.Users.infrastructure.rest.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRolesDto {
    private long id;
    @NotNull(message = "El ID de usuario no puede ser nulo")
    @Min(value = 1, message = "El ID de usuario debe ser mayor a 0")
    private Long userId;

    @NotNull(message = "El ID de rol no puede ser nulo")
    @Min(value = 1, message = "El ID de rol debe ser mayor a 0")
    private Long rolId;
}
