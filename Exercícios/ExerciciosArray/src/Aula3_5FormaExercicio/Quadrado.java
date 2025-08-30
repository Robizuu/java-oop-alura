package Aula3_5FormaExercicio;

public class Quadrado implements Forma{
    double lado;

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
