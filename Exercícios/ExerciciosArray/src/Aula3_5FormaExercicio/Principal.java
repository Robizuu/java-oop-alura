package Aula3_5FormaExercicio;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        circulo.raio = 5;

        Quadrado quadrado = new Quadrado();
        quadrado.lado = 4;

        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(quadrado);

        for (Forma forma : listaDeFormas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
