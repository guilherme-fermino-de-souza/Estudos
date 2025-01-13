import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrado quadrado = new Quadrado();
		quadrado.lado = 5;
		Circulo circulo= new Circulo();
		circulo.raio = 4;
		
		ArrayList<Forma> listaDeFormas = new ArrayList<>();
		listaDeFormas.add(quadrado);
		listaDeFormas.add(circulo);
		for (Forma item : listaDeFormas) {
			System.out.print("Area: " + item.calcularArea() + "\n");
		}
	}

}
