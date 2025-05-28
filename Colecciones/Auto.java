package Colecciones;
public class Auto {
    private String marca;
    private int anio;
    private String modelo;
    private double precio;
    

    public Auto(String marca, int anio, String modelo, double precio) {
        this.marca = marca;
        this.anio = anio;
        this.modelo = modelo;
        this.precio = precio;
    }
    

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnio() {
        return this.anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", anio='" + getAnio() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", precio='" + getPrecio() + "'" +
            "}";
    }


}
