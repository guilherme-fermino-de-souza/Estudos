import java.util.Scanner;

public class PrimeiraClasse {
	public static void main(String [] arg) {
		Scanner ler = new Scanner(System.in);
		double mediaAvaliacao = 0;
		double nota= 0;
		int totalAvaliacoes = 0;
		
		while (nota != -1) {
			System.out.println("Diga sua avalição para o filme ou -1 para encerrar");
			nota = ler.nextDouble();
			if (nota == -1) {
				break;
			}
			mediaAvaliacao += nota; 
			totalAvaliacoes++;
		}
		
		int mediaInteira =(int) (mediaAvaliacao/totalAvaliacoes);
		System.out.println("Média: " + mediaInteira);
	}
}
