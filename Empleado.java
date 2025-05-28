package Constructor.EJERCITACION;

public class Empleado{
    private int codigo;
    private String especialidad;
    public Empleado(){
    }
    public Empleado(int codigo, String especialidad){
        this.codigo = codigo;
        this.especialidad = especialidad;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int c){
        codigo = c;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public void setEspecialidad(String e){
        especialidad = e;
    }
    public String toString(){
        return "El empleado tiene el codigo " + codigo + " y tiene la especialdad " + especialidad + " }";
    }
}