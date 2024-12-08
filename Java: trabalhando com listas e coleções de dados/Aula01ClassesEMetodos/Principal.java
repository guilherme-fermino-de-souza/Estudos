public class Principal {
	public static void main(String [] arg) {
		Filme filme1 = new Filme(); //novo objeto
		filme1.nome = "O Poderoso Chefão";
		filme1.anoDeLancamento = 1970;
		filme1.duracaoEmMinutos = 180;
		filme1.incluidoNoPlano = true;
		
		filme1.exibeFichaTecnica();
		filme1.avalia(8);
		filme1.avalia(5);
		filme1.avalia(10);		
		System.out.println(filme1.somaDasAvaliacoes);
		System.out.println(filme1.totalAvaliacoes);
		System.out.println("A média das avaliações é: " + filme1.pegaMedia());
	}
}
