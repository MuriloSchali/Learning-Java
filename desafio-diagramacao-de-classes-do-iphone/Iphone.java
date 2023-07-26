public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    @Override
    public void reproduzirMusica(String musica) {
        System.out.println("Reproduzindo " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    @Override
    public void avancarMusica() {
        System.out.println("Avançando para a próxima música");
    }

    @Override
    public void retrocederMusica() {
        System.out.println("Retrocedendo para a música anterior");
    }

    @Override
    public void fazerChamada(String numero) {
        System.out.println("Chamando " + numero);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    @Override
    public void acessarInternet(String url) {
        System.out.println("Acessando " + url);
    }
}
