package com.skillcode.managementreport.Users.Dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsersDto {
    private long id;

    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(max = 50, message = "El nombre no debe superar los 50 caracteres")
    private String name;

    @NotBlank(message = "El apellido no puede estar vacío")
    @Size(max = 50, message = "El apellido no debe superar los 50 caracteres")
    private String lastName;

    @NotBlank(message = "La cédula no puede estar vacía")
    @Pattern(regexp = "\\d{6,12}", message = "La cédula debe tener entre 6 y 12 dígitos")
    private String identityCard;

    @NotNull(message = "El número de teléfono no puede ser nulo")
    private int phone;

    @NotBlank(message = "El correo no puede estar vacío")
    @Email(message = "El correo electrónico no es válido")
    private String email;

    @NotBlank(message = "La contraseña no puede estar vacía")
    @Size(min = 6, max = 100, message = "La contraseña debe tener entre 6 y 100 caracteres")
    private String password;

}
