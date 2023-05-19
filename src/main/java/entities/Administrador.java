package entities;

public class Administrador extends Experto {

    private int rol_Aux;
    private String nombre_usuario_aux;

    public void Modificacion(int rol_aux,String nombre_usuario_aux) {
        this.nombre_usuario_aux = nombre_usuario_aux;
        this.rol_Aux = rol_Aux;
    }
    public void setRol_Aux(int rol_Aux) {
        this.rol_Aux = rol_Aux;
    }

    public int getRol_Aux() {
        return rol_Aux;
    }

    public void setNombre_usuario_aux(String nombre_usuario_aux) {
        this.nombre_usuario_aux = nombre_usuario_aux;
    }

    public void setnombre_usuario_aux(String nombre_usuario_aux) {
        super.getNombre_u_aux();
    }
}