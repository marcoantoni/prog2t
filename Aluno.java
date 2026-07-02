// arquivo Aluno.java

// A classe é como um "molde".
// A partir dela, podemos criar vários alunos (objetos).
class Aluno {

	// ATRIBUTOS (características do aluno)
	// Cada aluno terá seu próprio nome, CPF, etc.
	String nome;

	// Exemplo de COMPOSIÇÃO.
	//
	// Antes, a data de nascimento era armazenada como uma String.
	// Agora, ela é um objeto da classe Data.
	//
	// Isso significa que um objeto Aluno "possui uma" Data.
	// Em Programação Orientada a Objetos, dizemos que existe uma relação
	// de composição entre as classes Aluno e Data.
	Data dataNascimento;

	String cpf;
	String curso;

	// criando um método construtor

	// O que é:
	// O método construtor é um método especial da classe.
	// Ele possui o MESMO nome da classe (Aluno).

	// O que faz:
	// Ele é responsável por inicializar os atributos do objeto no momento da criação.
	// Ou seja, ele já define valores para nome, dataNascimento, cpf e curso automaticamente.

	// Qual o nome:
	// O nome do método construtor é "Aluno", exatamente igual ao nome da classe.

	// O método construtor é um método especial, pois ele é executado
	// automaticamente ao criar o objeto (new Aluno()).

	// Como o atributo dataNascimento agora é um objeto da classe Data,
	// o construtor também deve receber um objeto Data.
	//
	// Assim, ao criar um Aluno, é obrigatório informar um objeto que
	// represente sua data de nascimento.
	public Aluno(String nome, Data dataNascimento, String cpf, String curso){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.curso = curso;
	}

	// MÉTODO (ação/comportamento do aluno)
	// Esse método serve para mostrar os dados do aluno na tela.
	public void mostrarAluno() {

		// Aqui estamos exibindo as informações do aluno.
		// %s é usado para inserir textos (strings) nas mensagens.
		System.out.printf("Aluno\n");
		System.out.printf("Nome: %s\n", nome);

		// Como dataNascimento é um objeto da classe Data,
		// podemos utilizar seus métodos através do operador ponto (.).
		//
		// Estamos pedindo para o próprio objeto Data escrever
		// a data no formato abreviado.
		dataNascimento.escreverAbreviado();

		// Também podemos utilizar outro método do objeto Data.
		//
		// Neste caso, o método escreverPorExtenso() devolve (retorna)
		// uma String contendo a data escrita por extenso.
		System.out.printf("Nascimento: %s\n",
				dataNascimento.escreverPorExtenso());

		System.out.printf("CPF: %s\n", cpf);
		System.out.printf("Curso: %s\n", curso);
		System.out.printf("------------------\n");
	}

	// Método principal (main)
	// É por aqui que o programa começa a executar.
	public static void main(String args[]) {

		// O que muda ao usar o método construtor:
		//
		// Ao criar o objeto passando valores no construtor,
		// o objeto já nasce com os atributos preenchidos.
		//
		// Não é necessário atribuir os valores depois
		// (ex.: al01.nome = "Manuela";).
		//
		// Isso torna o código mais organizado, seguro e evita
		// esquecer de inicializar atributos.
		//
		// Em outras palavras, obriga que as informações essenciais
		// sejam inicializadas no momento da criação do objeto.

		// Primeiro criamos um objeto da classe Data.
		//
		// Esse objeto ficará responsável por armazenar todas as
		// informações referentes à data de nascimento do aluno.
		Data nascAl01 = new Data(10, 6, 2009);

		// Agora passamos o objeto nascAl01 para o construtor.
		//
		// Observe que não passamos uma String como "10/06/2009".
		// Estamos passando um OBJETO da classe Data.
		//
		// Dessa forma, o objeto Aluno passa a possuir um objeto Data,
		// caracterizando a composição entre as duas classes.
		Aluno al01 = new Aluno(
				"Manuela",
				nascAl01,
				"123.456.678-65",
				"Técnico em Informática");

		// Criando outro objeto (outro aluno).
		// Aqui acontece a mesma coisa: o construtor é chamado
		// automaticamente e inicializa todos os atributos do objeto.
		//
		// Data nascAl02 = new Data(6, 6, 2009);
		// Aluno al02 = new Aluno(
		//         "Germano",
		//         nascAl02,
		//         "903.435.765-42",
		//         "Técnico em Informática");

		// Chamando o método mostrarAluno().
		// Isso faz com que os dados do aluno sejam exibidos na tela.
		al01.mostrarAluno();

		// al02.mostrarAluno();

		// Resumindo:
		//
		// Aluno NÃO armazena mais a data de nascimento como um texto.
		// Em vez disso, ele possui um objeto da classe Data.
		//
		// Essa técnica é chamada de COMPOSIÇÃO e permite reutilizar
		// classes, organizar melhor o código e separar responsabilidades.
	}
}
