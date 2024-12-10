package br.com.alura.screenmatch.modelo;

public class Pessoa {
	
	private String nome; 
	private int anoNascimento;
	private double salario;
	private int dataAtual;
	
	public String getNome() {
		return nome;
	}	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setDataAtual(int dataAtual) {
		this.dataAtual = dataAtual;
	}
	public int getDataAtual() {
		return dataAtual;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public int calcularIdade() {
		int idade = dataAtual - anoNascimento;
		return idade;
	}
}
