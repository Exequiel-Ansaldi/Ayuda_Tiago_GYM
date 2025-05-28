package Constructor;
import java.util.Scanner;
//Cree una clase llamada Rectángulo. La clase debe tener los atributos longitud y ancho, cada uno con un valor predeterminado de 1. Se requieren:
//a. Constructor por defecto.
//b. Constructor con parámetros.
//c. Métodos sets y gets. Los métodos de modificación deben verificar que longitud y ancho sean números mayores de 0 y menores de 20.
//d. Métodos para calcular el perímetro y el área del rectángulo.
//e. Un programa para probar la clase Rectángulo, creando al menos dos instancias de dicha clase.//
public class Rectangulo{
    private double longitud;
    private double ancho;
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("El ancho es ");
        double ancho = lectura.nextDouble();
        System.out.println("La longitud es ");
        double longitud = lectura.nextDouble();
        Rectangulo instancia1 = new Rectangulo(longitud, ancho);
        System.out.println("Los valores del rectangulo son " + instancia1.calcularArea(longitud, ancho) + " " + instancia1.calcularPerimetro(longitud, ancho));
        System.out.println("El ancho es ");
        ancho = lectura.nextDouble();
        System.out.println("La longitud es ");
        longitud = lectura.nextDouble();
        Rectangulo instancia2 = new Rectangulo();
        instancia2.setAncho(ancho);
        instancia2.setLongitud(longitud);
        System.out.println("El ancho es " + instancia2.getAncho() + " La longitud: " + instancia2.getLongitud() + instancia2.calcularArea(longitud, ancho) + instancia2.calcularArea(longitud, ancho));
        lectura.close();
    }
    public Rectangulo(double l, double a){
        if (l<20 && l>0 && a<20 && a>0){
        longitud = l;
        ancho = a;
        }else{
            System.out.println("Ingrese valores validos");
        }
    }
    public Rectangulo(){
        longitud = 1;
        ancho = 1;
    }
    public void setAncho(double a){
        if(a<20 && a>0){
        ancho = a;
        }else{
            System.out.println("Ingrese un valor valido");
        }
    }
    public void setLongitud(double l){
        if (l<20 && l>0){
            longitud = l;
        }else{
            System.out.println("Ingrese un valor valido");
        }
    }
    public double getAncho(){
        return ancho;
    }
    public double getLongitud(){
        return longitud;
    }
    public double calcularArea(double longitud, double ancho){
        double area = longitud*ancho;
        return area;
    }
    public double calcularPerimetro(double longitud, double ancho){
        double perimetro = (longitud*2) + (ancho*2);
        return perimetro;
    }
}