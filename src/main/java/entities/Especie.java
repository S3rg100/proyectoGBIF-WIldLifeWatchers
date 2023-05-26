package entities;

public class Especie {

    private String Nombre_especie;
    private int id_Especie;
    
    

    public void crear_especie (String nombre_especie, int id_Especie){
        this.Nombre_especie = Nombre_especie;
        this.id_Especie = id_Especie;
        
        
    }
    public void setNombre_especie(String nombre_especie) {
        Nombre_especie = nombre_especie;
        
        
    }
    public String getNombre_especie() {
        return Nombre_especie;
        
        
    }
    public void setId_Especie(int id_Especie) {
        this.id_Especie = id_Especie;
        
        
    }
    public int getId_Especie() {
        return id_Especie;
        
        
    }
}
