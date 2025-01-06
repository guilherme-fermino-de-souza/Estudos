import java.util.ArrayList;

public class Principal {
	public static void main(String [] arg) {
		ArrayList<Produto> listaDeProdutos = new ArrayList<>();
		
		Produto pc = new Produto("PC", 5200, 100);
		Produto notebook = new Produto("Notebook", 3500, 200);
		Produto celular = new Produto("Celular", 1850, 500);
	
		listaDeProdutos.add(pc);
		listaDeProdutos.add(notebook);
		listaDeProdutos.add(celular);
		
		System.out.println("O número de produto é: " + listaDeProdutos.size());
		System.out.println("Primeiro Produto " + listaDeProdutos.get(0).getNome());
		
		for (Produto produto : listaDeProdutos) {
			System.out.println(produto);
		}
		
		ProdutoPerecivel banana = new ProdutoPerecivel("Banana", 3.50, 300, 2024);
		System.out.println(banana);
	}
}
