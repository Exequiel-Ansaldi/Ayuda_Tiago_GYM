package Algoritmos;
//Construir un programa que genere 100 números aleatorios menores a 1000 y determine la cantidad de números pares e impares generados//
import java.util.Random;
public class Aleatorio{
    public static void main(String args[]){
        Random random = new Random();
        int numero = 0;
        int pares = 0;
        int impares = 0;
        for( int i = 0; i<100; i++){
            numero = random.nextInt(1000);
            if (numero % 2 == 0 ){
                pares+=1;
            }
            else{
                impares+=1;
            }
        }
        System.out.println("Los pares son " + pares + " Y los impares son " + impares);
        
    }
}