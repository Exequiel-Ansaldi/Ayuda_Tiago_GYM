public class EjecutableReceta {
    public static void main(String[] args) {
        Receta receta = new Receta("Ravioles", false, true);
        Receta.Ingrediente ingrediente = receta.new Ingrediente("Masa", 12, "cm", "Don yeyo");
        System.out.println(ingrediente.toString() + receta.toString());
    }
}
