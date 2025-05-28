package Constructor.EJERCITACION;
import java.util.Scanner;
public class EjecutableEmpleado {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese el codigo:");
        int codigo = lectura.nextInt();
        lectura.nextLine();
        System.out.println("Ingrese su especialidad");
        String especialidad =lectura.nextLine();
        Empleado e1 = new Empleado(codigo,especialidad);
        System.out.println("Ingrese el codigo:");
        codigo = lectura.nextInt();
        lectura.nextLine();
        System.out.println("Ingrese su especialidad");
        especialidad =lectura.nextLine();
        Empleado e2 = new Empleado(codigo,especialidad);
        System.out.println("Empleado 1: " + e1.toString());
        System.out.println("Empleado 2: " + e2.toString());
        lectura.close();
    }
}
