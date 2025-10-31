public class Natal extends CartaoWeb {

    public Natal(String destinatario) {
        super(destinatario);
    }

    @Override
    public void showMessage() {
        System.out.println("🎅 Feliz Natal, " + destinatario + "! Que seu Natal seja repleto de alegria e amor! 🎁");
    }
}
