package Constructor.EJERCITACION;

public class Aeropuerto {
    private String nombre;
    private String ciudad;
    private double superficie;


    public Aeropuerto() {
    }


    public Aeropuerto(String nombre, String ciudad, double superficie) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.superficie = superficie;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getSuperficie() {
        return this.superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }


    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", ciudad='" + getCiudad() + "'" +
            ", superficie='" + getSuperficie() + "'" +
            "}";
    }

}
