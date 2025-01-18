import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
	/*Crie uma lista de números inteiros e utilize o método Collections.
	sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Titulo> listaPoliformica;
		
		listaPoliformica = new ArrayList<>();
		listaPoliformica.add(new Titulo("C"));
		listaPoliformica.add(new Titulo("B"));
		listaPoliformica.add(new Titulo("A"));
		listaPoliformica.add(new Titulo("E"));
		listaPoliformica.add(new Titulo("D"));
		
		Collections.sort(listaPoliformica);
		System.out.println("ArrayList: " + listaPoliformica);
		for (Titulo titulo01 : listaPoliformica) {
			System.out.println(titulo01.nome);
		}
		
		listaPoliformica = new LinkedList<>();
		listaPoliformica.add(new Titulo("E"));
		listaPoliformica.add(new Titulo("A"));
		listaPoliformica.add(new Titulo("C"));
		listaPoliformica.add(new Titulo("B"));
		listaPoliformica.add(new Titulo("D"));
		
		Collections.sort(listaPoliformica);
		System.out.println("LinkedList: " + listaPoliformica);
		for (Titulo titulos02 : listaPoliformica) {
			System.out.println(titulos02.nome);
		}

	}
}
