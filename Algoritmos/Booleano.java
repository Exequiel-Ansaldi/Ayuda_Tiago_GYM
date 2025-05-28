package Algoritmos;

public class Booleano {
    public static void main(String[] args) {
    boolean b = false;
    boolean a = false;
    a = a || b;
    b = a && !b;
    System.out.println(a + " " + b);
    }
}
