package com.skillcode.managementreport.Users.shared.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class responseGeneric<T> implements Serializable {
    private String codigoRespuestaName;
    private int codigoRespuestaValue;
    private String mensaje;
    private T objeto;
    private List<T> listado;
    private Long totalRegistros;
    private Long paginaActual;
    private Long totalPaginas;
}
