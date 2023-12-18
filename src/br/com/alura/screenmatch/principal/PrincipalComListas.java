package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {

    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.avalia(9);
        var outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoLeandro = new Filme("O Senhor dos Anéis - O Retorno do Rei", 2003);
        filmeDoLeandro.avalia(10);
        var lost = new Serie("Lost", 2000);
        lost.setTemporadas(7);

        List<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoLeandro);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo titulo: lista) {
            System.out.println(titulo.getNome());
            if (titulo instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            } else if (titulo instanceof Serie serie) {
                System.out.println("Temporadas: " + serie.getTemporadas());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Leonardo DiCaprio");
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Denzel Washington");
        System.out.println("\n"+buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println("\nLista de títulos ordenados por nome:");
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("\nLista de títulos ordenados por ano de lançamento:");
        System.out.println(lista);
    }

}
