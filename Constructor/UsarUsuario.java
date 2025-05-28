package Constructor;
import java.util.Scanner;
public class UsarUsuario {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        String apellido,nombre,nombreusuario,contrasenia;
        int documento;
        System.out.println("Ingrese documento");
        documento = lectura.nextInt();
        lectura.nextLine();
        System.out.println("Ingrese apellido");
        apellido = lectura.nextLine();
        System.out.println("Ingrese nombre");
        nombre = lectura.nextLine();
        System.out.println("Ingrese nombre de usuario");
        nombreusuario = lectura.nextLine();
        System.out.println("Ingrese la contraseña");
        contrasenia = lectura.nextLine();
        Usuario instancia1 = new Usuario(apellido, nombre, nombreusuario, documento, contrasenia);
        System.out.println(instancia1.toString());
        System.out.println("Ingrese documento");
        documento = lectura.nextInt();
        lectura.nextLine();
        System.out.println("Ingrese apellido");
        apellido = lectura.nextLine();
        System.out.println("Ingrese nombre");
        nombre = lectura.nextLine();
        System.out.println("Ingrese nombre de usuario");
        nombreusuario = lectura.nextLine();
        System.out.println("Ingrese la contraseña");
        contrasenia = lectura.nextLine();
        Usuario instancia2 = new Usuario();
        instancia2.setDocumento(documento);
        instancia2.setApellido(apellido);
        instancia2.setContrasenia(contrasenia);
        instancia2.setNombre(nombre);
        instancia2.setNombreUsuario(nombreusuario);
        System.out.println(instancia2.toString());
        Usuario vector[] = new Usuario[5];
        for (int i = 0; i<5; i++){
            System.out.println("Ingrese documento");
            documento = lectura.nextInt();
            lectura.nextLine();
            System.out.println("Ingrese apellido");
            apellido = lectura.nextLine();
            System.out.println("Ingrese nombre");
            nombre = lectura.nextLine();
            System.out.println("Ingrese nombre de usuario");
            nombreusuario = lectura.nextLine();
            System.out.println("Ingrese la contraseña");
            contrasenia = lectura.nextLine();
            vector[i] = new Usuario(apellido, nombre, nombreusuario, documento, contrasenia);
            System.out.println("Los datos del usuario son: " + vector[i].toString());
        }
        lectura.close();

    }
}
