package br.com.alura.modelo;
import java.util.Scanner;

public class Principal {
	public static void main(String [] arg) {
		Scanner ler = new Scanner(System.in);
		ContaCorrente corrente = new ContaCorrente();
		String operacoes = """
				\nOperações
				
				1 - Depositar
				2 - Sacar
				3 - Consultar Saldo
				4 - Tarifa Mensal
				5 - Sair
				
				Insira um valor:
				""";
		
		System.out.println("Insira o seu nome: ");
		corrente.setNome(ler.nextLine());
		System.out.println("Insira o seu saldo atual: ");
		corrente.setSaldo(ler.nextDouble());
		
		
		for (int n=0; n<1;) {
			System.out.println(operacoes);
			int opcao = ler.nextInt();
			if (opcao == 1) {
				System.out.println("Insira o valor a ser depositado na conta");
				double deposito = ler.nextDouble();
				corrente.Depositar(deposito);
			} else if (opcao == 2) {
				System.out.println("Insira o valor a ser sacado da conta");
				double saque = ler.nextDouble();
				if (saque<=corrente.getSaldo()) {
					corrente.Sacar(saque);
				} else {
					System.out.println("Saldo insuficiente");
				}	
			} else if (opcao == 3) {
				System.out.println(corrente.getNome() + " possui um saldo atual de R$" + corrente.getSaldo());
			} else if (opcao == 4) {
				System.out.println("Insira o valor cobrado mensalmente");
				double valorCobrado = ler.nextDouble();
				System.out.println("Insira a quantidade de meses");
				int meses = ler.nextInt();
				corrente.cobraTarifaMensal(valorCobrado, meses);
			} else if (opcao == 5) {
				System.out.println("Saindo...");
				n = 1;
			} else {
				System.out.println("Número Inválido!");
			}
		}
	}	
}
