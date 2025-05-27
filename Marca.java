package Ejercicio1;

import java.util.List;

public class Marca {
    private int idmarca;
    private String nombre;
    private List<Modelo> modelos;


    public int getIdmarca() {
        return this.idmarca;
    }

    public void setIdmarca(int idmarca) {
        this.idmarca = idmarca;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Modelo> getModelos() {
        return this.modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

}
