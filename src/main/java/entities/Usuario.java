package entities;

public class Usuario extends Cuenta implements User{

    private String nombre_u;
    private String contraseña;
    private String correo;
    String datos;
    String id_camara;

    public void ver_datos (String datos){
        this.datos = datos;
    }
    public void ver_camaras (String id_camara){
        this.id_camara = id_camara;
    }
    public void setNombre_u(String nombre_u) {
        this.nombre_u = nombre_u;
    }
    public String getNombre_u() {
        return nombre_u;
    }
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    public String getContraseña() {
        return contraseña;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public String getCorreo() {
        return correo;
    }

    public void displayInfo(){

    }
}
