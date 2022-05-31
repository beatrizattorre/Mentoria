package Live.Funcionarios;

//a) Crie uma classe mãe chamada Funcionario com os atributos nome, cpf (passados pelo construtor),
// uma constante para armazenar o valor do salário mínimo e um método abstrato “calcularSalario”;

//b) Vendedores ganham 1 salário mínimo, mais uma comissão por vendas;

//c) Consultores ganham somente pelas horas que trabalharam.

public abstract class Funcionario {
    public Funcionario(String nome, long cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getCpf() {
        return cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    private long cpf;
    final Double SALARIO_MINIMO = 1212.0;
    public abstract double calcularSalario();
}
