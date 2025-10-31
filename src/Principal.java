public class Principal {
    public static void main(String[] args) {
        CartaoWeb cartao1 = new DiaDosNamorados("Amanda");
        CartaoWeb cartao2 = new Natal("Carlos");
        CartaoWeb cartao3 = new Aniversario("Julia");

        cartao1.showMessage();
        cartao2.showMessage();
        cartao3.showMessage();
    }
}
