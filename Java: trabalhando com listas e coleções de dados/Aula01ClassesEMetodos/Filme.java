
public class Filme {
	String nome;
	int anoDeLancamento;
	boolean incluidoNoPlano;
	double somaDasAvaliacoes;
	int totalAvaliacoes; 
	int duracaoEmMinutos;
	
	void exibeFichaTecnica() {
		System.out.println("Nome do filme: " + nome);
		System.out.println("Ano de lançamento do filme: " + anoDeLancamento);
		System.out.println("Duração do filme: " +duracaoEmMinutos);
		System.out.println("Incluido no plano: " +incluidoNoPlano);
	}
	
	void avalia(double nota) {
		somaDasAvaliacoes += nota;
		totalAvaliacoes++;
	}
	
	double pegaMedia() {
		return somaDasAvaliacoes/totalAvaliacoes;
	}
}
