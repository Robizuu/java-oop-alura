package Aula1_3MusicaExercicio;

public class Principal {
    public static void main(String[] args) {
        Musica tylerTheCreator = new Musica();

        tylerTheCreator.titulo = "Like Him";
        tylerTheCreator.artista = "Tyler the Creator";
        tylerTheCreator.anoDeLancamento = 2024;

        tylerTheCreator.exibirFichaTecnica();
        tylerTheCreator.avalia(9);
        tylerTheCreator.avalia(3);
        tylerTheCreator.avalia(7);

        System.out.println(tylerTheCreator.numAvaliacoes);
        System.out.println(tylerTheCreator.avaliacao);
        System.out.println(tylerTheCreator.mediaAvaliacoes());
    }
}
