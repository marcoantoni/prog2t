// para fazer um input do teclado, é necessário fazer o seguinte import
import java.util.Scanner;

class Aula01{

	// Esse é meu primeiro programa em Java
	// Iremos fazer a declaração de variavel, leitura do teclado 
	// e também saida de dados.
	
	public static void main (String args[]){
		
		// para ler do teclado, será necessário criar uma variavel do tipo Scanner
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Qual é seu nome? \n");
		// lendo uma string do teclado 
		String nome = sc.nextLine();
		
		// lendo um numero float
		float altura = sc.nextFloat();
		
		// lendo um numero inteiro
		int idade = sc.nextInt();
		
		// declarando variaveis
		//String nome = "Lucas";	// declarando uma variavel do tipo string
		//int idade = 16; // variavel do tipo inteiro
		// float altura = 1.79f;	// variavel do tipo float
		
		char sexo = 'M'; // declarando uma variavel do tipo char
		// o tipo char é entre aspas simples. As strings usam aspas duplas
	
	
		// exibindo os dados na tela
		// exibindo uma string
		System.out.printf("Nome: %s \n", nome);
		
		// exibindo um inteiro
		System.out.printf("Idade: %d \n", idade);
		
		// exibindo um float
		System.out.printf("Altura: %.2f \n", altura);
		
		// para exibir um char, também usa-se o %s
		System.out.printf("Sexo: %s \n", sexo);
		
	
	}
}
