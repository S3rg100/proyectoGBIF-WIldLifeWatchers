package entities;

public class Cuenta {
    private int Rol;
    private String Nombre_u_aux;
    private String contraseña_aux;
    private String correo_aux;

    public void autenticacion (String nombre_u_aux, String contraseña_aux){
        this.Nombre_u_aux = Nombre_u_aux;
        this.contraseña_aux = contraseña_aux;
    }
    public void setRol(int rol) {
        Rol = rol;
    }
    public int getRol() {
        return Rol;
    }
    public void setNombre_u_aux(String nombre_u_aux) {
        Nombre_u_aux = nombre_u_aux;
    }
    public String getNombre_u_aux() {
        return Nombre_u_aux;
    }
    public void setContraseña_aux(String contraseña_aux) {
        this.contraseña_aux = contraseña_aux;
    }
    public String getContraseña_aux() {
        return contraseña_aux;
    }
    public void setCorreo_aux(String correo_aux) {
        this.correo_aux = correo_aux;
    }
    public String getCorreo_aux() {
        return correo_aux;
    }
}