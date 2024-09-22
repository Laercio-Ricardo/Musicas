public class Musicas {

    String nome;
    String artista;
    int anoLancamento;
    double somaDasavaliacoes;
    int numAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("A música de sucesso tocada hoje foi: " + nome);
        System.out.println("Essa sucesso pertence ao: " + artista);
        System.out.println("Foi lançada em: " + anoLancamento);
    }
        void avalia(double nota) {
            somaDasavaliacoes += nota;
            numAvaliacoes ++;
     }

         double pegaMedia(){
         return somaDasavaliacoes / numAvaliacoes;

        }
    }
