package Ejercicio1;

import java.util.List;

public class Modelo {
    private String matricula, color;
    private float precio;
    private EstadoAutomovil estado;
    private List<Reserva> reservas;
    private Marca marca;


    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public EstadoAutomovil getEstado() {
        return this.estado;
    }

    public void setEstado(EstadoAutomovil estado) {
        this.estado = estado;
    }

    public List<Reserva> getReservas() {
        return this.reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public Marca getMarca() {
        return this.marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

}
