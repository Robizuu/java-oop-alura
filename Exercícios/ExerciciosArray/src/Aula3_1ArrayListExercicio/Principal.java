package Aula3_1ArrayListExercicio;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Musicas musicaTyler = new Musicas("Ring Ring Ring", "Tyler, The Creator","DON'T TAP THE GLASS");
        Musicas musicaMfDoom = new Musicas("One Beer","MF DOOM","Mm..Food");

        ArrayList<Musicas> listaMusicas = new ArrayList<>();

        listaMusicas.add(musicaTyler);
        listaMusicas.add(musicaMfDoom);

        for (Musicas musica: listaMusicas) {
            System.out.println(musica);
        }
    }
}
