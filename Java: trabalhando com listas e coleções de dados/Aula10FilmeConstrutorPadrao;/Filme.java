package br.com.alura.screenmatch.modelo;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel{
	private String diretor;
	
	public Filme(String nome) { //Sem retorno; Nome da classe
		this.setNome(nome);
		// TODO Auto-generated constructor stub
	}

	public String getDiretor() {
		return diretor;
	}
	
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	@Override
	public int getClassificacao() {
		return (int) pegaMedia() / 2;
	}
	
	@Override
	public String toString() {
		return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
	}
}
