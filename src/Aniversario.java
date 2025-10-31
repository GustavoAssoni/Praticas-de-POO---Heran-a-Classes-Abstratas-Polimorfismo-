public class Aniversario extends CartaoWeb {

    public Aniversario(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("🎉 Feliz Aniversário, " + destinatario + "! Desejo muitas felicidades e sucesso! 🎂");
    }
}
