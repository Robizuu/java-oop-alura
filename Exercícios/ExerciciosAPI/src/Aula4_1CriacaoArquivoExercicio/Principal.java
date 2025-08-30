package Aula4_1CriacaoArquivoExercicio;

import java.io.FileWriter;
import java.io.IOException;

public class Principal {
    public static void main(String[] args) throws IOException {

        String documento = "Conteúdo a ser gravado no arquivo.";

        try {
            FileWriter arquivo = new FileWriter("arquivo.txt");
            arquivo.write(documento);
            arquivo.close();
            System.out.println("Finalizando com sucesso!");
        } catch (IOException e) {
            System.out.println("Algo deu errado!");
        }
    }
}
