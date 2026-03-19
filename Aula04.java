import java.util.Scanner;

class Aula04 {

	public static void main (String args[]) {
		
		// =========================
		// EXEMPLO DE LAÇO FOR
		// =========================
		// O laço for é utilizado quando sabemos exatamente
		// quantas vezes queremos repetir uma ação.
		
		// Estrutura do for:
		// 1) Inicialização da variável de controle (int i = 0)
		// 2) Condição de execução (i < 10)
		// 3) Incremento (i++)
		for (int i = 0; i < 10; i++) {
			System.out.printf("Executando o for pela %d vez \n", i);
		}
		
		
		// =========================
		// EXEMPLO DE LAÇO WHILE
		// =========================
		// O laço while é utilizado quando NÃO sabemos exatamente
		// quantas vezes a repetição irá acontecer.
		
		boolean deveExecutar = false;
		
		// A condição é verificada antes da execução do bloco.
		// Como a variável está como false, o laço nunca será executado.
		while (deveExecutar == true) {
			System.out.printf("Executando o laço while! \n");
		}
		
		
		// =========================
		// MENU COM ENTRADA DO USUÁRIO
		// =========================
		// Exemplo de laço que continua executando até o usuário escolher sair (0)
		
		int opcao = 1; // valor inicial diferente de 0 para entrar no laço
		
		// Linha obrigatória para leitura de dados do teclado
		Scanner sc = new Scanner(System.in);
		
		// O laço continua enquanto a opção for diferente de 0
		while (opcao != 0) {
			System.out.printf("----- MENU DE OPÇÕES -------\n");
			System.out.printf("1 - Cadastrar aluno \n");
			System.out.printf("2 - Editar aluno \n");
			System.out.printf("3 - Excluir aluno \n");
			System.out.printf("0 - Sair \n");
			
			System.out.printf("Qual opção você deseja? ");
			opcao = sc.nextInt(); // leitura de número inteiro
		}
		
		
		// =========================
		// LEITURA DE STRING ATÉ DIGITAR "sair"
		// =========================
		// Este laço continua até que o usuário digite a palavra "sair"
		
		String nome = "";
		
		// Enquanto o valor digitado for diferente de "sair", o laço continua
		// A linha abaixo poderia ser escrita assim: while (!nome.equals("sair") )
		while (nome.equals("sair") != true) {
			System.out.printf("Digite um nome (para sair, escreva 'sair'): \n");
			nome = sc.nextLine(); // leitura de texto
		}
		
	}

}
