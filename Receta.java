public class Receta {
    private String nombre;
    private boolean celiaco;
    private boolean veganos;


    public Receta() {
    }
    

    public Receta(String nombre, boolean celiaco, boolean veganos) {
        this.nombre = nombre;
        this.celiaco = celiaco;
        this.veganos = veganos;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCeliaco() {
        return this.celiaco;
    }

    public boolean getCeliaco() {
        return this.celiaco;
    }

    public void setCeliaco(boolean celiaco) {
        this.celiaco = celiaco;
    }

    public boolean isVeganos() {
        return this.veganos;
    }

    public boolean getVeganos() {
        return this.veganos;
    }

    public void setVeganos(boolean veganos) {
        this.veganos = veganos;
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", celiaco='" + isCeliaco() + "'" +
            ", veganos='" + isVeganos() + "'" +
            "}";
    }


    public class Ingrediente{
        private String nombrei;
        private int cantidad;
        private String unidad;
        private String proovedor;

        public Ingrediente(String nombrei, int cantidad, String unidad, String proovedor){
            this.cantidad = cantidad;
            this.nombrei = nombrei;
            this.proovedor = proovedor;
            this.unidad = unidad;
        }
        
        public String getNombrei(){
            return this.nombrei;
        }
        public void setNombrei(String nombrei){
            this.nombrei = nombrei;
        }

        public int getCantidad(){
            return this.cantidad;
        }
        public void setCantidad(int cantidad){
            this.cantidad = cantidad;
        }

        public String getUnidad(){
            return this.unidad;
        }
        public void setUnidad(String unidad){
            this.unidad = unidad;
        }

        public String getProveedor(){
            return this.proovedor;
        }
        public void setProveedor(String proveedor){
            this.proovedor = proveedor;
        }

        public String toString(){
            return "Informacion de la receta: " + "Nombre: " + getNombre() + " " + "Cantidad: " + getCantidad()+
            " " + "Unidad: " + getUnidad();
        }


    }
    
    
}
