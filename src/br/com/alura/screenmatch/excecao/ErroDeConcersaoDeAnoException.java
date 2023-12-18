package br.com.alura.screenmatch.excecao;

public class ErroDeConcersaoDeAnoException extends RuntimeException {

    private String mensagem;

    public ErroDeConcersaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
