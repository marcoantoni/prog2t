// arquivo Aluno.java

// A classe é como um "molde".
// A partir dela, podemos criar vários alunos (objetos).
class Aluno {

	// ATRIBUTOS (características do aluno)
	// Cada aluno terá seu próprio nome, CPF, etc.
	String nome;
	String dataNascimento;
	String cpf;
	String curso;

	// MÉTODO (ação/comportamento do aluno)
	// Esse método serve para mostrar os dados do aluno na tela
	public void mostrarAluno() {
		
		// Aqui estamos exibindo as informações do aluno
		// %s é usado para inserir textos (strings) nas mensagens
		System.out.printf("Aluno \n");
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Data de nascimento: %s \n", dataNascimento);
		System.out.printf("CPF: %s\n", cpf);
		System.out.printf("Curso: %s \n", curso);
		System.out.printf("------------------\n");
		
	}

	// Método principal (main)
	// É por aqui que o programa começa a executar
	public static void main (String args[]) {

		// Criando um objeto (aluno)
		// "new Aluno()" cria um novo aluno na memória
		Aluno al01 = new Aluno();
		
		// Preenchendo os dados do aluno 1
		// Estamos atribuindo valores aos atributos
		al01.nome = "Manuela";
		al01.dataNascimento = "10/06/2009";
		al01.cpf = "123.456.678-65";
		al01.curso = "Técnico em informática";
		
		// Criando outro objeto (outro aluno)
		Aluno al02 = new Aluno();
		
		// Preenchendo os dados do aluno 2
		al02.nome = "Germano";
		al02.dataNascimento = "06/06/2009";
		al02.cpf = "903.435.765-42";
		al02.curso = "Técnico em informática";
		
		// Chamando o método mostrarAluno()
		// Isso faz com que os dados do aluno apareçam na tela
		
		al01.mostrarAluno(); // mostra dados da Manuela
		
		al02.mostrarAluno(); // mostra dados do Germano
		
	}
}
