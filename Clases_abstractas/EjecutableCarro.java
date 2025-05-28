package cuatri.Abstractas;

public class EjecutableCarro {
    public static void main(String[] args) {
        Vehiculo arreglo[] = new Vehiculo[3];
        arreglo[0] = new Carro(150);
        arreglo[1] = new Moto(115);
        arreglo[2] = new CarroElectrico(70);
        for (Vehiculo vehiculo : arreglo) {
            System.out.println(vehiculo.arrancar() + " " + vehiculo.detenerse());
            if (vehiculo instanceof CarroElectrico) {
                System.out.println(((CarroElectrico) vehiculo).cargarBateria());
            }
        }
    }   
}