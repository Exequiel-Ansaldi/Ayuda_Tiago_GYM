package Algoritmos;
import java.util.Scanner;
public class CuadradoNumeros{
    static public void main (String[] args ){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i;
        int cuadrado;
        sc.close();
        for (i=1; i<=n; i++){
            cuadrado = i*i;
            System.out.println("El numero "+ i +" su cuadrado es: " + cuadrado);
           
        } 
    }
}
