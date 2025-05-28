package Constructor;
public class Pelicula {
    private String titulo;
    private String genero;
    private String director;
    private int anio;
    public Pelicula(){
        titulo = null;
        genero = null;
        director = null;
        anio = 0;  
    }
    public Pelicula(String titulo, String genero, String director, int anio){
        this.titulo = titulo;
        this.genero = genero;
        this.director = director;
        this.anio = anio;
    }
    public void setTitulo(String t){
        titulo = t;
    }
    public void setGenero(String g){
        genero = g;
    }
    public void setDirector(String d ){
        director = d;
    }
    public void setAnio(Strin a ){
        anio = a;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getGenero(){
        return genero;
    }
    public String getDirector(){
        return director;
    }
    public int getAnio(){
        return anio;
    }
    public static void main(String[] args) {
        Pelicula pelicula = new Pelicula("Son como niños 2", "Comedia", "Yo", 2015);
    }
}