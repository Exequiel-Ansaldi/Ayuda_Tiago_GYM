package cuatri.Abstractas;

public class CarroElectrico extends Carro implements Electrico {
    

    public CarroElectrico(double velocidadpunta){
        super(velocidadpunta);
    }

    public String cargarBateria(){
        return "Cargando bateria";
    }


}
