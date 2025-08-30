package br.com.javafy.aplicacao.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if (audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo() + " é a moda do momento!");
        } else {
            System.out.println(audio.getTitulo() + " é uma das mais curtidas!");
        }
    }
}
