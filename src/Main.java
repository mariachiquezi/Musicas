import br.com.alura.musicas.models.Musica;
import br.com.alura.musicas.models.Podcast;
import br.com.alura.musicas.models.Preferidas;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.setTitulo("Video Games");
        musica.setArtista("Lana Del Rey");

        // simular curtidas e reproduções
        for (int i = 0; i<2000; i++){
            musica.reproducao();
        }
        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }


        Podcast podcast = new Podcast();
        podcast.setTitulo("Baleias");
        podcast.setHost("Maria");
        podcast.setDescricao("A vida das baleias");

        for (int i = 0; i<300; i++){
            musica.reproducao();
        }
        for (int i = 0; i < 50; i++) {
            musica.curtir();
        }

        Preferidas preferidas = new Preferidas();
        preferidas.inclui(podcast);
        preferidas.inclui(musica);
    }
}