package Parcial;
import java.util.Scanner;
public class Digitos {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        int numero = lectura.nextInt();
        System.out.println("La suma de los digitos es" + " " + SumaRecursiva(numero));
    }
    public static int SumaRecursiva(int numero){
        if(numero == 0){
            return 0;
        }
        else{
            return numero % 10 + SumaRecursiva(numero/10);
        }
    } 
}
