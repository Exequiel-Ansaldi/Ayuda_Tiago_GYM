package Colecciones;
import java.util.*;
public class ListaPeliculasPremiadas {
    ArrayList<PeliculaPremiada> listaPeliculasPremiadas;

    public ListaPeliculasPremiadas(ArrayList<PeliculaPremiada> listaPeliculasPremiadas) {
        this.listaPeliculasPremiadas = listaPeliculasPremiadas;
    }


    public ArrayList<PeliculaPremiada> getListaPeliculasPremiadas() {
        return this.listaPeliculasPremiadas;
    }

    public void setListaPeliculasPremiadas(ArrayList<PeliculaPremiada> listaPeliculasPremiadas) {
        this.listaPeliculasPremiadas = listaPeliculasPremiadas;
    }



    
    public void agregarALista(PeliculaPremiada p){
        for (PeliculaPremiada pelicula : listaPeliculasPremiadas){
            if (pelicula.getTitulo().equals(p.titulo)){
                System.out.println("La pelicula " + pelicula + " ya se encuentra en la lista");
            }else{
                listaPeliculasPremiadas.add(pelicula);
            }
        }
    }


    @Override
    public String toString() {
        return "{" +
            " listaPeliculasPremiadas='" + getListaPeliculasPremiadas() + "'" +
            "}";
    }

}
