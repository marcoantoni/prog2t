import java.util.Scanner;

/*
Classe que representa uma calculadora simples.

O objetivo deste exemplo é demonstrar:
- Criação de atributos e métodos;
- Diferença entre métodos com e sem retorno;
- Reaproveitamento de código através de chamadas de métodos;
- Organização do programa utilizando orientação a objetos.

Nesta etapa, os atributos ainda não estão encapsulados.
*/
class Calculadora{

	// Atributos da classe
	float n1;
	float n2;
	String operacao;
	
	/*
	Método sem retorno (void).

	Responsável apenas por exibir as opções disponíveis
	para o usuário.
	*/
	public void mostrarMenu() {
		System.out.printf("Calculadora básica. Opções \n");
		System.out.printf("+ para somar \n");
		System.out.printf("- para subtrair \n");
		System.out.printf("* para multiplicar \n");
		System.out.printf("/ para dividir \n");
		System.out.printf("s para sair \n");
	}
	
	/*
	Método sem retorno (void).

	Lê os dados informados pelo usuário e armazena
	os valores diretamente nos atributos do objeto.
	*/
	public void lerTeclado(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe a operação: ");
		operacao = sc.nextLine();
		
		System.out.printf("Digite o numero 1: ");
		n1 = sc.nextFloat();
		
		System.out.printf("Digite o numero 2: ");
		n2 = sc.nextFloat();
		
	}
	
	/*
	Método com retorno.

	Recebe os dados que já estão armazenados nos atributos,
	executa o cálculo correspondente e devolve o resultado
	para quem chamou o método.

	A palavra-chave 'return' é utilizada para devolver
	um valor do tipo float.
	*/
	public float calcularResultado() {
		
		float resultado = 0;
		
		if (operacao.equals("+") ){
			resultado = n1 + n2;
		} else if (operacao.equals("-") ) {
			resultado = n1 - n2;
		} else if (operacao.equals("*") ) {
			resultado = n1 * n2;
		} else if (operacao.equals("/") ) {
			resultado = n1 / n2;
		}
		
		return resultado;
	}
	
	public static void main (String args[]){
		
		/*
		Criação de um objeto da classe Calculadora.
		A variável 'calc' passa a referenciar esse objeto.
		*/
		Calculadora calc = new Calculadora();
		
		/*
		Chamada de um método sem retorno.

		O método executa uma ação (mostrar o menu),
		mas não devolve nenhum valor.
		*/
		calc.mostrarMenu();
		
		/*
		Outro método sem retorno.

		Ele apenas realiza a leitura dos dados
		e armazena as informações nos atributos.
		*/
		calc.lerTeclado();
		
		/*
		Exemplo de chamada de um método com retorno.

		O valor devolvido por calcularResultado()
		é utilizado diretamente pelo printf.
		*/
		System.out.printf(
			"O resultado é %f \n",
			calc.calcularResultado()
		);
		
		/*
		As linhas abaixo repetem exatamente o mesmo
		processo realizado anteriormente.

		Isso demonstra que um método pode ser chamado
		quantas vezes forem necessárias, permitindo
		reaproveitamento de código e evitando duplicação
		da lógica de programação.
		*/
		
		calc.mostrarMenu();
		
		calc.lerTeclado();
		
		System.out.printf(
			"O resultado é %f \n",
			calc.calcularResultado()
		);
	}

}
