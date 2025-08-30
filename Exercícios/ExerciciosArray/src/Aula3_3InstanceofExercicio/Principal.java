package Aula3_3InstanceofExercicio;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Animal animal = new Cachorro();

        animal.setNome("Gatão");
        animal.setIdade(2);

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}
