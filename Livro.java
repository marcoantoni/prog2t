class Livro {

	// Composição:
	// Em vez de armazenar nome e biografia do autor separadamente,
	// a classe Livro possui um objeto da classe Autor.
	// Dessa forma, um livro "tem um" autor.
	Autor autor;

	int nPaginas;
	String titulo;
	String genero;
	String editora;

	// Construtor responsável por criar um objeto Livro.
	// Perceba que um objeto Autor é recebido como parâmetro.
	public Livro(Autor autor, int nPaginas, String titulo,
	             String genero, String editora) {

		// Armazena a referência para o objeto Autor.
		// Não é criada uma cópia do autor, mas sim utilizada
		// a mesma instância recebida.
		this.autor = autor;

		// Validação do número de páginas.
		if (nPaginas > 0) {
			this.nPaginas = nPaginas;
		} else {
			System.out.println("Verifique o número de páginas do livro.");
			this.nPaginas = 0;
		}

		// Validação do título.
		if (titulo.trim().length() >= 5) {
			this.titulo = titulo.trim();
		} else {
			System.out.println("Título inválido.");
			this.titulo = "Não informado";
		}

		// Validação do gênero.
		if (genero.trim().length() >= 5) {
			this.genero = genero.trim();
		} else {
			System.out.println("Gênero inválido.");
			this.genero = "Não informado";
		}

		// Validação da editora.
		if (editora.trim().length() >= 4) {
			this.editora = editora.trim();
		} else {
			System.out.println("Editora inválida.");
			this.editora = "Não informada";
		}
	}

	// Retorna uma String contendo todas as informações do livro.
	// Observe que as informações do autor NÃO são montadas aqui.
	// Em vez disso, reutilizamos o método mostrar() da classe Autor.
	// Isso evita repetição de código e facilita futuras alterações.
	public String mostrar() {

		return "Título: " + titulo +
		       "\nPáginas: " + nPaginas +
		       "\nGênero: " + genero +
		       "\nEditora: " + editora +
		       "\n\n=== Autor ===\n" +
		       autor.mostrar();
	}

	public static void main(String args[]) {

		// Primeiro é criado um objeto Autor.
		Autor autor1 = new Autor(
			"George R. R. Martin",
			"Nascido em 1948 em Nova Jersey, George R. R. Martin é um dos principais escritores de fantasia da atualidade."
		);

		// Agora o objeto Autor é utilizado na criação do Livro.
		// Isso caracteriza a composição: um Livro possui um Autor.
		Livro livro1 = new Livro(autor1, 664, "Fogo & Sangue", "Fantasia épica", "Leya"
		);

		// Exibe todas as informações do livro.
		// O método mostrar() reaproveita o método mostrar() da classe Autor.
		System.out.println(livro1.mostrar());
	}
}
