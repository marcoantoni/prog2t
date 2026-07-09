class Autor {
	// Atributos que armazenam os dados do autor.
	String nome;
	String biografia;

	// Construtor responsável por criar um novo objeto Autor.
	public Autor(String nome, String biografia) {

		// Remove espaços em branco do início e do fim do nome
		// e verifica se ele possui pelo menos 5 caracteres.
		if (nome.trim().length() >= 5) {
			this.nome = nome.trim();
		} else {
			// Caso o nome seja inválido, informa o problema
			// e atribui um valor padrão.
			System.out.printf("Nome inválido\n");
			this.nome = "Não informado";
		}

		// Remove espaços em branco da biografia e verifica
		// se ela possui pelo menos 20 caracteres.
		if (biografia.trim().length() >= 20) {
			this.biografia = biografia.trim();
		} else {
			// Caso a biografia seja muito curta, utiliza
			// uma mensagem padrão.
			System.out.printf("Biografia não informada\n");
			this.biografia = "Não há nada para mostrar";
		}
	}

	// Retorna uma String contendo as informações do autor
	// formatadas para exibição.
	public String mostrar() {
		return "Nome: " + nome + "\nBio: " + biografia + "\n------\n";
	}

	public static void main(String args[]) {

		// Cria um objeto Autor utilizando o construtor da classe.
		Autor autor1 = new Autor(
			"George R. R. Martin",
			"Nascido em 1948 em Nova Jersey, George R. R. Martin é um aclamado autor e roteirista norte-americano. Ele é mundialmente famoso pela saga de fantasia épica As Crônicas de Gelo e Fogo, que inspirou a premiada série Game of Thrones da HBO. Sua carreira inclui ainda passagens de sucesso como produtor e roteirista em Hollywood."
		);

		// Exibe na tela os dados do autor utilizando
		// o método mostrar().
		System.out.printf("%s", autor1.mostrar());
	}
}
