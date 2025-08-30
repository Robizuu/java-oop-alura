package br.com.javafy.aplicacao.principal;

import br.com.javafy.aplicacao.modelos.MinhasPreferidas;
import br.com.javafy.aplicacao.modelos.Musicas;
import br.com.javafy.aplicacao.modelos.Podcasts;

public class Principal {
    public static void main(String[] args) {
        Musicas novaMusica = new Musicas();
        Podcasts novoPodcast = new Podcasts();

        novaMusica.setTitulo("Ring Ring Ring");
        novaMusica.setAlbum("DON'T TAP THE GLASS");
        novaMusica.setArtista("Tyler, The Creator");
        novaMusica.setGenero("Hip Hop Alternativo");

        for (int i = 0; i < 1000; i++) {
            novaMusica.reproduzir();
        }

        for (int i = 0; i < 50; i++) {
            novaMusica.curtir();
        }

        novoPodcast.setTitulo("O que é um programa?");
        novoPodcast.setCanal("Ciência Todo Dia");
        novoPodcast.setDescricao("Um podcast sobre o que é, como funciona e como surgiu os programas de computadores.");

        for (int i = 0; i < 5000; i++) {
            novoPodcast.reproduzir();
        }

        for (int i = 0; i < 1000; i++) {
            novoPodcast.curtir();
        }

        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(novaMusica);
        preferidas.inclui(novoPodcast);

    }
}
