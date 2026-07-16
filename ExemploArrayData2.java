// Exemplo de utilização de um array de objetos.
//
// Neste exemplo, o array armazena objetos da classe Data.
//
// Este código é uma evolução do exemplo anterior. Em vez de acessar
// diretamente as posições do array (ex.: encontros[0] = ...),
// serão utilizados métodos para adicionar e mostrar os objetos.
// Essa abordagem segue um dos princípios da Orientação a Objetos:
// esconder os detalhes da implementação e disponibilizar apenas
// operações (métodos) para manipular os dados.
class ExemploArrayData2 {

	// Array que armazenará objetos do tipo Data.
	// Cada posição poderá guardar a referência para um objeto Data.
	Data encontros[];

	// Variável utilizada para indicar a próxima posição livre do array.
	// Sempre que um novo objeto for inserido, esse índice será incrementado.
	int indice;

	// Construtor da classe.
	public ExemploArrayData2() {

		// Criando um array com capacidade para armazenar 5 objetos.
		// Neste momento apenas o array é criado.
		// Todas as posições contêm o valor null.
		encontros = new Data[5];

		// Como nenhuma posição foi utilizada ainda,
		// a primeira inserção ocorrerá na posição 0.
		indice = 0;
	}

	/*
	 * Método responsável por adicionar um objeto Data ao array.
	 *
	 * Observe que quem utiliza a classe não precisa saber
	 * em qual posição o objeto será armazenado.
	 *
	 * O próprio método utiliza o atributo indice para descobrir
	 * a próxima posição livre e, em seguida, incrementa o índice
	 * para a próxima inserção.
	 */
	public void adicionarData(Data dt) {

		// Armazena a referência do objeto na próxima posição disponível.
		encontros[indice] = dt;

		// Atualiza o índice para a próxima inserção.
		indice++;
	}

	/*
	 * Método responsável por mostrar todos os objetos armazenados.
	 *
	 * O usuário da classe não precisa percorrer o array manualmente.
	 * Basta chamar mostrarEncontros().
	 */
	public void mostrarEncontros() {

		// Percorrendo todas as posições do array utilizando o for-each.
		for (Data tmp : encontros) {

			// Apenas posições que possuem um objeto serão exibidas.
			// As posições que continuam null são ignoradas.
			if (tmp != null)
				System.out.printf("%s\n", tmp.escreverPorExtenso());
		}
	}

	public static void main(String args[]) {

		// Criando um objeto que armazenará as datas das aulas de Biologia.
		ExemploArrayData2 aulasBiologia = new ExemploArrayData2();

		// Criando alguns objetos Data.
		Data dtBio1 = new Data(7, 8, 2026);
		Data dtBio2 = new Data(14, 8, 2026);
		Data dtBio3 = new Data(21, 8, 2026);
		Data dtBio4 = new Data(28, 8, 2026);

		/*
		 * Em vez de acessar diretamente o array:
		 *
		 *     encontros[0] = dtBio1;
		 *     encontros[1] = dtBio2;
		 *
		 * utilizamos o método adicionarData().
		 *
		 * Dessa forma, a própria classe controla onde cada objeto
		 * será armazenado.
		 */
		aulasBiologia.adicionarData(dtBio1);
		aulasBiologia.adicionarData(dtBio2);
		aulasBiologia.adicionarData(dtBio3);
		aulasBiologia.adicionarData(dtBio4);

		// Exibindo todas as datas armazenadas.
		// O método percorre o array internamente.
		System.out.printf("As aulas de biologia serão em: \n");
		aulasBiologia.mostrarEncontros();

		System.out.println();

		System.out.printf("Os próximos feriados serão em: \n");

		// Criando outro objeto totalmente independente do primeiro.
		// Cada objeto possui seu próprio array e seu próprio índice.
		ExemploArrayData2 proxFeriados = new ExemploArrayData2();

		/*
		 * Também é possível criar o objeto diretamente como parâmetro
		 * do método, sem armazená-lo em uma variável.
		 *
		 * Essa técnica é útil quando o objeto será utilizado apenas
		 * uma única vez.
		 */
		proxFeriados.adicionarData(new Data(7, 9, 2026));
		proxFeriados.adicionarData(new Data(12, 10, 2026));

		// Exibindo os feriados cadastrados.
		proxFeriados.mostrarEncontros();

		/*
		 * Observe que aulasBiologia e proxFeriados possuem arrays
		 * completamente independentes.
		 *
		 * Cada objeto da classe ExemploArrayData2 administra seu
		 * próprio conjunto de datas.
		 *
		 * Essa é uma das principais vantagens da Orientação a Objetos:
		 * cada objeto mantém seus próprios atributos e controla seus
		 * dados através de métodos.
		 */
	}

}
