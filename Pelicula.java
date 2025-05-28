/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

public class Pelicula {
    private String titulo;
    private String genero;
    private String director;
    private int año;

    public Pelicula() {
        titulo="Hombres de negro";
        director="Barry Sonnenfeld";
    } 
    
    public Pelicula(String titulo, String genero, String director, int año)  {
        this.titulo=titulo;
        this.genero=genero;
        this.director=director;
        this.año=año;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public String getDirector() {
        return director;
    }

    public int getAño() {
        return año;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", genero=" + genero + ", director=" + director + ", a\u00f1o=" + año + '}';
    }
}
