public class Pelicula {
        private int codigo;
        private String titulo;
        private float precio;
        private String tipo;

        public Pelicula(int codigo, String titulo, float precio, String tipo) {
            this.codigo = codigo;
            this.titulo = titulo;
            this.precio = precio;
            this.tipo = tipo;
        }


    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getPrecio() {
        return this.precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", precio='" + getPrecio() + "'" +
            ", tipo='" + getTipo() + "'" +
            "}";
    }

        
     
}
