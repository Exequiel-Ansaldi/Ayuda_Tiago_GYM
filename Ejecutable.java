import java.util.Scanner;
public class Ejecutable{
    public static void main (String args[]){
        Scanner lectura = new Scanner(System.in);
        System.out.println("El codigo es ");
        int codigo = lectura.nextInt();
        lectura.nextLine();
        System.out.println("La especialidad es: ");
        String especialidad = lectura.nextLine();
        Empleado instancia1 = new Empleado(codigo,especialidad);
        Empleado instancia2 = new Empleado();
        System.out.println("El codigo es ");
        codigo = lectura.nextInt();
        instancia2.setCodigo(codigo);
        System.out.println("La especialidad es: ");
        lectura.nextLine();
        especialidad = lectura.nextLine();
        instancia2.setEspecialidad(especialidad);
        System.out.println(instancia1.toString());
        System.out.println(instancia2.toString());
        lectura.close();
        
    }
    public static class Empleado{
        private int codigo;
        private String especialidad;
        public Empleado(int cod, String especiali){
            codigo = cod;
            especialidad = especiali; 
        }
        public Empleado(){
           codigo = 0;
           especialidad=" ";
        }

        public void setCodigo(int c){
            codigo = c;
        }
        public void setEspecialidad(String e){
            especialidad = e;
        }
        public int getCodigo(){
            return codigo;
        }
        public String getEspecialidad(){
            return especialidad;
        }
        @Override
        public String toString(){
           return "El codigo es: " + codigo + " y su especialidad es " + especialidad;
        }
    }
}
