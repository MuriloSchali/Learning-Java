package src;

public class Main {
    public static void main(String[] args) {
        Iphone IPhone = new Iphone();

        IPhone.reproduzirMusica("Amor I Love You - Marisa Monte");
        IPhone.pausarMusica();
        IPhone.avancarMusica();
        IPhone.retrocederMusica();
        IPhone.fazerChamada("999999999");
        IPhone.enviarMensagem("999999999", "Olá, como você está?");
        IPhone.acessarInternet("www.youtube.com");
    }
}
