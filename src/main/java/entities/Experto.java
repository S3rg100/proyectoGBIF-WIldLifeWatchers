package entities;

public class Experto extends Usuario{

    private String id_imagen_aux;
    public void clasificacion (String id_imagen_aux){
        this.id_imagen_aux = id_imagen_aux;
    }
    public void setId_imagen_aux(String id_imagen_aux) {
        this.id_imagen_aux = id_imagen_aux;
    }
    public String getId_imagen_aux() {
        return id_imagen_aux;
    }
}
