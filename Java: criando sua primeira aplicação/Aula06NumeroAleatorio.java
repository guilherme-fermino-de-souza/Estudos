import java.util.Random;
import java.util.Scanner;

public class PrimeiraClasse {
	public static void main(String [] arg) {
		Scanner ler = new Scanner(System.in);
		int numeroAleatorio = new Random().nextInt(100);
		System.out.println("Jogo de Adivinhação");
		System.out.println("Tente achar o número de 1 a 100");
				
		for (int numTentativas = 1; numTentativas <= 5; numTentativas++) {
			System.out.println(numTentativas +"° tentativa.");
			int numero = ler.nextInt();
			if (numero == numeroAleatorio) {
				System.out.println("Você ganhou!");
				break;
			} else if (numero > numeroAleatorio) {
				System.out.println("Número citado é maior que o gerado");
			} else if (numero < numeroAleatorio) {
				System.out.println("Número citado é menor que o gerado");
			}
			
			if (numTentativas == 5 && numero != numeroAleatorio) {
				System.out.println("Você atingiu o máximo de 5 tentativas");
			}
		}
	}
}
