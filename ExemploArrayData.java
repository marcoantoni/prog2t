// Exemplo de utilização de um array de objetos.
// Neste exemplo, o array armazena objetos da classe Data.
class ExemploArrayData {

	// Declarando um atributo que representa um array de objetos Data.
	// Cada posição do array poderá armazenar uma referência para um objeto Data.
	Data aulas[];

	// Construtor da classe.
	public ExemploArrayData() {

		// Criando um array com capacidade para 5 posições.
		// Neste momento, apenas o array é criado.
		// Nenhum objeto Data existe ainda, portanto todas as posições
		// contêm o valor null.
		aulas = new Data[5];
	}

	public static void main(String args[]) {

		// Criando alguns objetos do tipo Data.
		Data d1 = new Data(6, 8, 2026);
		Data d2 = new Data(13, 8, 2026);
		Data d3 = new Data(20, 8, 2026);
		Data d4 = new Data(27, 8, 2026);

		// Criando um objeto da classe ExemploArrayData.
		// O construtor cria automaticamente o array de 5 posições.
		ExemploArrayData aulasAgosto = new ExemploArrayData();

		// Armazenando referências para objetos Data nas posições do array.
		aulasAgosto.aulas[0] = d1;
		aulasAgosto.aulas[1] = d2;

		// Exibindo os objetos armazenados nas posições 0 e 1.
		// Como existe um objeto nessas posições, é possível chamar seus métodos.
		System.out.printf("A posição 0 do array contém: %s\n",
				aulasAgosto.aulas[0].escreverPorExtenso());

		System.out.printf("A posição 1 do array contém: %s\n",
				aulasAgosto.aulas[1].escreverPorExtenso());

		/*
		 * Se tentarmos acessar uma posição que ainda não recebeu um objeto,
		 * ocorrerá um NullPointerException.
		 *
		 * Isso acontece porque a posição contém null e não existe objeto
		 * para executar o método escreverPorExtenso().
		 */
		// System.out.printf("A posição 2 do array contém: %s\n",
		//     aulasAgosto.aulas[2].escreverPorExtenso());

		System.out.printf("\nAs aulas no próximo mês serão nos dias de:\n");

		// Adicionando outro objeto ao array.
		// Observe que a posição 2 continua vazia (null).
		aulasAgosto.aulas[3] = d3;

		/*
		 * O for-each percorre automaticamente todas as posições do array.
		 * A variável temp recebe, uma de cada vez, a referência armazenada
		 * em cada posição.
		 */
		for (Data temp : aulasAgosto.aulas) {

			/*
			 * Antes de utilizar o objeto, verificamos se ele é diferente de null.
			 * Dessa forma evitamos um NullPointerException ao chamar um método.
			 */
			if (temp != null)
				System.out.printf("%s\n", temp.escreverPorExtenso());
		}

		/*
		 * Resultado esperado:
		 *
		 * - Posição 0: contém d1.
		 * - Posição 1: contém d2.
		 * - Posição 2: continua null.
		 * - Posição 3: contém d3.
		 * - Posição 4: continua null.
		 *
		 * O laço imprime apenas as posições que realmente possuem um objeto.
		 */
	}

}
