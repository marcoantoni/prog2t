class CalcularArea {
    
    // Sobrecarga de método (Métodos de INSTÂNCIA):
    // Requerem 'new CalcularArea()' para serem chamados via objeto (calc.calcularArea).
    
    public void calcularArea(int l) {
        System.out.printf("Método 1: calcularArea(int l) \n");
        System.out.printf("O quadrado tem área de %d m² \n", l * l);
    }
    
    public void calcularArea(float lado) {
        System.out.printf("Método 2: calcularArea(float lado)\n");
        System.out.printf("O quadrado tem área de %f m² \n", lado * lado);
    }
    
    public void calcularArea(float base, float altura) {
        float areaTriangulo = (base * altura) / 2;
        System.out.printf("Método 3: calcularArea(float base, float altura)\n");
        System.out.printf("O triângulo tem área de %f m² \n", areaTriangulo);
    }
    
    /* 
     * MÉTODO ESTÁTICO (Chamado via classe: CalcularArea.calcularAreaCirculo):
     * 
     * 1. POR QUE UM NOME DIFERENTE?
     *    Foi usado 'calcularAreaCirculo' em vez de sobrecarregar 'calcularArea(int)'
     *    para EVITAR CONFLITO DE ASSINATURA. O Método 1 já recebe um único parâmetro (int l).
     *    O Java não diferencia métodos pelo tipo de figura geométrica, apenas pelo tipo
     *    e quantidade de parâmetros. Se ambos fossem calcularArea(int), haveria erro de compilação.
     * 
     * 2. O QUE É Math.PI?
     *    É uma CONSTANTE ESTÁTICA da API do Java (public static final double PI).
     *    Por ser estática, acessamos diretamente via Math.PI (sem instanciar Math).
     *    Por ser constante (final), seu valor é fixo (3.14159...) e não pode ser alterado.
     */
    public static void calcularAreaCirculo(int raio){ // (Corrigido typo: Ciruculo -> Circulo)
        
        // Math.PI: constante estática da biblioteca Math
        double area = Math.PI * (raio * raio);
        
        System.out.printf("A área do círculo é %f \n", area);
    }
    
    
    public static void main(String args[]) {
        
        // Chamada de métodos de INSTÂNCIA: precisa criar o objeto 'calc'
        CalcularArea calc = new CalcularArea();
        calc.calcularArea(5.5f, 8f);
        
        // Chamada de método ESTÁTICO: invocado diretamente pelo nome da Classe (sem 'calc')
        CalcularArea.calcularAreaCirculo(10);
    }
}
