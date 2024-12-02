import java.util.Scanner;

public class PrimeiraClasse {
	public static void main(String [] arg) {
	Scanner ler = new Scanner(System.in);
	
	System.out.println("Digite seu filme favorito");
	String filme = ler.nextLine();
	System.out.println("Digite o ano de lançamento");
	int anoLancamento = ler.nextInt();
	System.out.println("Nota para o filme");
	double notaFilme = ler.nextDouble();
	
	 
	System.out.println("Seu filme favorito é: " + filme);
	System.out.println("O ano de lançamento filme favorito é: " + anoLancamento);
	System.out.println("A nota do seu filme favorito é: " + notaFilme);
	}
}
