package com.skillcode.managementreport.Users.shared.response;

import com.skillcode.managementreport.Users.shared.constants.MessageResponse;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseGeneric<T> implements Serializable {
    private String codigoRespuestaName;
    private int codigoRespuestaValue;
    private MessageResponse mensaje;
    private T objeto;
    private List<T> listado;
    private Long totalRegistros;
    private Long paginaActual;
    private Long totalPaginas;
}
