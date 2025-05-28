package Algoritmos;
import java.util.Scanner;
public class ContadorPalabra{
    public static void main( String args[]){
        Scanner lectura = new Scanner (System.in);
        String palabra = lectura.nextLine();
        int cantidad = 0;
        for(int i = 0; i< palabra.length();i++){
            cantidad= cantidad + 1;
        }
        System.out.println("La cantidad de letras que tiene la palabra es " + cantidad );
        lectura.close();
    }
}