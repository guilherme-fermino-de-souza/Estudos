import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBancaria conta01 = new ContaBancaria(1, 5450.45);
		ContaBancaria conta02 = new ContaBancaria(2, 16540.75);
		ContaBancaria conta03 = new ContaBancaria(3, 547.87);

		ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();
		listaDeContas.add(conta01);
		listaDeContas.add(conta02);
		listaDeContas.add(conta03);
		
		ContaBancaria contaMaiorSaldo = listaDeContas.get(0); //Instrutor
		for (ContaBancaria conta : listaDeContas) {
			if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
				contaMaiorSaldo = conta;
			}
		}
		
		System.out.println(contaMaiorSaldo.toString() + "\n");
		
		double maior = 0; //Eu
		String contaMaior = "";
		for (ContaBancaria conta : listaDeContas) {
			System.out.println("Conta" + conta.toString());
			if (conta.getSaldo() > maior) {
				maior = conta.getSaldo();
				contaMaior = conta.toString();
			}
		}
		System.out.println("A conta com o maior saldo é a " + contaMaior);

	}

}
