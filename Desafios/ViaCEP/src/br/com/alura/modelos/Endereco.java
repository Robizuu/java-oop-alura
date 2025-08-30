package br.com.alura.modelos;

public record Endereco(String logradouro,
                       String cep,
                       String localidade,
                       String uf,
                       String complemento) {
}
