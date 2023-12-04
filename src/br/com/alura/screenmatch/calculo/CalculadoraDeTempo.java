package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void incluiTitulo(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }
}
