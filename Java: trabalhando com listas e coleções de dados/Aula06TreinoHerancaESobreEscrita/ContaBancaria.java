package br.com.alura.modelo;

public class ContaBancaria {
	private String nome;
	private double saldo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void Depositar(double valor) {
		saldo += valor;
	}
	
	public void Sacar(double valor) {
		saldo -= valor;
	}
	
	public void ConsultarSaldo() {
		System.out.println("Seu Saldo é de R$" + getSaldo());
	}

}
