public class Audio { //SuperClasse
	private String titulo;
	private double duracao;
	private int totalDeReproducao;
	private int curtidas;
	private int classificacao;
	//Getters e Setters
	public String getTitulo() { //Título
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public double getDuracao() { //Duração
		return duracao;
	}
	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}
	public int getTotalDeReproducao() { //Total de Reproduções
		return totalDeReproducao;
	}
	public int getCurtidas() { //Curtidas
		return curtidas;
	}
	public int getClassificacao() { //Classificação
		return classificacao;
	}
	
	public void Curtir() {
		curtidas++;
		System.out.println("Você curtiu " + getTitulo() + "!");
	}
	
	public void Reproduzir() {
		totalDeReproducao++;
		System.out.println("Você reproduziu " + getTitulo() + " com sucesso");
	}
	
}
