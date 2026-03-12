class Aula3 {
	
	public static void main (String args[]) {
		
		/* 
		 * Exercício 1
		 * Faça um programa que avalie um valor numérico e calcule
		 * um reajuste de 10% sobre esse valor.
		 * Este exercício envolve o uso de operadores aritméticos.
		 */
		
		int valor = 50; // valor original
		
		float novoValor = valor * 1.1f;	// cálculo do valor com acréscimo de 10%
		
		System.out.printf("Valor original %d e o novo valor é %.2f \n", 
			valor, novoValor);
		
		
		/* 
		 * Exercício 2
		 * Faça um programa que utilize três variáveis (dia, mês e ano)
		 * representando uma data e, em seguida, escreva essa data
		 * por extenso.
		 * 
		 * Exemplo:
		 * 15/03/2022 → 15 de março de 2022
		 */
		 
		int dia = 11;
		int mes = 7;
		int ano = 2026;
		
		// inicializando a variável que armazenará a data por extenso
		// começando pelo dia e pela preposição "de"
		String data = dia + " de ";
		
		// estrutura de decisão para identificar o mês
		// e escrever seu nome por extenso
		switch(mes) {
			case 1:
				data = data + "janeiro";	// adiciona "janeiro" à string da data
				break; // break evita que o próximo case também seja executado
				
			case 2:
				data += "fevereiro"; 
				break;
				
			case 3: 
				data += "março";
				break;
				
			case 4:
				data += "abril";
				break;
				
			case 5:
				data += "maio";
				break;
				
			case 6:
				data += "junho"; 
				break;
				
			case 7: 
				data += "julho";
				break;
				
			case 8:
				data += "agosto";
				break;
				
			case 9:
				data += "setembro";
				break;
				
			case 10:
				data += "outubro"; 
				break;
				
			case 11: 
				data += "novembro";
				break;
				
			case 12:
				data += "dezembro";
				break;
		}
		
		// adicionando o ano ao final da data
		data += " de " + ano;
		
		// exibindo a data completa por extenso
		System.out.printf(data);

	}
	
}
