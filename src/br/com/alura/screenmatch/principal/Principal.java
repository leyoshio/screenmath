package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.setDuracaoEmMinutos(175);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(9);
        meuFilme.avalia(10);

        System.out.println("Média de avaliações: " + meuFilme.pegaMedia() + " | Total de avaliações: " +
                meuFilme.getTotalDeAvaliacoes());

        Serie lost = new Serie("Lost", 2000);
        lost.setTemporadas(7);
        lost.setEpisodiosPorTemporada(22);
        lost.setMinutosPorEpisodio(45);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalDeVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoLeandro = new Filme("O Senhor dos Anéis - O Retorno do Rei", 2003);
        filmeDoLeandro.setDuracaoEmMinutos(201);
        filmeDoLeandro.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoLeandro);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).toString());
    }
}

