package Parcial;
import java.util.*;
public class NumeroDigitos{
    public static void main( String [] args){
        Scanner lectura = new Scanner(System.in);
        double numero = lectura.nextDouble();
        System.out.println(calcularDigitos(numero));
        lectura.close();
    }
    public static double calcularDigitos(double numero){
        if (numero <= 10){
            return 1;
        }else{
            return 1 + calcularDigitos(numero/10);
        }
    }
}