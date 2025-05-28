package Algoritmos;

public class Reserva {
    private String fechadesde, fechahasta;
    private Cliente cliente;
    private Agencia agencia;
    private Modelo modelo;


    public String getFechadesde() {
        return this.fechadesde;
    }

    public void setFechadesde(String fechadesde) {
        this.fechadesde = fechadesde;
    }

    public String getFechahasta() {
        return this.fechahasta;
    }

    public void setFechahasta(String fechahasta) {
        this.fechahasta = fechahasta;
    }

    public Cliente getCliente() {
        return this.cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Agencia getAgencia() {
        return this.agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Modelo getModelo() {
        return this.modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

}
