package Constructor;
import java.util.Scanner;
public class Constructor{
    private static int n1;
    private static int n2;
    public static void main(String[] args){
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese los numeros: ");
        n1 = lectura.nextInt();
        n2 = lectura.nextInt();
        System.out.println("Ingrese lo que quiere hacer: 1 Resta y 2 Suma" );
        int decision = lectura.nextInt();
        Constructor objeto = new Constructor();
        lectura.close();
        if(decision == 1){
            objeto.Restar(n1, n2);
        }else{
            objeto.Sumar(n1,n2);
        }

    }
    public void Sumar(int num1, int num2){
        num1 = n1;
        num2 = n2;
        int suma;
        suma=num1+num2;
        System.out.println("La suma es: " + suma);
    }
    public void Restar(int num1, int num2){
        num1 = n1;
        num2 = n2;
        int resta = num1-num2;
        System.out.println("La resta es " + resta); 
    }
}