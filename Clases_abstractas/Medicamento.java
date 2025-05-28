
public class Medicamento {
    private String nombre;
    private String fabricante;
    private String via;

    public Medicamento(String nombre, String fabricante, String via) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.via = via;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via;
    }

    @Override
    public String toString() {
        return "Medicamento{ " + "nombre= " + nombre + ", fabricante= " + fabricante + ", via= " + via + " } ";
    }
    
    public class Posologia {
    private String usu;
    private double dosis;
    private double periodo;
    private String recomendacion;

        public Posologia(String usu, double dosis, double periodo, String recomendacion) {
            this.usu = usu;
            this.dosis = dosis;
            this.periodo = periodo;
            this.recomendacion = recomendacion;
        }

        public String getUsu() {
            return usu;
        }

        public void setUsu(String usu) {
            this.usu = usu;
        }

        public double getDosis() {
            return dosis;
        }

        public void setDosis(double dosis) {
            this.dosis = dosis;
        }

        public double getPeriodo() {
            return periodo;
        }

        public void setPeriodo(double periodo) {
            this.periodo = periodo;
        }

        public String getRecomendacion() {
            return recomendacion;
        }

        public void setRecomendacion(String recomendacion) {
            this.recomendacion = recomendacion;
        }

        @Override
        public String toString() {
            return "Posologia{ " + "usu= " + usu + ", dosis= " + dosis + ", periodo= " + periodo + ", recomendacion= " + recomendacion + "}";
        }
        
    }
}