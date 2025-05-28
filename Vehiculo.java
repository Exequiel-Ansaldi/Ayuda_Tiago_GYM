package cuatri.Abstractas;

public abstract class Vehiculo {
    private double velocidadpunta;

    public Vehiculo( double velocidadpunta){
        this.velocidadpunta = velocidadpunta;
    }

    public double getVelocidadPunta(){
        return this.velocidadpunta;
    }

    public void setVelocidadPunta(double velocidadpunta){
        this.velocidadpunta=velocidadpunta;
    }

    public abstract String arrancar();
    public abstract String detenerse();
}
