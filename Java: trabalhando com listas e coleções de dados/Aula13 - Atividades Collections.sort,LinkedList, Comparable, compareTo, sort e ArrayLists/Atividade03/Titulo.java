
public class Titulo implements Comparable<Titulo>{
	String nome;
	
	public Titulo(String nome) {
		this.nome = nome;
	}

	@Override
	public int compareTo(Titulo outroTitulo) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(outroTitulo.nome);
	}

}
