package Aula3_2SenhaErroExercicio;

public class SenhaInvalidaException extends RuntimeException{
    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
