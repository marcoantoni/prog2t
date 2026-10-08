class CalcularArea {
	
	// Sobrecarga de método:
	// Mesmo nome do método, mas com uma assinatura diferente.
	// Neste caso, o método recebe um único parâmetro do tipo int.
	public void calcularArea(int l) {
		
		System.out.printf("Método 1: calcularArea(int l) \n");
		
		// Como temos apenas um valor inteiro, vamos
		// considerá-lo como o lado de um quadrado.
		System.out.printf("O quadrado tem área de %d m² \n",
			l * l);
	}
	
	
	// Sobrecarga do método calcularArea().
	// Agora o método recebe um parâmetro do tipo float.
	// Apesar de ter o mesmo nome, sua assinatura é diferente:
	// calcularArea(float)
	public void calcularArea(float lado) {
		
		System.out.printf("Método 2: calcularArea(float lado)\n");
		
		// O valor recebido representa o lado do quadrado.
		System.out.printf("O quadrado tem área de %f m² \n",
			lado * lado);
	}
	
	
	// Outra sobrecarga do método calcularArea().
	// Desta vez, o método recebe dois parâmetros float:
	// calcularArea(float, float)
	public void calcularArea(float base, float altura) {
		
		// Cálculo da área de um triângulo:
		// área = (base * altura) / 2
		float areaTriangulo = (base * altura) / 2;
		
		System.out.printf(
			"Método 3: calcularArea(float base, float altura)\n");
		
		System.out.printf(
			"O triângulo tem área de %f m² \n",
			areaTriangulo);
	}
	
	
	public static void main(String args[]) {
		
		// Criação de um objeto da classe CalcularArea.
		CalcularArea calc = new CalcularArea();
		
		// O Java identifica qual método deve ser executado
		// observando a quantidade e o tipo dos argumentos.
		//
		// Como foram passados dois valores float,
		// será chamado:
		// calcularArea(float base, float altura)
		calc.calcularArea(5.5f, 8f);
	}
}
