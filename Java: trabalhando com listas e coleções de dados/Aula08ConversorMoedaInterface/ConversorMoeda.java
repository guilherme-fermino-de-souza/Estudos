public class ConversorMoeda implements ConversaoFinanceira{
	
	public void ConverterDolarParaReal(double valorDolar) {
		double cotacaoDolar = 4.80;
		double valorReais = valorDolar * cotacaoDolar;
		System.out.println("o valor da conversao é igual a R$" + valorReais);
	}

}
