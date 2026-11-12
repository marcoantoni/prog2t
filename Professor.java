class Professor extends Pessoa {
	
	private String titulacao;
	private float salario;
	
	public Professor(String nome, String cpf, Data nasc, String email, String fone, String titulacao, float salario) {
		
		super(nome, cpf, nasc, email, fone);
		
		this.titulacao = titulacao;
		
		this.salario = salario;
	}
	
	// reescrevendo o método mostrarDados
	public void mostrarDados() {
		super.mostrarDados();
		System.out.printf("Salário: R$ %.2f \n", salario);
		System.out.printf("Titulação: %s \n", titulacao);
	}
	
	// criando um segundo método que não mostra o CPF
	public void mostrarDados2() {
		System.out.printf("Nome: %s \n", nome);
		System.out.printf("Nascimento: %s \n",  nascimento.escreverPorExtenso() );
		System.out.printf("E-mail: %s \n", email);
		System.out.printf("Telefone/whattsapp: %s \n", telefone);
		System.out.printf("Salário: R$ %.2f \n", salario);
		System.out.printf("Titulação: %s \n", titulacao);
	}
	
	public static void main (String args[]){
		
		Professor p1 = new Professor("Renato dos Santos", "123.234.546-57", new Data(1, 5, 1990), 
			"renato@escola.com", "(51) 9 8735-3454", "Mestre", 12834.77f);
			
		p1.mostrarDados2();
		
	}
	
}
