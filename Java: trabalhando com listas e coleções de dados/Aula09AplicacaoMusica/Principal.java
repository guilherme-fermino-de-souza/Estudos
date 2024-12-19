import java.util.Scanner;
public class Principal {
	public static void main(String [] arg) {
		Scanner ler = new Scanner(System.in);
		String descricao = """
				1 - Curtir
				2 - Reproduzir
				3 - Ver Dados
				4 - Sair
				\n
				""";
		
		Musica musica = new Musica();
		System.out.println("Insira o Nome do artista");
		musica.setArtista(ler.nextLine());
		System.out.println("Insira o Título do album");
		musica.setAlbum(ler.nextLine());
		System.out.println("Insira o Título da música");
		musica.setTitulo(ler.nextLine());
		System.out.println("Insira o Gênero da música");
		musica.setGenero(ler.nextLine());
		System.out.println("Insira a Duração da música");
		musica.setDuracao(ler.nextDouble());
		
		for (int i = 0; i < 2001; i++) {
			musica.Reproduzir();
		}
		
		for (int i = 0; i == 0;) {
			System.out.println(descricao);
			int n = ler.nextInt();
			if (n == 1) {
				musica.Curtir();
			} else if (n == 2) {
				musica.Reproduzir();
			} else if (n == 3) {
				System.out.println("Artista " + musica.getArtista());
				System.out.println("Album " + musica.getAlbum());
				System.out.println("Album " + musica.getGenero());
				System.out.println("Título " + musica.getTitulo());
				System.out.println("Duração " + musica.getDuracao());
				System.out.println("Total De Reprodução " + musica.getTotalDeReproducao());
				System.out.println("Curtidas " + musica.getCurtidas());
				System.out.println("Classificação " + musica.getClassificacao());
			} else if (n == 4) {
				System.out.println("Saindo");
				i = 1;
			} else {
				System.out.println("Número inválido");
			}
		}
		
		Podcast podcast = new Podcast();
		System.out.println("Insira o Host do podcast");
		podcast.setHost(ler.nextLine());
		podcast.setHost(ler.nextLine());
		System.out.println("Insira a Descrição do podcast");
		podcast.setDescricao(ler.nextLine());
		System.out.println("Insira o Título do podcast");
		podcast.setTitulo(ler.nextLine());
		System.out.println("Insira o Título do podcast");
		podcast.setTitulo(ler.nextLine());
		System.out.println("Insira a Duração da podcast");
		podcast.setDuracao(ler.nextDouble());
		
		for (int i = 0; i < 501; i++) {
			podcast.Curtir();
		}
		
		for (int i = 0; i == 0;) {
			System.out.println(descricao);
			int n = ler.nextInt();
			if (n == 1) {
				podcast.Curtir();
			} else if (n == 2) {
				podcast.Reproduzir();
			} else if (n == 3) {
				System.out.println("Título " + podcast.getTitulo());
				System.out.println("Título " + podcast.getHost());
				System.out.println("Título " + podcast.getDescricao());
				System.out.println("Duração " + podcast.getDuracao());
				System.out.println("Total De Reprodução " + podcast.getTotalDeReproducao());
				System.out.println("Curtidas " + podcast.getCurtidas());
				System.out.println("Classificação " + podcast.getClassificacao());
			} else if (n == 4) {
				System.out.println("Saindo");
				i = 1;
			} else {
				System.out.println("Número inválido");
			}
		}
		
		MinhasPreferidas preferidas = new MinhasPreferidas();
		preferidas.inclui(musica);
		preferidas.inclui(podcast);

	}
}
