package Algoritmos;
import java.util.Scanner;
public class Inverso{
    public static void main(String[] args){
        int vector [];
        vector= new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=9; i>=0; i--){
            System.out.println("Ingresar el numero");
            vector[i]= sc.nextInt();
        }
        for(int i=0; i<=9; i++){
            System.out.println("El numero que esta en la posicion "+ i + " es "+ vector[i]);
        }
        sc.close();
    }
}
