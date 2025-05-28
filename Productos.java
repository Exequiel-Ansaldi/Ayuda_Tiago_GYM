import java.util.Scanner;
public class Productos{
    private Producto arreglo; 
    public static void main (String args[]){
        Scanner lect = new Scanner(System.in);
        int instancia = lect.nextInt();
        Producto instancias = new Producto();
        instancias.crearInstancia(instancia);
        instancias.mostrarProductos();
        
    }
    public void crearInstancia(int instancia){
        Scanner lectura = new Scanner(System.in);
        arreglo = arreglo[instancia];
        for( int i = 0; i<arreglo.length;i++){
            System.out.println("Ingrese el codigo");
            int codigo = lectura.nextInt();
            lectura.nextLine();
            System.out.println("Ingrese sku: ");
            String sku = lectura.nextLine();
            System.out.println("Ingrese nombre");
            String nombre = lectura.nextLine();
            System.out.println("Ingrese descripcion");
            String descripcion = lectura.nextLine();
            System.out.println("Ingrese rubro");
            String rubro = lectura.nextLine();
            System.out.println("Ingrese la marca");
            String marca = lectura.nextLine();
            arreglo[i] = new Producto(codigo, sku, nombre, descripcion, rubro, marca);
        }
    }
    public void mostrarProductos(){
        for (int i = 0; i<arreglo.length; i++){
            System.out.println("Productos y sus caracteristicas " + arreglo[i]);
        }
    }
}   
public class Producto {
    private int codigo;
    private String sku;
    private String nombre;
    private String descripcion;
    private String rubro;
    private String marca; 

 public Producto(int codigo, String sku, String nombre, String descripcion, String rubro, String marca){
    this.codigo = codigo;
    this.sku = sku;
    this.descripcion=descripcion;
    this.rubro= rubro;
    this.marca=marca;
    }
 public void mostrarProductos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'mostrarProductos'");
}
public void crearInstancia(int instancia) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'crearInstancia'");
}
public Producto(){
    codigo = 0;
    sku = " ";
    descripcion = " ";
    rubro = " ";
    marca = " ";
    }
    public void setCodigo(int c){
        codigo=c;
    }
    public void setSku(String s){
        sku = s;
    } 
    public void setNombre(String n){
        nombre = n;
    }
    public void setDescripcion(String d ){
        descripcion=d;
    }  
    public void setRubro(String r){
        rubro=r;
    }
    public void setMarca(String m){
        marca=m;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getSku(){
        return sku;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
    return descripcion;
    }
    public String getRubro(){
        return rubro;
    }
    public String getMarca(){
        return marca;
    }
    @Override
    public String toString(){
        return "Producto{" + "codigo: " + codigo + " SKU: " + sku + " Nombre: " + nombre + " Descripcion: " + descripcion +  " Rubro: " + rubro + "}";
    }
}

