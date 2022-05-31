package Live.Funcionarios;

public class Vendedor extends Funcionario {
    public Vendedor(String nome, long cpf) {
        super(nome, cpf);
    }

    public Vendedor(String nome, long cpf, double comissao, int quantVendas) {
        super(nome, cpf);
        this.comissao = comissao;
        this.quantVendas = quantVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public int getQuantVendas() {
        return quantVendas;
    }

    public void setQuantVendas(int quantVendas) {
        this.quantVendas = quantVendas;
    }

    private double comissao;
    private int quantVendas;


    @Override
    public double calcularSalario() {
        return (SALARIO_MINIMO + (this.comissao * this.quantVendas));
    }
}
