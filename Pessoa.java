// classe Base
class Pessoa {
	protected String nome;
	protected String cpf;
	protected Data nascimento;
	protected String email;
	protected String telefone;
	
	// criando o método construtor
	public Pessoa(String nome,  String cpf, Data nascimento, String email, String telefone) {
		// sem nenhuma validação dos dados
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.email = email;
		this.telefone = telefone;
	}
	
	// método para mostrar as informações
	public void mostrarDados() {
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("CPF: %s \n", cpf);
		System.out.printf("Nascimento: %s \n",  nascimento.escreverPorExtenso() );
		System.out.printf("E-mail: %s \n", email);
		System.out.printf("Telefone/whattsapp: %s \n", telefone);
		
	}
	
}
