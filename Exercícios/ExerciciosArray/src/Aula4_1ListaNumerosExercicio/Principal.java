package Aula4_1ListaNumerosExercicio;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();

        lista.add(5);
        lista.add(8);
        lista.add(27);
        lista.add(1);
        lista.add(4);

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);
    }
}
