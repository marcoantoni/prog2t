import java.util.Scanner;

class Calculadora{
	float n1;
	float n2;
	String operacao;
	
	public void mostrarMenu() {
		System.out.printf("Calculadora básica. Opções \n");
		System.out.printf("+ para somar \n");
		System.out.printf("- para subtrair \n");
		System.out.printf("* para multiplicar \n");
		System.out.printf("/ para dividir \n");
		System.out.printf("s para sair \n");
	}
	
	public void lerTeclado(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Informe a operação: ");
		operacao = sc.nextLine();
		
		System.out.printf("Digite o numero 1: ");
		n1 = sc.nextFloat();
		
		System.out.printf("Digite o numero 2: ");
		n2 = sc.nextFloat();
		
	}
	
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
		Calculadora calc = new Calculadora();
		
		calc.mostrarMenu();
		
		calc.lerTeclado();
		
		System.out.printf("O resultado é %f \n", calc.calcularResultado() );
		
		// linhas duplicadas para repetir a operação
		
		calc.mostrarMenu();
		
		calc.lerTeclado();
		
		System.out.printf("O resultado é %f \n", calc.calcularResultado() );
	}

}
