package Constructor;
import java.util.Scanner;
public class Inventario {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de productos");
        int instancias = lectura.nextInt();
        lectura.nextLine();
        Articulo vector[] = new Articulo[instancias];
        for (int i = 0 ; i<vector.length ; i++){
            System.out.println("Ingrese el codigo de identificacion");
            String identificacion = lectura.nextLine();
            System.out.println("Ingrese el nombre");
            String nombre = lectura.nextLine();
            System.out.println("Ingrese el precio");
            double precio = lectura.nextDouble();
            System.out.println("Ingrese la cantidad en stock");
            int cantidad = lectura.nextInt();
            vector[i] = new Articulo();
            vector[i].setCantidad(cantidad);
            vector[i].setIdentificacion(identificacion);
            vector[i].setNombre(nombre);
            vector[i].setPrecio(precio);
            System.out.println(vector[i].getCantidad() + vector[i].getNombre() + vector[i].getPrecio() + vector[i].getCantidad());
            System.out.println(vector[i].toString());

        }
    }
}
