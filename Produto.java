// Classe responsável por representar um produto
class Produto{
	
	// Atributos da classe
	String nome;
	double precoCompra;
	double precoVenda; 
	
	// Método construtor da classe
	// É executado automaticamente ao criar um objeto Produto
	// Faz validações iniciais e inicializa os atributos da classe
	public Produto(String nome, double precoCompra){
		
		// Validando se o nome do produto possui pelo menos 5 caracteres
		
		// nome.length() retorna a quantidade de caracteres da String
		if (nome.length() >= 5){
			
			// Se o nome for válido, ele é armazenado no atributo da classe
			this.nome = nome;
			
		} else {
			
			// Mensagem exibida caso o nome seja inválido
			System.out.printf("Nome de produto é inválido e deve ter 5 ou mais letras\n");
			
			// Define um valor padrão para evitar que o atributo fique null
			this.nome = "Não informado";
		}
		
		// Validando se o preço de compra é maior que zero
		if (precoCompra > 0) {
			
			// Armazena o preço informado no atributo da classe
			this.precoCompra = precoCompra;
			
		} else {
			
			// Mensagem exibida caso o preço seja inválido
			System.out.printf("O preço de compra do produto deve ser maior que 0 reais.\n");
			
			// Define um valor padrão para o preço de compra
			this.precoCompra = 10;
		}
		
		// Calculando o preço de venda
		// O valor será 30% maior que o preço de compra
		this.precoVenda = this.precoCompra * 1.3;
		
	}
	
	// Método responsável por exibir os dados do produto
	public void mostrar(){
		
		// Exibindo o nome do produto
		System.out.printf("Nome: %s \n", nome);
		
		// Exibindo o preço de compra
		System.out.printf("Preço de custo: R$ %f \n", precoCompra);
		
		// Exibindo o preço de venda
		System.out.printf("Preço de venda: R$ %f \n", precoVenda);
	}
	
	// Método principal do programa
	public static void main (String args[]) {
		
		// Criando um objeto Produto com preço inválido
		Produto p1 = new Produto("Pepsi", -3.80);
		
		// Exibindo os dados do produto p1
		p1.mostrar();
		
		// Criando um segundo produto com dados válidos
		Produto p2 = new Produto("Doritos 210 g", 10.5);
		
		// Exibindo os dados do produto p2
		p2.mostrar();
	}
}
