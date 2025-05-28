/*Crea una clase llamada Articulo que almacene la siguiente información: código de identificación, nombre, precio, y cantidad en stock.
La clase deberá contener los siguientes métodos:
Constructor por defecto que inicialice el código de identificación como vacío (""), el nombre como "Sin nombre", el precio como 0.0, y la cantidad en stock como 0.
Constructor con parámetros para inicializar todos los atributos.
Métodos sets y gets para cada atributo.
Método toString que devuelva una representación en cadena del artículo.
Además, crea una clase Inventario que reciba por parámetro la cantidad de artículos que se deben crear. Genera un arreglo del tamaño recibido y coloca cada instancia en el arreglo. Los valores de los atributos deben ser solicitados al usuario por teclado./* */
package Constructor;
public class Articulo {
    private String identificacion;
    private String nombre;
    private double precio;
    private int cantidad;
    public Articulo(String ide, String nom, double pre, int cant){
        identificacion = ide;
        nombre = nom;
        precio = pre;
        cantidad = cant;
    }
    public Articulo(){
        identificacion = " ";
        nombre = " ";
        precio = 0;
        cantidad= 0;
    }
    public void setIdentificacion(String i){
        identificacion = i;
    }
    public void setNombre(String n){
        nombre = n;
    }
    public void setPrecio (double p){
        precio = p;
    }
    public void setCantidad(int c){
        cantidad = c;
    }
    public String getIdentificacion(){
        return identificacion;
    }
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getCantidad(){
        return cantidad;
    }
    public String toString(){
        return "El codigo del producto es " + identificacion + " el nombre es " + nombre + " su precio es " + precio + " y hay " + cantidad; 
    }
}

