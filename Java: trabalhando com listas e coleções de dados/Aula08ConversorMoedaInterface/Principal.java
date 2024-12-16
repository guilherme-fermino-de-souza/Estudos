import java.util.Scanner;
public class Principal {
 public static void main(String [] arg) {
	 Scanner ler = new Scanner(System.in);
	 ConversorMoeda conversorMoeda = new ConversorMoeda();
	 System.out.println("Insira o valor em dolar que você deseja converter");
	 conversorMoeda.ConverterDolarParaReal(ler.nextDouble());
 }
}
