
// A classe Professor HERDA da classe Pessoa.
//
// A palavra-chave extends estabelece a relação de herança.
//
// Professor é uma subclasse (classe filha) de Pessoa,
// enquanto Pessoa é a superclasse (classe pai).
//
// Dessa forma, Professor herda os atributos e métodos
// definidos em Pessoa, como nome, cpf, nascimento,
// email, telefone e mostrarDados().

class Professor extends Pessoa {

    // Atributos específicos da classe Professor.
    //
    // Estes atributos não existem na classe Pessoa,
    // pois representam características próprias de um professor.

    private String titulacao;
    private float salario;

    // Construtor da classe Professor.
    //
    // Recebe tanto os dados comuns a qualquer pessoa quanto
    // os dados específicos de um professor.

    public Professor(String nome, String cpf, Data nasc,
                     String email, String fone,
                     String titulacao, float salario) {

        // Chamando o construtor da SUPERCLASSE (Pessoa).
        //
        // A palavra-chave super permite acessar elementos
        // da classe pai.
        //
        // Neste caso, estamos chamando o construtor de Pessoa
        // para inicializar os atributos herdados.
        //
        // Assim, não precisamos inicializar novamente nome,
        // cpf, nascimento, email e telefone nesta classe.
        //
        // A chamada a super() deve ser a primeira instrução
        // do construtor.

        super(nome, cpf, nasc, email, fone);

        // Inicializando os atributos específicos de Professor.

        this.titulacao = titulacao;
        this.salario = salario;
    }

    // SOBRESCRITA (OVERRIDE) DE MÉTODO
    //
    // A classe Pessoa já possui um método chamado mostrarDados().
    //
    // Aqui estamos redefinindo esse método na classe Professor,
    // acrescentando informações específicas de um professor.
    //
    // A anotação @Override indica que estamos sobrescrevendo
    // um método herdado da superclasse.

    @Override
    public void mostrarDados() {

        // Chamando o método mostrarDados() da classe Pessoa.
        //
        // Com isso, reaproveitamos o código que apresenta
        // os dados comuns de qualquer pessoa.
        //
        // Depois, acrescentamos as informações específicas
        // de Professor.

        super.mostrarDados();

        System.out.printf("Salário: R$ %.2f \n", salario);
        System.out.printf("Titulação: %s \n", titulacao);
    }

    // Criando um segundo método para demonstrar o uso de protected.
    //
    // Diferentemente do método anterior, este método não apresenta
    // o CPF da pessoa.
    //
    // Observe que estamos acessando diretamente os atributos
    // nome, nascimento, email e telefone.
    //
    // Esses atributos foram declarados como protected na classe
    // Pessoa, permitindo seu acesso direto pelas subclasses.
    //
    // Portanto, não precisamos utilizar getters para acessar
    // esses atributos neste exemplo.

    public void mostrarDados2() {

        System.out.printf("Nome: %s \n", nome);

        // Acessando diretamente o atributo nascimento,
        // que foi herdado da classe Pessoa.

        System.out.printf("Nascimento: %s \n",
                          nascimento.escreverPorExtenso());

        System.out.printf("E-mail: %s \n", email);
        System.out.printf("Telefone/WhatsApp: %s \n", telefone);

        // Atributos específicos da classe Professor.

        System.out.printf("Salário: R$ %.2f \n", salario);
        System.out.printf("Titulação: %s \n", titulacao);

        // Observe que o CPF não foi apresentado.
        //
        // Isso demonstra que podemos escolher quais atributos
        // herdados serão utilizados em cada método.
    }

    // Método principal (main).
    //
    // Utilizado aqui para demonstrar a criação de um objeto
    // da classe Professor e a chamada de seus métodos.

    public static void main(String args[]) {

        // Criando um objeto Professor.
        //
        // Ao chamar o construtor, os dados comuns são encaminhados
        // para o construtor da classe Pessoa por meio de super(),
        // enquanto os dados específicos são inicializados
        // na própria classe Professor.

        Professor p1 = new Professor(
            "Renato dos Santos",
            "123.234.546-57",
            new Data(1, 5, 1990),
            "renato@escola.com",
            "(51) 9 8735-3454",
            "Mestre",
            12834.77f
        );

        // Chamando o método que apresenta os dados sem o CPF.

        p1.mostrarDados2();
    }
}
