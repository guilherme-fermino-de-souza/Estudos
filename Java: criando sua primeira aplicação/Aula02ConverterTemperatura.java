public class PrimeiraClasse {
	
	public static void main(String[] args) {
		System.out.println("Converta temperatura de Celsius para Fahrenheit.");
		
		double celsius = 37.50;
		double fahrenheit = (celsius * 1.8) + 32;
		
		String mensagem = String.format("A temperatura %f em celsius é igual a %f em Fahrenheit", celsius, fahrenheit);	
		System.out.println(mensagem);
		
		int inteiroFahrenheit = (int) fahrenheit;
		System.out.println("A temperatura inteira em fahrenheit é: " + inteiroFahrenheit);
	}
}
