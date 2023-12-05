package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

/*  public void incluiTitulo(Filme f) {
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void incluiTitulo(Serie s) {
        tempoTotal += s.getDuracaoEmMinutos();
    }*/

    public void inclui(Titulo titulo) {
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

}
