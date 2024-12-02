public class PrimeiraClasse {
	public static void main(String [] arg) {
		
		int anoDeLancamento = 2022;
		boolean incluidoNoPlano = true;
		double notaDoFilme = 8.1;
		String tipoPlano = "normal";
		
		if (anoDeLancamento >= 2020) {
			System.out.println("Lançamento");
		} else {
			System.out.println("Filme retrô");
		}
		
		if (incluidoNoPlano == true && tipoPlano.equalsIgnoreCase("plus")) {
			System.out.println("Filme liberado");
		} else {
			System.out.println("gimme money");
		}
		
	}
}
