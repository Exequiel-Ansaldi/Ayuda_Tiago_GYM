package Constructor;
public class Usuario {
    private String apellido;
    private String nombre;
    private String nombreusuario;
    private int documento;
    private String contrasenia;
    public Usuario(String ape, String nom, String nomusu, int docu, String contra){
        apellido = ape;
        nombre = nom;
        nombreusuario = nomusu;
        documento = docu;
        contrasenia = contra;
    }
    public Usuario(){
        apellido = " ";
        nombre = " ";
        nombreusuario = " ";
        documento = 0;
        contrasenia = " ";
    }
    public void setApellido(String a){
        apellido = a;
    }
    public void setNombre(String n){
        nombre = n;
    }
    public void setNombreUsuario(String nu){
        nombreusuario = nu;
    }
    public void setDocumento(int d){
        documento = d;
    }
    public void setContrasenia(String c){
        contrasenia = c;
    }
    public String getApellido(){
        return apellido;
    }
    public String getNombre(){
        return nombre;
    }
    public String getNombreUsuario(){
        return nombreusuario;
    }
    public int getDocumento(){
        return documento;
    }
    public String getContrasenia(){
        return contrasenia;
    }
    @Override
    public String toString(){
        return "El nombre de usuario es " + nombreusuario + " El titular es " + apellido + " " + nombre + " "+ "DNI: " + documento +  " y Su contraseña es " + contrasenia; 
    }
}
