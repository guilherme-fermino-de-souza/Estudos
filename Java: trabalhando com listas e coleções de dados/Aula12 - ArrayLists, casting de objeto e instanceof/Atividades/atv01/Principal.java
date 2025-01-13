import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro cachorro = new Cachorro("Rex");
		Animal animal = (Animal) cachorro; //Casting/ Fundição
		
		ArrayList<Animal> lista = new ArrayList<>();
		lista.add(cachorro);
		lista.add(animal);
		for (Animal item : lista) {
			if (item instanceof Cachorro) {
				System.out.println(item);
			}
		}
		lista.forEach(item -> System.out.println(item));

	}

}
