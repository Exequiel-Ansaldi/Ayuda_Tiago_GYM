public class EjecutableMedicamento {
    public static void main(String[] args) {
        Medicamento m = new Medicamento("Ibuprofeno", "Bayen", "Oral");
        Medicamento.Posologia p = m.new Posologia("Exe", 2, 8, "Mucho agua");
        System.out.println(m.toString());
        System.out.println(p.toString());
    }
}
