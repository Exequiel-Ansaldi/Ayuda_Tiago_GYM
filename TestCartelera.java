import java.util.*;
public class TestCartelera {
    public static void main(String[] args) {
        HashSet<Pelicula> hash = new HashSet<>();
        Pelicula p1 = new Pelicula(123, "Avengers", 900, "Accion");
        Pelicula p2 = new Pelicula(5678, "Spiderman", 800, "Superheroe");
        Pelicula p3 = new Pelicula(8910, "La Llorona", 500, "Miedo");
        hash.add(p1);
        hash.add(p2);
        hash.add(p3);
        System.out.println("Lista de peliculas: ");
        for (Pelicula pelicula : hash) {
            System.out.println(pelicula);
        }
    }
}
