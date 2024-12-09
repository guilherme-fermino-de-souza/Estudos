package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Filme;

public class Principal {
	public static void main(String [] arg) {
		Filme filme1 = new Filme(); //novo objeto
		filme1.setNome("O Poderoso Chefão");
		filme1.setAnoDeLancamento(1970);
		filme1.setDuracaoEmMinutos(180);
		filme1.setIncluidoNoPlano(true);
		
		filme1.exibeFichaTecnica();
		filme1.avalia(8);
		filme1.avalia(5);
		filme1.avalia(10);		
		System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
		System.out.println("A média das avaliações é: " + filme1.pegaMedia());
	}
}
