package Aula4_4ConversorTemperaturaExercicio;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    @Override
    public void celsiusParaFahrenheit(double temperaturaCelsius) {
        double resultadoConversao = (temperaturaCelsius * 9 / 5) + 32;
        System.out.println("O resultado da conversão Fahrenheit é: " + resultadoConversao);
    }

    @Override
    public void fahrenheitParaCelsius(double temperaturaFahrenheit) {
        double resultadoConversao = (temperaturaFahrenheit - 32) * 5 / 9;
        System.out.println("O resultado da conversão Celsius é: " + resultadoConversao);
    }
}
