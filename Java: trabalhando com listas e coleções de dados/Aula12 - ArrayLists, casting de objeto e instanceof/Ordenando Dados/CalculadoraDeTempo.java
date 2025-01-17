package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelo.Titulo;

public class CalculadoraDeTempo {
	private int tempoTotal;

	public int getTempoTotal() {
		return tempoTotal;
	}
	
//	public void inclui(Filme filme) { ctrl + /
//		tempoTotal += filme.getDuracaoEmMinutos();
//	}
//	
//	public void inclui(Serie serie) { // Sobrecarga
//		tempoTotal += serie.getDuracaoEmMinutos();
//	}
	//Ctrl + alt + O = importa automaticamente
	public void inclui(Titulo titulo) { //Se refere a todas as subclasses
		System.out.println("Adicionando duração em minutos de " + titulo);
		tempoTotal += titulo.getDuracaoEmMinutos();
	}

}
