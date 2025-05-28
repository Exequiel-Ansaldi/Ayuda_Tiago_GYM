package Constructor;

import java.util.Scanner;
public class Instancia{
    
    public static void main(String args[]){
        Scanner lectura = new Scanner(System.in);
        Cuenta instancia1 = new Cuenta();
        String titular = lectura.nextLine();
        lectura.nextLine();
        int cantidad = lectura.nextInt();
        Cuenta instancia2 = new Cuenta(titular, cantidad);
        System.out.println(instancia2.toString());
        titular = lectura.nextLine();
        lectura.nextLine();
        cantidad = lectura.nextInt();
        instancia1.setCantidad(cantidad);
        instancia1.setTitular(titular);
        System.out.println(instancia1.toString());
         
    }
    public static class Cuenta{
        private String titular;
        private int cantidad;
        public Cuenta(String tit, int cant){
            titular=tit;
            cantidad = cant;
        }
    public Cuenta(){
        cantidad = 0;
        titular = " ";
    }
    public void setCantidad(int c){
        cantidad = c;
    }
    public void setTitular(String t){
        titular = t;
    }
    public int getCantidad(){
        return cantidad;
    }
    public String getTitular(){
        return titular;
    }
    @Override
    public String toString(){
        return "La cantidad es " + cantidad + " su Titular es " + titular;
    }
}
}
