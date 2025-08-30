package Aula3_2AnimalExercicio;

public class Gato extends Animal{
    public void arranharMoveis() {
        System.out.println(nome + " estava arranhando o sofá.");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " emitia som como:" + " miaaaauuuuu");
    }
}
