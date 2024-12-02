import java.util.Scanner;

public class PrimeiraClasse {
	public static void main(String [] arg) {
		Scanner ler = new Scanner(System.in);
		double mediaAvaliacao = 0;
		double nota= 0;
		
		for (int i = 0; i<3; i++) {
			System.out.println("Diga sua avalição para o filme ");
			nota = ler.nextDouble();
			mediaAvaliacao += nota; 
		}
		
		int mediaInteira =(int) (mediaAvaliacao/3);
		System.out.println("Média: " + mediaInteira);
	}
}
