package luna_ciega.dto;

import lombok.Data;

@Data
public class CitaRequest {

    private Long idUsuario;

    private Integer idServicio;

    private String fechaHoraInicio;

    private String fechaHoraFin;

    private String estado;

    private String notas;

}