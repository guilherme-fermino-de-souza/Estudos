package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.modelo.Titulo;

public class PrincipalComListas {
	public static void main(String [] args) {
		Filme filme1 = new Filme("O Poderoso Chefão", 1970); //novo objeto
		filme1.avalia(9);
		Filme filme2 = new Filme("O Poderoso Chefão 2", 1972); //novo objeto
		filme2.avalia(6);
		var filmeDoPaulo = new Filme("Dogville", 2003); //construtor: método que tem como função a criação de um objeto na memória
		filmeDoPaulo.avalia(10);
		Serie serie = new Serie("lost", 2000);
		serie.avalia(7);
		
		//Filme f1 = filmeDoPaulo; //Variaveis de referência
		
		List<Titulo> lista = new LinkedList<>(); //Armazena filmes
		lista.add(filmeDoPaulo);
		lista.add(filme1);
		lista.add(filme2);
		lista.add(serie);
		lista.forEach(item -> System.out.println(item)); //ForEach
		for (Titulo item : lista) { //Para cada Titulo(item) dentro da lista
			System.out.println(item);
			if (item instanceof Filme filme && filme.getClassificacao() > 2) { //Pergunta e declara variavel
			System.out.println("Classificação: " + filme.getClassificacao());
			}
		}
		
		ArrayList<String> buscaPorArtistas = new ArrayList<>();
		buscaPorArtistas.add("Adam Sandler");
		buscaPorArtistas.add("Paulo");
		buscaPorArtistas.add("Jacqueline");
		
		System.out.println(buscaPorArtistas);
		Collections.sort(buscaPorArtistas); //Ordem alfabetica
		System.out.println("Depois da ordenação");
		System.out.println(buscaPorArtistas);

		Collections.sort(lista);
		System.out.println(lista);
		
		lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
		System.out.println(lista);
		
	}
}
