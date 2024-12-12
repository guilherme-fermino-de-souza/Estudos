package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Episodio;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;
import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;

public class Principal {
	public static void main(String [] arg) {
		Filme filme1 = new Filme(); //novo objeto
		filme1.setNome("O Poderoso Chefão");
		filme1.setAnoDeLancamento(1970);
		filme1.setDuracaoEmMinutos(180);
		filme1.setIncluidoNoPlano(true);
		System.out.println("Duração do filme: " + filme1.getDuracaoEmMinutos());
		
		filme1.exibeFichaTecnica();
		filme1.avalia(8);
		filme1.avalia(5);
		filme1.avalia(10);		
		System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
		System.out.println("A média das avaliações é: " + filme1.pegaMedia());
		
		Serie serie = new Serie();
		serie.setNome("lost");
		serie.setAnoDeLancamento(2000);
		serie.exibeFichaTecnica();
		serie.setTemporadas(10);
		serie.setEpisodiosPorTemporada(10);
		serie.setMinutosPorEpisodio(50);
		System.out.println("Duração para maratonar Lost: " + serie.getDuracaoEmMinutos() + " minutos");
		
		Filme filme2 = new Filme(); //novo objeto
		filme2.setNome("O Poderoso Chefão 2");
		filme2.setAnoDeLancamento(1972);
		filme2.setDuracaoEmMinutos(80);
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(filme1);
		calculadora.inclui(filme2);
		calculadora.inclui(serie);
		System.out.println(calculadora.getTempoTotal());
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(filme1);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(serie);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);

	}
}
