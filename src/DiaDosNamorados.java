public class DiaDosNamorados extends CartaoWeb {

    public DiaDosNamorados(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("💖 Feliz Dia dos Namorados, " + destinatario + "! 💖");
    }
}
