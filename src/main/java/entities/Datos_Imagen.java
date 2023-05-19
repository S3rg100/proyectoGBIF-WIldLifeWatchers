package entities;

public class Datos_Imagen {

    private String fecha_cita;
    private String descripcion_di;
    private String id_Imagen;

    public void setFecha_cita(String fecha_cita) {
        this.fecha_cita = fecha_cita;
    }
    public String getFecha_cita() {
        return fecha_cita;
    }
    public void setDescripcion_di(String descripcion_di) {
        this.descripcion_di = descripcion_di;
    }
    public String getDescripcion_di() {
        return descripcion_di;
    }
    public void setId_Imagen(String id_Imagen) {
        this.id_Imagen = id_Imagen;
    }
    public String getId_Imagen() {
        return id_Imagen;
    }
}