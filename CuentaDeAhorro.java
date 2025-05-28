import java.util.Scanner;
public class CuentaDeAhorro {
    static double interesAnual;
    private double saldoAhorros;
}
public CuentaDeAhorro(double interes, double ahorro){
    interesAnual = interes;
    saldoAhorros = ahorro;
}
public static void main(String args[]){
    Scanner lectura = new Scanner(System.in);
    double intere = 0.1;
    System.out.println("Ingrese saldo");
    double saldo = lectura.nextDouble();
    CuentaDeAhorro ahorrador1 = new CuentaDeAhorro(intere,saldo);
    intere = lectura.nextDouble();
    saldo = lectura.nextDouble();
    CuentaDeAhorro ahorrador2 = new CuentaDeAhorro(intere,saldo);
}
public void interesMensual(double sal, double inter){
    double interesMensual = sal*(inter/12);
}