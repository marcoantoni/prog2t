class Aula02{
	
	public static void main (String args[]) {
		
		// criando uma variavel boolean para testar se a pessoa é doadora
		// de órgãos
		
		boolean ehDoador = true;	// true - indica que é doadora | false - não é doadora

		// não é necessário testar se ehDoador == true. O == true pode ser omitido
		if (ehDoador){
			System.out.printf("É doador de órgãos \n");
		} else {
			System.out.printf("Não é doador de órgãos \n");
		}
		
		// fazendo uma estrura de decisão aninhada
		
		// testanto um numero para escrever se ele é positivo, negativo ou 0
		
		int numero = 3;
		
		if (numero > 0) {
			System.out.printf("O número %d é positivo \n", numero);
		} else if (numero < 0) {
			System.out.printf("O número %d é negativo \n", numero);
		} else {
			System.out.printf("O número é zero \n");
		}
	}
}
