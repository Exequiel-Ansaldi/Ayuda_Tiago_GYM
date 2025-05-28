package Algoritmos;
import java.util.Scanner;
    public class Comparacion{
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
           int x = Integer. MAX_VALUE; 
            int numero = sc.nextInt();
            while (numero !=0 ){
             if (x > numero){
                x=numero;
             }
             numero = sc.nextInt();
            }
       System.out.println("El numero mas pequeño es: "+ x);
       sc.close();
    }
}
