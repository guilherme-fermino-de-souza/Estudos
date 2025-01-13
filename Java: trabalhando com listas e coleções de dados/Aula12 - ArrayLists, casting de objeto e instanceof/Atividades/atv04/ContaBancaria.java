
public class ContaBancaria {
	private int numeroDaConta;
	private double saldo;
	
	public ContaBancaria(int numeroDaConta, double saldo) {
		this.setNumeroDaConta(numeroDaConta);
		this.setSaldo(saldo);
	}
	
	public void setNumeroDaConta (int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}
	
	public void setSaldo (double saldo) {
		this.saldo = saldo;
	}
	
	public int getNumeroDaConta() {
		return this.numeroDaConta;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String toString() {
		return "Número: " + this.getNumeroDaConta() + " Saldo: " + this.getSaldo();
	}
}
