package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelo.Pessoa;

import java.util.Scanner;
public class Principal {
	public static void main(String [] arg) {
		Scanner ler = new Scanner(System.in);
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Insira Seu Nome ");
		pessoa.setNome(ler.nextLine());
		
		System.out.println("Insira Seu Salário: ");
		pessoa.setSalario (ler.nextInt());
		
		System.out.println("Insira a Data Atual: ");
		pessoa.setDataAtual(ler.nextInt());
		
		System.out.println("Insira Seu Ano de Nascimento: ");
		pessoa.setAnoNascimento(ler.nextInt());
		
		System.out.println("Ano Nascimento: " + pessoa.getAnoNascimento());
		System.out.println("Data Atual: " + pessoa.getDataAtual());
		System.out.println("nome: " + pessoa.getNome());
		System.out.println("salario: " + pessoa.getSalario());
		System.out.println("Idade: " + pessoa.calcularIdade());
	}
}
