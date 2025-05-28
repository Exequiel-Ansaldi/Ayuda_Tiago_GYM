public class PeliculaPremiada {
    String titulo;
    String premiobtenido;


    public PeliculaPremiada(String titulo, String premiobtenido) {
        this.titulo = titulo;
        this.premiobtenido = premiobtenido;
    }


    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPremiobtenido() {
        return this.premiobtenido;
    }

    public void setPremiobtenido(String premiobtenido) {
        this.premiobtenido = premiobtenido;
    }

    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", premiobtenido='" + getPremiobtenido() + "'" +
            "}";
    }

}
