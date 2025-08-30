package Aula3_1ArrayListExercicio;

public class Musicas {
    private String nomeMusica;
    private String artista;
    private String album;

    public Musicas(String nome, String artista, String album) {
        this.nomeMusica = nome;
        this.artista = artista;
        this.album = album;
    }

    @Override
    public String toString() {
        return "Nome da música:" + nomeMusica + " Artista:" + artista + " Albúm:" + album;
    }
}
