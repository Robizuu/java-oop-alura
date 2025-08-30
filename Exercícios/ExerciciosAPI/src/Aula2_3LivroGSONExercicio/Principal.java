package Aula2_3LivroGSONExercicio;

import com.google.gson.Gson;

public class Principal {
    public static void main(String[] args) {
        Gson gson = new Gson();

        String jsonExemplo = "{\"titulo\":\"Aventuras do Java\",\"autor\":\"Akemi\",\"editora\":{\"nome\":\"TechBooks\",\"cidade\":\"São Paulo\"}}";

        Livro livro = gson.fromJson(jsonExemplo, Livro.class);

        System.out.println(livro);
    }
}
