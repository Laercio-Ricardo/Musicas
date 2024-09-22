import javax.security.auth.callback.TextInputCallback;

public class Principal {
    public static void main(String[] args) {


        Musicas minhaMusica = new Musicas();
         minhaMusica.nome = "Laércios Songs";
         minhaMusica.artista = "Laércio Ricardo";
         minhaMusica.anoLancamento = 2024;
         minhaMusica.exibeFichaTecnica();
         minhaMusica.avalia(3);
         minhaMusica.avalia(5);
         minhaMusica.avalia(10);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("A média é: " + mediaAvaliacoes);
        }
    }


