// criando a classe para representar datas no contexto computacional
class Data {

	// atributos da classe (representam uma data)
	int dia;
	int mes;
	int ano;
	
	// método responsável por exibir a data no formato abreviado (dd/mm/aaaa)
	public void escreverAbreviado() {
		System.out.printf("%d/%d/%d \n", dia, mes, ano);
	}
	
	// método principal (ponto de entrada do programa)
	public static void main (String args[]) {

		// criando um objeto para representar a data atual
		Data hoje = new Data();
		
		// atribuindo valores aos atributos do objeto hoje
		hoje.dia = 9;
		hoje.mes = 4;
		hoje.ano = 2006;
		
		// exibindo a data atual no formato abreviado
		hoje.escreverAbreviado();
		
		// criando outros objetos do tipo Data
		
		// objeto para representar a data de entrega do trabalho
		Data dataEntrega = new Data();
		
		// definindo os valores da data de entrega
		dataEntrega.dia = 3;
		dataEntrega.mes = 5;
		dataEntrega.ano = 2026;
		
		// exibindo mensagem + data de entrega
		System.out.printf("A data de entrega do trabalho de Programação é ");
		dataEntrega.escreverAbreviado(); 
		
		// objeto para representar a data da avaliação
		Data dataAvaliacao = new Data();
		
		// definindo os valores da data da avaliação
		dataAvaliacao.dia = 30;
		dataAvaliacao.mes = 4;
		dataAvaliacao.ano = 2026;
		
		// exibindo mensagem + data da avaliação
		System.out.printf("A data da avaliação de Programação é ");
		dataAvaliacao.escreverAbreviado(); 
	}
}
