package Constructor.EJERCITACION;
public class Vuelo {
    private String linea;
    private String codigo;
    private Aeropuerto aterriza;
    private Aeropuerto despegue;


    public Vuelo() {
    }


    public Vuelo(String linea, String codigo, Aeropuerto aterriza, Aeropuerto despegue) {
        this.linea = linea;
        this.codigo = codigo;
        this.aterriza = aterriza;
        this.despegue = despegue;
    }


    public String getLinea() {
        return this.linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Aeropuerto getAterriza() {
        return this.aterriza;
    }

    public void setAterriza(Aeropuerto aterriza) {
        this.aterriza = aterriza;
    }

    public Aeropuerto getDespegue() {
        return this.despegue;
    }

    public void setDespegue(Aeropuerto despegue) {
        this.despegue = despegue;
    }

    @Override
    public String toString() {
        return "{" +
            " linea='" + getLinea() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", aterriza='" + getAterriza() + "'" +
            ", despegue='" + getDespegue() + "'" +
            "}";
    }

}
