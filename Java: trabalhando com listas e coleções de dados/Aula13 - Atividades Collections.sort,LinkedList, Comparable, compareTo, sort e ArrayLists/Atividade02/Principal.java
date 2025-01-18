import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
	/*Crie uma lista de números inteiros e utilize o método Collections.
	sort para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Titulo> listaTitulos = new ArrayList<>();
		listaTitulos.add(new Titulo("Java"));
		listaTitulos.add(new Titulo("Pythom"));
		listaTitulos.add(new Titulo("C++"));
		listaTitulos.add(new Titulo("PHP"));
		listaTitulos.add(new Titulo("TypeScript"));

		Collections.sort(listaTitulos);
		
		for (Titulo titulo : listaTitulos) {
		System.out.println(titulo.nome);
		}
	}
}
