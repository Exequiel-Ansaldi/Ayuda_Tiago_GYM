package Colecciones;
import java.util.ArrayList;
public class UsarListaPeliculasPremiadas {
    public static void main(String[] args) {
        
        ArrayList<PeliculaPremiada> peliculas = new ArrayList<>();
        PeliculaPremiada p1 = new PeliculaPremiada("La La Land", "Oscar a la Mejor Música Original");
        PeliculaPremiada p2 = new PeliculaPremiada("Parasite", "Oscar a la Mejor Película");
        PeliculaPremiada p3 = new PeliculaPremiada("El Pianista", "Oscar a la Mejor Actor");
        PeliculaPremiada p4 = new PeliculaPremiada("El Señor de los Anillos: El Retorno del Rey", "Oscar a la Mejor Película");
        PeliculaPremiada p5 = new PeliculaPremiada("Titanic", "Oscar a la Mejor Película");

        peliculas.add(p5);
        peliculas.add(p4);
        peliculas.add(p3);
        peliculas.add(p2);
        peliculas.add(p1);


        ListaPeliculasPremiadas lista = new ListaPeliculasPremiadas(peliculas);

        for (PeliculaPremiada pelicula : lista.getListaPeliculasPremiadas()){
            System.out.println(pelicula.getTitulo() + " " + pelicula.getPremiobtenido());
        }
        PeliculaPremiada p6 = new PeliculaPremiada("Titanic", "Oscar a la Mejor Película");
        lista.agregarALista(p6);

    }
}
