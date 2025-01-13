import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		double precoTotal = 0;
		// TODO Auto-generated method stub
		Produto produto01 = new Produto("Sabonete", 3.55);
		Produto produto02 = new Produto("Desodorante", 7.95);
		Produto produto03 = new Produto("Pasta de dente", 1.25);
		
		ArrayList<Produto> lista = new ArrayList<>();
		lista.add(produto01);
		lista.add(produto02);
		lista.add(produto03);

		for (Produto item : lista) {
			precoTotal += item.getPreco();
		}
		
		System.out.println("Preco médio dos " + lista.size() + " produtos é R$" + precoTotal/lista.size());
	}

}
