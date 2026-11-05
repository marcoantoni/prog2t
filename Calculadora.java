class Calculadora {

    // Atributos de INSTÂNCIA (cada objeto criado com 'new' possui suas próprias cópias de n1 e n2)
    int n1;
    int n2;

    // Método ESTÁTICO: Pertence à classe, não ao objeto.
    // Recebe todos os dados de que precisa via parâmetros (a, b) e processa sem depender de instâncias.
    public static int somar (int a, int b) {
        return a + b;
    }
    
    /* 
     * ESTE MÉTODO ABAIXO NÃO FUNCIONA (ERRO DE COMPILAÇÃO):
     * 
     * public static int somar () {
     *     return n1 + n2;
     * }
     * 
     * MOTIVO: Métodos estáticos pertencem à CLASSE e são carregados antes de qualquer objeto existir.
     * Atributos como 'n1' e 'n2' são de INSTÂNCIA (só existem dentro de um objeto criado com 'new').
     * Um método estático não possui a referência 'this' e não sabe a qual objeto os atributos 'n1' e 'n2'
     * pertenceriam, tornando impossível o acesso direto a atributos não estáticos.
     */
    
    public static void main (String args[]){
        
        
        // Um método estático é chamado pelo nome da classe seguido pelo nome do método
        // caso houvesse uma instancia, por exemplo Calculadora c1 = new Calculadora();
        // iria funcionar fazer: c1.somar(25, 8);
        float resultado = Calculadora.somar(25, 8); 
        
        System.out.printf("A soma é: %f ", resultado);
        
    }
}
