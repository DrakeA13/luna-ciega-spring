package luna_ciega.dto;

public class DashboardDTO {

    private Long usuarios;

    private Long citas;

    private Long servicios;

    private Long pendientes;

    public Long getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Long usuarios) {
        this.usuarios = usuarios;
    }

    public Long getCitas() {
        return citas;
    }

    public void setCitas(Long citas) {
        this.citas = citas;
    }

    public Long getServicios() {
        return servicios;
    }

    public void setServicios(Long servicios) {
        this.servicios = servicios;
    }

    public Long getPendientes() {
        return pendientes;
    }

    public void setPendientes(Long pendientes) {
        this.pendientes = pendientes;
    }

}
