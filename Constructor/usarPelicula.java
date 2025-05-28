/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

import Colecciones.Pelicula;

public class usarPelicula {
    public static void main (String args[]) {
        Pelicula pel1=new Pelicula();
        
        String tit, gen, dir;
        int año;
        
        tit="Titanic";
        gen="Drama";
        dir="James Cameron";
        año=1997;
        
        Pelicula pel2=new Pelicula(tit, gen, dir, año);

        System.out.println("Titulo: "+pel1.getTitulo());
        System.out.println("Director: "+pel1.getDirector());
        System.out.println("Género: "+pel1.getGenero());
        System.out.println("Año: "+pel1.getAño());
        System.out.println("-----------------------------");
        System.out.println("Titulo: "+pel2.getTitulo());
        System.out.println("Director: "+pel2.getDirector());
        System.out.println("Género: "+pel2.getGenero());
        System.out.println("Año: "+pel2.getAño());
        
        System.out.println(pel1.toString());
        System.out.println(pel2.toString());
    }
}
