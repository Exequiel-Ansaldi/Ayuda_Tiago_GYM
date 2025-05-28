package cuatri.Abstractas;

public class Senador extends Legislador {
    public Senador(String nombre, int edad,String provinciaQueRepresenta) {
        super(nombre,edad, provinciaQueRepresenta);
    }
    @Override
    public String toString() {
        return "{" +  getProvinciaQueRepresenta()+ " " + getEdad() + " " + getNombre()+
            " }";
    }
    public String getCamaraQueTrabaja(){
        return "Camara de Senadores";
    }

}
