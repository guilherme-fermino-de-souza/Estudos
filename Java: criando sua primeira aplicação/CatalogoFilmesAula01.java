public class PrimeiraClasse {
	public static void main(String[] args) {
		System.out.println("Esse é o Sreen Match");
		
		System.out.println("Filme: Top Gun Maverick");
		
		int anoDeLancamento = 2022;	
		System.out.println("Ano de Lançamento: " + anoDeLancamento);
		boolean incluidoNoPlano = true;
		double notaDoFilme = 8.1;	
		
		double media = (9.8 + 6.3 + notaDoFilme) /3;
		System.out.println("Media: " + media);
		String sinopse;
		sinopse = """
				Filme Top Gun
				Filme de aventura com galã dos anos 80
				Muito bom!
				Ano de lançamento	
				""" + anoDeLancamento;
		
		System.out.println(sinopse);
		
		int classificacao = (int) (media/2);
		System.out.println("Nota média de 2: " + classificacao);
		
	}
}
