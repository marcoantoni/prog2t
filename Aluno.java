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

	// criando um método construtor
	
	// O que é:
	// O método construtor é um método especial da classe.
	// Ele possui o MESMO nome da classe (Aluno).
	
	// O que faz:
	// Ele é responsável por inicializar os atributos do objeto no momento da criação.
	// Ou seja, ele já define valores para nome, dataNascimento, cpf e curso automaticamente.
	
	// Qual o nome:
	// O nome do método construtor é "Aluno", exatamente igual ao nome da classe.
	
	// o método construtor é um método especial, pois ele é executado automaticamente
	// ao criar o objeto (new Objeto)
	public Aluno(String nome, String dataNascimento, String cpf, String curso){
		this.nome = nome;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.curso = curso;
	}
	

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
		
		// O que muda ao usar o método construtor:
		// Ao criar o objeto passando valores no construtor,
		// o objeto já nasce com os atributos preenchidos.
		// Não é necessário atribuir os valores depois (ex: al01.nome = "Manuela";).
		// Isso torna o código mais organizado, seguro e evita esquecer de inicializar atributos.
		// Em outros palavras, obriga que aquelas informações sejam inicializas
		
		Aluno al01 = new Aluno("Manuela", "10/06/2009", "123.456.678-65", "Técnico em informática");
		
		
		// Criando outro objeto (outro aluno)
		// Aqui acontece a mesma coisa: o construtor é chamado automaticamente
		// e já inicializa todos os dados do objeto no momento da criação.
		Aluno al02 = new Aluno("Germano", "06/06/2009", "903.435.765-42", "Técnico em informática");
		
		// Chamando o método mostrarAluno()
		// Isso faz com que os dados do aluno apareçam na tela
		
		al01.mostrarAluno(); // mostra dados da Manuela
		
		al02.mostrarAluno(); // mostra dados do Germano
		
	}
}
