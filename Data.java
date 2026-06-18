// criando a classe para representar datas no contexto computacional
class Data {

	// atributos da classe (representam uma data)
	int dia;
	int mes;
	int ano;
	
	// criando um método construtor para inicializar a data
	// vamos definir que todos os atributos são obrigatórios
	public Data (int dia, int mes, int ano ) {
		// criando um array de numero inteiros
		// dessa forma, os valores estão definidos no momento de criação
		// em java, um array tem tamanho fixo. Aqui não é necessário especificar
		// o tamanho, pois os valores estão sendo adicionados no momento da 
		// criação
		int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// todo mês começa com o dia 1º
		// usamos um aray para saber qual é o último dia do mês
		// o acesso dos elementos do array, ocorre através de um índice (dentro dos colchetes)
		if (dia >= 1 && dia <= diasMes[mes-1]){
			this.dia = dia;
		} else {
			System.out.println("O dia informado é inválido");
			// definindo um valor valido e padrão para quando o dia for 
			// invalido
			this.dia = 1;	
		}
		
		// validando o dia		
		if (mes >= 1 && mes <= 12){
			this.mes = mes;
		} else {
			System.out.println("O mês informado é inválido");
		}
		
		// validando o ano
		// a classe não conseguirá representar datas anteriores a 1900
		// ex: 20/09/1845 
		if (ano >= 1900){
			this.ano = ano;
		} else {
			System.out.println("O ano informado é inválido");
		}
	}
	
	// método responsável por exibir a data no formato abreviado (dd/mm/aaaa)
	public void escreverAbreviado() {
		System.out.printf("%d/%d/%d \n", dia, mes, ano);
	}
	
	// método principal (ponto de entrada do programa)
	public static void main (String args[]) {

		// criando um objeto para representar a data de inicio das ferias
		Data inicioFerias = new Data(32, 7, 2026);
		
		System.out.printf("As férias começam em ");
		inicioFerias.escreverAbreviado();
		

	}
}
