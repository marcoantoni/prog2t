class AppData {
	
	// método principal (ponto de entrada do programa)
	public static void main (String args[]) {

		// criando um objeto para representar a data de início das férias
		Data inicioFerias = new Data(15, 12, 2026);
		
		// como os atributos da classe Data estão encapsulados,
		// não podemos alterar o valor do atributo diretamente.
		// Para modificar o dia, utilizamos o método setter setDia().
		inicioFerias.setDia(18);
		
		// após o encapsulamento dos atributos da classe Data,
		// não é mais possível acessar ou modificar esses atributos
		// diretamente a partir de outra classe.
		//
		// As linhas abaixo, por exemplo, causariam erro de compilação:
		
		// tentando alterar diretamente o atributo dia
		// inicioFerias.dia = 35;
		
		// tentando alterar diretamente o atributo mes
		// inicioFerias.mes = 14;
		
		
		// o método escreverPorExtenso() retorna uma String
		// contendo a data escrita por extenso.
		// Podemos utilizar esse valor diretamente dentro do printf.
		System.out.printf("As férias começam em %s", 
			inicioFerias.escreverPorExtenso() );
		
		// chamando o método que exibe a data no formato abreviado
		inicioFerias.escreverAbreviado();
		
		// exemplo de utilização dos métodos getters.
		// Como os atributos da classe Data estão encapsulados,
		// utilizamos os métodos get para consultar seus valores.
		//
		// Neste exemplo, vamos obter o ano, o mês e o dia
		// para montar a data no formato americano: ano-mês-dia.
		String novaData = inicioFerias.getAno()+"-"+
			inicioFerias.getMes() + "-" + 
			inicioFerias.getDia();
			
		// exibindo a data armazenada na variável novaData
		System.out.printf("A data no formato americano é: %s \n",
			novaData);
	}

}
