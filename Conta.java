class Conta {

    // Atributos da conta
    String nome;
    String cpf;
    float saldo;

    // Como é um exemplo bem básico,
    // ainda não utilizaremos método construtor.

    public String imprimirExtrato() {
        return "Nome: " + nome + "\nSaldo: " + saldo + "\n";
    }

    public void depositar(float valor) {
        // Método sem validação.
        // Apenas soma o valor ao saldo.
        saldo += valor;

        System.out.printf("Dinheiro depositado com sucesso.\n");
    }

    public void sacar(float valor) {
        // Também não há validação.
        // É possível sacar qualquer valor.
        saldo -= valor;

        System.out.printf("Dinheiro sacado com sucesso.\n");
    }

    // Método para testar a classe.
    public static void main(String args[]) {

        Conta c1 = new Conta();

        // Preenchendo os dados da conta.
        c1.nome = "Lucas";
        c1.cpf = "012.345.240-12";

        // Dois depósitos.
        c1.depositar(200);
        c1.depositar(300);

        // ====================================================
        // PERGUNTA PARA A TURMA:
        //
        // O que acontecerá se alterarmos o saldo diretamente?
        //
        // O banco autorizou essa operação?
        // Foi feito um depósito?
        // Houve algum saque?
        // ====================================================

        c1.saldo = 10000;
        
        // percebemos que o novo saldo R$ 10 mil é um valor indevido,
        // pois não houve operações de depósito

        // Exibe o extrato da conta.
        System.out.printf(c1.imprimirExtrato());
    }
}
