// criando a classe para representar datas no contexto computacional
class Data {

	// atributos da classe (representam uma data)
	int dia;
	int mes;
	int ano;
	
	// criando um método construtor para inicializar a data
	// vamos definir que todos os atributos são obrigatórios
	public Data (int dia, int mes, int ano ) {
		
		// validando o mês
		// esta validação precisa acontecer antes da validação do dia,
		// pois a quantidade de dias válidos depende do mês informado.
		// Por exemplo: fevereiro possui 28 dias, enquanto janeiro possui 31.
		if (mes >= 1 && mes <= 12){
			this.mes = mes;
		} else {
			System.out.println("O mês informado é inválido");
			this.mes = 1;	// definindo um valor padrão
		}
		
		// criando um array de números inteiros
		// um array é uma estrutura que permite armazenar vários valores
		// do mesmo tipo em uma única variável.
		//
		// Cada posição do array possui um índice. Em Java, os índices
		// começam em 0. Portanto:
		// diasMes[0] = 31 (janeiro)
		// diasMes[1] = 28 (fevereiro)
		// diasMes[2] = 31 (março)
		// ...
		//
		// Como os valores já estão sendo informados na criação do array,
		// não é necessário indicar seu tamanho.
		int diasMes[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		// agora podemos validar o dia
		// todo mês começa no dia 1
		// o limite máximo é obtido consultando o array diasMes
		//
		// usamos this.mes - 1 porque os meses vão de 1 a 12,
		// enquanto os índices do array vão de 0 a 11.
		if (dia >= 1 && dia <= diasMes[this.mes-1]){
			this.dia = dia;
		} else {
			System.out.println("O dia informado é inválido");
			
			// definindo um valor válido e padrão para quando o dia
			// informado for inválido
			this.dia = 1;	
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
	//
	// este método não possui retorno (void), pois sua única função
	// é mostrar informações na tela.
	public void escreverAbreviado() {
		System.out.printf("%d/%d/%d \n", dia, mes, ano);
	}
	
	// método responsável por gerar uma representação da data por extenso
	//
	// diferente do método anterior, este método possui retorno (String).
	// Em vez de exibir diretamente na tela, ele devolve o texto gerado
	// para que o programa decida o que fazer com ele.
	//
	// Isso aumenta a reutilização do código, pois o valor retornado
	// poderia ser exibido na tela, armazenado em uma variável,
	// enviado para um arquivo ou utilizado em outro método.
	public String escreverPorExtenso() {
		
		// array contendo os nomes dos meses
		// novamente, cada posição corresponde a um mês.
		String meses[] = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", 
			"julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
		
		// montando a frase que representa a data
		String saida = dia + " de " + meses[mes-1] + " de " + ano;
		
		// devolvendo o resultado para quem chamou o método
		return saida;
	}
	
	// método principal (ponto de entrada do programa)
	public static void main (String args[]) {

		// criando um objeto para representar a data de início das férias
		Data inicioFerias = new Data(20, 7, 2026);
		
		// utilizando o valor retornado pelo método escreverPorExtenso()
		System.out.printf("As férias começam em %s", 
			inicioFerias.escreverPorExtenso() );
		
		inicioFerias.escreverAbreviado();
	}
}
