import java.util.Random;
import java.util.Scanner;

public class PrimeiraClasse {
	public  static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String nome = "Jacqueline Olíveira";
		String tipoConta ="Corrente";
		double saldo = 2500;
		int opcao = 0;
		String dados = """
				\nOperações
				
				1 - Consultar Saldos
				2 - Receber Valor
				3 - Transferir Valor
				4 - Sair
				
				Digite a opção desejada:
				""";

		System.out.println("********************");
		System.out.println("\nNome: " + nome);
		System.out.println("Tipo Conta: " + tipoConta);
		System.out.println("Saldo: " + saldo);
		System.out.println("\n********************");
		
		while (opcao != 4) {
			System.out.println(dados);
			opcao = ler.nextInt();
			if (opcao == 1) {
				System.out.println("Seu Saldo é: " + saldo);
			} else if (opcao == 2) {
				System.out.println("Inisira o valor que irá receber: ");
				double valorReceber= ler.nextDouble();
				saldo += valorReceber;
				System.out.println("Seu novo saldo é: " + saldo);
			} else if (opcao == 3) {
				System.out.println("Inisira o valor que irá transferir: ");
				double valorTransferir = ler.nextDouble();
				if (valorTransferir > saldo) {
					System.out.println("Você não pode transferir pois seu saldo é insuficiente. ");
				} else {
				saldo -= valorTransferir;
				System.out.println("Seu novo saldo é: " + saldo);
				}
			} else if (opcao == 4) {
				System.out.println("Saindo...");
			} else {
				System.out.println("Numero inválido.");
			}
		}
	}
}
