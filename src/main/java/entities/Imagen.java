package entities;

public class Imagen{
    private String id_camara_aux;
    private String fecha_Imagen;
    private String nombre_imagen;
    private String id_imagen;
    public void setid_camara_aux(String id_camara_aux){
        this.id_camara_aux = id_camara_aux;
    }
    public String getId_camara_aux() {
        return id_camara_aux;
    }

    public void setFecha_Imagen(String fecha_Imagen) {
        this.fecha_Imagen = fecha_Imagen;
    }

    public String getFecha_Imagen() {
        return fecha_Imagen;
    }

    public void setNombre_imagen(String nombre_imagen) {
        this.nombre_imagen = nombre_imagen;
    }

    public String getNombre_imagen() {
        return nombre_imagen;
    }

    public void setId_imagen(String id_imagen) {
        this.id_imagen = id_imagen;
    }

    public String getId_imagen() {
        return id_imagen;
    }
}
