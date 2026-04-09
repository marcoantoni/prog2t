// criação da classe Ponto, que representa um ponto no plano cartesiano
class Ponto {

	// atributos da classe (coordenadas do ponto)
	int x;
	int y;
	
	// método responsável por identificar em qual quadrante o ponto está
	public void determinarQuadrante() {

		// 1º quadrante: x positivo e y positivo
		if (x > 0 && y > 0) {
			System.out.printf("1º quadrante\n");

		// 2º quadrante: x negativo e y positivo
		} else if (x < 0 && y > 0) {
			System.out.printf("2º quadrante\n");

		// 3º quadrante: x negativo e y negativo
		} else if (x < 0 && y < 0) {
			System.out.printf("3º quadrante\n");

		// 4º quadrante: x positivo e y negativo
		} else if (x > 0 && y < 0){ 
			System.out.printf("4º quadrante\n");

		// caso especial: quando o ponto está sobre os eixos ou na origem
		} else {
			// embora o enunciado não tenha pedido esse tratamento
			// estamos fazendo para ter uma reprodução mais fiel com a realidade
			System.out.printf("O ponto está na origem ou na linha\n");
		}
	}
	
	// método principal (ponto de entrada do programa)
	public static void main(String args[]) {

		// criando o objeto p1 da classe Ponto
		Ponto p1 = new Ponto();
		
		// definindo os valores das coordenadas do ponto p1
		p1.x = 0;   // coordenada x
		p1.y = -2;  // coordenada y
		
		// chamando o método para identificar o quadrante do ponto p1
		p1.determinarQuadrante();
		
		// criando outro objeto da classe Ponto
		Ponto p2 = new Ponto();

		// definindo as coordenadas do ponto p2
		p2.x = 12;
		p2.y = -4;

		// chamando o método para identificar o quadrante do ponto p2
		p2.determinarQuadrante();	
	}
}
