package com.skillcode.managementreport.Users.shared.constants;

import lombok.Getter;

@Getter
public enum MessageResponse {
    SUCCESS("Operación exitosa", 200),
    NOT_FOUND("Recurso no encontrado", 404),
    BAD_REQUEST("Solicitud incorrecta", 400),
    UNAUTHORIZED("No autorizado", 401),
    INTERNAL_SERVER_ERROR("Error interno del servidor", 500);

    private final String mensaje;
    private final int codigo;

    MessageResponse(String mensaje, int codigo) {
        this.mensaje = mensaje;
        this.codigo = codigo;
    }
}
