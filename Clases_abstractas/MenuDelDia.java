package cuatri.Abstractas;

public class MenuDelDia extends Entrada implements Postre, PlatoPrincipal{
    public static void main(String[] args) {
        public void PedirAgua() {
            super.PedirAgua();
        }
        public void PedirPan(){
            super.PedirPan();
        }
        public void PedirVino(){
            System.out.println("Vino, por favor");
        }
        public void PedirDulce(){
            System.out.println("Helado, por favor");
        }
        public void PedirSalado(){
            System.out.println("Papas fritas, por favor");
        }
    }
}
