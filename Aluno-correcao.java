/* Classe que é uma correção do exercício disponível em https://presencial.ifrs.edu.br/pluginfile.php/138679/mod_resource/content/1/Aluno.pdf
 * para executar, o nome do arquivo deve ser alterado para Aluno
 */

class Aluno {
	String nome;
	int matricula;
	float notaFinal;	// Armazena a média final do aluno.

	public Aluno(String nome, int matricula) {

		// Validação do nome: deve possuir pelo menos 5 caracteres.
		if (nome.length() >= 5) {
			this.nome = nome;
		} else {
			System.out.printf("O nome do aluno é inválido. Deve conter pelo menos 5 caracteres.\n");
		}

		// Validação da matrícula: deve ser um número inteiro positivo.
		if (matricula > 0) {
			this.matricula = matricula;
		} else {
			System.out.printf("O número de matrícula é inválido. Deve ser maior que zero (0).\n");
		}
	}

	/*
	 * Calcula a média final do aluno a partir de três notas e
	 * armazena o resultado no atributo notaFinal.
	 */
	public void calcularMedia(float n1, float n2, float n3) {

		// Neste exercício não será realizada a validação das notas.
		// Assim, valores inválidos poderão gerar médias menores que 0
		// ou maiores que 10.
		notaFinal = (n1 + n2 + n3) / 3;
	}

	/*
	 * Retorna uma String contendo:
	 * - Nome;
	 * - Matrícula;
	 * - Média final;
	 * - Situação do aluno.
	 *
	 * Situação:
	 * - Aprovado: média maior ou igual a 7,0;
	 * - Reprovado: média menor que 1,8;
	 * - Em exame: média entre 1,8 e 6,9.
	 */
	public String mostrarDados() {

		String saida = "Nome: " + nome +
					   "\nMatrícula: " + matricula +
					   "\nMédia final: " + notaFinal +
					   " Situação: ";

		if (notaFinal >= 7)
			saida += "Aprovado";
		else if (notaFinal < 1.8)
			saida += "Reprovado";
		else
			// O operador += concatena texto de forma simplificada.
			// É equivalente a:
			// saida = saida + "Em exame";
			saida += "Em exame";

		return saida + "\n";
	}

	/*
	 * Programa principal.
	 * Cria três objetos da classe Aluno, calcula a média de cada um
	 * e exibe as informações na tela.
	 */
	public static void main(String args[]) {

		Aluno al01 = new Aluno("Luisa", 2025001);

		// Calcula a média final da aluna.
		al01.calcularMedia(8.5f, 9.3f, 8.8f);

		// Como mostrarDados() retorna uma String,
		// seu retorno deve ser enviado ao printf().
		System.out.printf(al01.mostrarDados());

		Aluno al02 = new Aluno("Samara", 2025002);

		al02.calcularMedia(7.2f, 6.5f, 6f);

		System.out.printf(al02.mostrarDados());

		Aluno al03 = new Aluno("Bruno", 2025003);

		al03.calcularMedia(1.2f, 1.5f, 1.6f);

		System.out.printf(al03.mostrarDados());
	}
}
