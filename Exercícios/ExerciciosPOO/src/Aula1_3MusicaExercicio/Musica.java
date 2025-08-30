package Aula1_3MusicaExercicio;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibirFichaTecnica() {
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoDeLancamento);
    }

    void avalia(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }

    double mediaAvaliacoes() {
        return avaliacao / numAvaliacoes;
    }




}
