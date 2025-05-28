package Algoritmos;
public class MatrizCaracteres {
    public static void main(String[] args) {
       String matriz[][] = {{"a","b","c"}, {"d","e","f","sd"}};
       String matriz2[][] = {{"z","x","y"}, {"h","i"}};
       String matriz3[][] = {{"v","r"}, {"w","t","8"}};
       String matriz4[][] = {{"x", "p"}, {"g"}};
       MatrizCaracteres matrices = new MatrizCaracteres();
       System.out.println("Matriz 1 es cuadrada: " + matrices.calcularMatrizCuadrada(matriz));
       System.out.println("Matriz 2 es cuadrada: " + matrices.calcularMatrizCuadrada(matriz2));
       System.out.println("Matriz 3 es cuadrada: " + matrices.calcularMatrizCuadrada(matriz3));
       System.out.println("Matriz 4 es cuadrada: " + matrices.calcularMatrizCuadrada(matriz4));     
    }
    public boolean calcularMatrizCuadrada(String matriz[][]){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i<filas; i++){
            if (matriz[i].length != columnas) {
                return false;
            }
        }
        return true;
    }
}
                