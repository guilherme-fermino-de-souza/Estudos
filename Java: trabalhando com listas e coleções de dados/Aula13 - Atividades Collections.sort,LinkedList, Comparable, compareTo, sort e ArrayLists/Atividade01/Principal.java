import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
	/*Crie uma lista de números inteiros e utilize o método Collections.
	sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> listaNumerosInteiros = new ArrayList<>();
		listaNumerosInteiros.add(1);
		listaNumerosInteiros.add(4);
		listaNumerosInteiros.add(5);
		listaNumerosInteiros.add(2);
		listaNumerosInteiros.add(3);
		
		System.out.println("Pós organização: " + listaNumerosInteiros);
		Collections.sort(listaNumerosInteiros);
		System.out.println("Após organização: " + listaNumerosInteiros);
	}
}
