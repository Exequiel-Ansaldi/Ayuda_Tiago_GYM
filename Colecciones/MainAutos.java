package Colecciones;
import java.util.*;
public class MainAutos {
    public static Auto buscarAutoPorModelo(ArrayList<Auto> autos1, String modeloBuscado) {
        for (Auto auto : autos1) {
            if (auto.getModelo().equals(modeloBuscado)) {
                return auto; 
            }
        }
        return null;
    }
    
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        ArrayList<Auto> autos = new ArrayList<>();
        String marca, modelo;
        int anio;
        double precio;

        while (true) {
        System.out.println("Ingrese el precio");
        precio = lectura.nextDouble();
        System.out.println("Ingrese la marca");
        marca = lectura.nextLine();
        System.out.println("Ingrese el modelo");
        modelo = lectura.nextLine();

        if (modelo.isEmpty()){
            break;
        }

        System.out.println("Ingrese el anio");
        anio = lectura.nextInt();
        Auto auto = new Auto(marca, anio, modelo, precio);
        autos.add(auto);
        }

        for (Auto auto : autos){
            System.out.println(auto);
        }


        double recaudacion = 0;
        for (Auto auto : autos){
            recaudacion += auto.getPrecio();
            autos.size();
        }
        double promedio = recaudacion/autos.size();
        System.out.println("El promedio de precio de ventas es: " + promedio);
        System.out.println("Ingrese el modelo a buscar: ");
        modelo = lectura.nextLine();
        Auto autobuscado = buscarAutoPorModelo(autos, modelo);
        System.out.println(autobuscado.toString());

        lectura.close();
    }
}