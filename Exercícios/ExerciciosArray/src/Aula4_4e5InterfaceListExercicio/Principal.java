package Aula4_4e5InterfaceListExercicio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Nomes pessoaGuga = new Nomes("Gustavo");
        Nomes pessoaRobizu = new Nomes("Robizu");
        Nomes pessoaMiguel  = new Nomes("Miguel");

        List<String> listaPolimorfica;

        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Gustavo");
        listaPolimorfica.add("Miguel");
        listaPolimorfica.add("Robizu");
        System.out.println("Array List " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Nicholas");
        listaPolimorfica.add("Natan");
        listaPolimorfica.add("Gabs");
        System.out.println("Linked List " + listaPolimorfica);
    }
}
