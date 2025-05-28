package cuatri.Abstractas;

public class Carro extends Vehiculo {
    public Carro( double velocidadpunta){
        super(velocidadpunta);
    }

    public String arrancar(){
        return "Arrancando";
    }

    public String detenerse(){
        return "Frenando";
    }


}
