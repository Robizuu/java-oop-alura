package Aula4_3PrettyExercicio;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Principal {
    public static void main(String[] args) {
        Titulo mfDoom = new Titulo("Lavender Buds","Special Herbs","MF DOOM");

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(mfDoom);

        System.out.println(json);
    }
}
