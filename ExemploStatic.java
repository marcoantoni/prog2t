class ExemploStatic {

    public static void main (String args[]){
        
        int a = 50;
        int b = 25;
        
        /* 
         * A classe Math do Java é um excelente exemplo de biblioteca utilitária estática.
         * Note que NÃO precisamos fazer 'Math m = new Math()' para usar seus métodos.
         * Chamamos diretamente 'Math.nomeDoMetodo(...)'.
         */

        // Math.min(a, b): Método estático que compara dois valores e retorna o menor
        System.out.printf("O menor valor é %d \n", Math.min(a, b) );
        
        // Math.max(a, b): Método estático que compara dois valores e retorna o maior
        // (Corrigido o texto do print de 'menor' para 'maior')
        System.out.printf("O maior valor é %d \n", Math.max(a, b) );
        
        // Math.sqrt(double a): Método estático que calcula a raiz quadrada
        // Retorna um double (por isso a mascara %f funciona para exibir o ponto flutuante)
        System.out.printf("A raiz quadrada de 16 é %f \n", Math.sqrt(16) ); 
    
    }

}
