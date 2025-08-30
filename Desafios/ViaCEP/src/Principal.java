import br.com.alura.modelos.ConsultaCEP;
import br.com.alura.modelos.Endereco;
import br.com.alura.modelos.GeradorArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu CEP: \n");
        String usuario = scanner.nextLine();
        ConsultaCEP consultaCEP = new ConsultaCEP();

        try {
            Endereco novoEndereco = consultaCEP.buscaEndereco(usuario);
            System.out.println(novoEndereco);
            GeradorArquivo gerarArquivo = new GeradorArquivo();
            gerarArquivo.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando o programa.");
        }
    }
}
