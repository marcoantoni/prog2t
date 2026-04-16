// criando a classe para representar datas no contexto computacional
class Data {

	// atributos da classe (representam uma data)
	int dia;
	int mes;
	int ano;
	
	// criando um método construtor para inicializar a data
	// vamos definir que todos os atributos são obrigatórios
	public Data (int dia, int mes, int ano ) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	// método responsável por exibir a data no formato abreviado (dd/mm/aaaa)
	public void escreverAbreviado() {
		System.out.printf("%d/%d/%d \n", dia, mes, ano);
	}
	
	// método principal (ponto de entrada do programa)
	public static void main (String args[]) {

		// criando um objeto para representar a data atual
		Data hoje = new Data(16, 4, 2026);
		
		// exibindo a data atual no formato abreviado
		hoje.escreverAbreviado();
		
		// criando outros objetos do tipo Data
		
		// objeto para representar a data de entrega do trabalho
		Data dataEntrega = new Data(3, 5, 2026);

		
		// exibindo mensagem + data de entrega
		System.out.printf("A data de entrega do trabalho de Programação é ");
		dataEntrega.escreverAbreviado(); 
		
		// objeto para representar a data da avaliação
		Data dataAvaliacao = new Data(30, 4, 2026);
		
		// exibindo mensagem + data da avaliação
		System.out.printf("A data da avaliação de Programação é ");
		dataAvaliacao.escreverAbreviado(); 
	}
}
