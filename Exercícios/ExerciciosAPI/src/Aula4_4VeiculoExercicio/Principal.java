package Aula4_4VeiculoExercicio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Volkswagen","Golf GTI",2025,350000);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        String json = gson.toJson(veiculo);

        System.out.println(json);
    }
}
