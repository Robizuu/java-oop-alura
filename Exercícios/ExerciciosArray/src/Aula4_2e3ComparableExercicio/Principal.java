package Aula4_2e3ComparableExercicio;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        Titulo pessoaGuga = new Titulo();
        Titulo pessoaMiguel = new Titulo();
        Titulo pessoaNatan = new Titulo();
        Titulo pessoaMinhoca = new Titulo();
        Titulo pessoaFelipe = new Titulo();
        Titulo pessoaNicholas = new Titulo();
        Titulo pessoaGabs = new Titulo();
        ArrayList<Titulo> listaChernobyl = new ArrayList<>();


        pessoaGuga.setNome("Guga");
        listaChernobyl.add(pessoaGuga);

        pessoaMiguel.setNome("Miguel");
        listaChernobyl.add(pessoaMiguel);

        pessoaNatan.setNome("Natan");
        listaChernobyl.add(pessoaNatan);

        pessoaMinhoca.setNome("Minhoca");
        listaChernobyl.add(pessoaMinhoca);

        pessoaFelipe.setNome("Felipe");
        listaChernobyl.add(pessoaFelipe);

        pessoaNicholas.setNome("Nicholas");
        listaChernobyl.add(pessoaNicholas);

        pessoaGabs.setNome("Gabs");
        listaChernobyl.add(pessoaGabs);


        Collections.sort(listaChernobyl);

        for (Titulo titulo : listaChernobyl) {
            System.out.println(titulo.getNome());
        }

    }
}
