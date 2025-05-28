package Constructor.EJERCITACION;
import java.util.Scanner;
public class PalabraInvertida {
public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    String palabra = lectura.nextLine(); 
    System.out.println("Palabra invertida: " + invertirPalabra(palabra, palabra.length()-1));
    }
    public static String invertirPalabra(String palabra, int indice){
        if (indice == 0){
            return " ";
        }
        else{
            return palabra.charAt(indice) + invertirPalabra(palabra, indice-1);
        }
    }
}

