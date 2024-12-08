import java.util.Scanner;
public class Principal {
	public static void main(String[] arg) {
		Scanner ler = new Scanner(System.in);
		
		Calculadora calculadora = new Calculadora();
		System.out.println("Insira o 1° valor: ");
		calculadora.numero1 = ler.nextDouble();
		System.out.println("Insira o 2° valor: ");
		calculadora.numero2 = ler.nextDouble();
		
		
		System.out.println("Soma: " + calculadora.Soma());
		System.out.println("Subtração: " + calculadora.Subtracao());
		System.out.println("Multiplição: " + calculadora.Multiplicacao());
		System.out.println("Divisão: " + calculadora.Divisao());
		}
}
