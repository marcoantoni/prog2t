
// Classe base (superclasse)
//
// A classe Pessoa representa uma estrutura comum que poderá ser
// reutilizada por outras classes, como Professor e Aluno.
//
// Por meio da herança, essas classes poderão aproveitar os atributos
// e métodos definidos aqui, evitando a repetição de código.

class Pessoa {

    // Atributos com modificador de acesso protected.
    //
    // O protected permite que os atributos sejam acessados diretamente
    // pelas classes que herdam de Pessoa (subclasses), como Professor
    // e Aluno.
    //
    // Também permite o acesso por outras classes do mesmo pacote.
    //
    // Diferentemente do private, não restringe o acesso apenas à
    // própria classe.

    protected String nome;
    protected String cpf;
    protected Data nascimento;
    protected String email;
    protected String telefone;

    // Método construtor da classe Pessoa.
    //
    // Recebe os dados necessários para inicializar os atributos
    // de uma pessoa.
    //
    // Como Professor e Aluno herdarão de Pessoa, poderão utilizar
    // este construtor por meio da palavra-chave super.

    public Pessoa(String nome, String cpf, Data nascimento,
                  String email, String telefone) {

        // Inicializando os atributos da classe.
        //
        // Para simplificar o exemplo didático, não estamos realizando
        // validações dos dados recebidos.

        this.nome = nome;
        this.cpf = cpf;
        this.nascimento = nascimento;
        this.email = email;
        this.telefone = telefone;
    }

    // Método responsável por apresentar os dados de uma pessoa.
    //
    // Este método também poderá ser aproveitado pelas classes
    // Professor e Aluno, sem a necessidade de reescrevê-lo.

    public void mostrarDados() {

        System.out.printf("Nome: %s \n", nome);
        System.out.printf("CPF: %s \n", cpf);
        System.out.printf("Nascimento: %s \n",
                          nascimento.escreverPorExtenso());
        System.out.printf("E-mail: %s \n", email);
        System.out.printf("Telefone/WhatsApp: %s \n", telefone);
    }

    // Observação:
    // Este exemplo não utiliza encapsulamento.
    //
    // Os atributos estão declarados como protected e não existem
    // métodos getters e setters.
    //
    // Essa abordagem foi adotada para simplificar a compreensão
    // do conceito de herança, sem introduzir outros conceitos
    // neste primeiro momento.
}
