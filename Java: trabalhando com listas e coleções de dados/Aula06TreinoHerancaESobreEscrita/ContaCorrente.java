package br.com.alura.modelo;
public class ContaCorrente extends ContaBancaria{
	
	public void cobraTarifaMensal(double tarifa, int tempo) {
		setSaldo(getSaldo() - (tarifa * tempo));
	}
}
