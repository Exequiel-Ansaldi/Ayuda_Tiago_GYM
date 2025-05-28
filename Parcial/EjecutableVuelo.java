package Parcial;

public class EjecutableVuelo {
    public static void main(String[] args) {
    Aeropuerto a1aterriza = new Aeropuerto("Garden", "NY", 12376);
    Aeropuerto a1despegue = new Aeropuerto("Ezeiza", "BS AS", 1267367);
    Vuelo v1 = new Vuelo("Flybondi", "ASGF34", a1aterriza, a1despegue);
    System.out.println(v1.toString());
    }
}
