package Constructor;
public class Producto {
    private int codigo;
    private String sku;
    private String nombre;
    private String descripcion;
    private String marca;
    private String rubro;
    public Producto(int codi, String sk, String nom, String descri, String marc, String rubr){
        codigo = codi;
        sku = sk;
        nombre = nom;
        descripcion = descri;
        marca = marc;
        rubro = rubr;
    } 
    public Producto(){
        codigo = 0;
        sku = " ";
        nombre = " ";
        descripcion = " ";
        marca = " ";
        rubro = " ";
    }
    public void setCodigo(int c){
        codigo = c;
    }
    public void setSKU(String s){
        sku = s;
    }
    public void setNombre(String n){
        nombre = n;
    }
    public void setDescripcion(String d){
        descripcion = d;
    }
    public void setMarca(String m){
        marca = m;
    }
    public void setRubro(String r){
        rubro = r;
    }
    @Override
    public String toString(){
        return "El codigo es " + codigo + " el sku es " + sku + " el nombre es " + nombre + " su descripcion" + descripcion + " la marca es " + marca + " y el rubro es " + rubro; 
    }
}
