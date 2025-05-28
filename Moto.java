package cuatri.Abstractas;

public class Moto extends Vehiculo {

    public Moto(double velocidadpunta){
        super(velocidadpunta);
    }

    public String arrancar(){
        return "Arrancando en moto";
    }

    public String detenerse(){
        return "Frenando en moto";
    }
}
