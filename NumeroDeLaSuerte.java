package Constructor;
import java.util.Scanner;
public class NumeroDeLaSuerte {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el año");
        int año = lectura.nextInt();
        System.out.println("Ingrese el mes");
        int mes = lectura.nextInt();
        System.out.println("Ingrese el dia");
        int dia = lectura.nextInt();
        NumeroDeLaSuerte instancia1 = new NumeroDeLaSuerte();
        System.out.println("El numero de la suerte es " + instancia1.calcularNumero(año, mes, dia));
        lectura.close();
    }
    public int calcularNumero(int año, int mes, int dia){
        int suma = año+mes+dia;
        int resultado = 0;
        while(suma != 0){
            resultado = resultado + suma % 10;
            suma = suma/10; 
        }
        return resultado;
    }
}
