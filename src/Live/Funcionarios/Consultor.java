package Live.Funcionarios;

public class Consultor extends Funcionario {
    public Consultor(String nome, long cpf) {
        super(nome, cpf);
    }
    private double horasTrabalhadas;
    private double valorHora;

    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(double horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Consultor(String nome, long cpf, double horasTrabalhadas, double valorHora) {
        super(nome, cpf);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularSalario() {
        return (this.horasTrabalhadas * this.valorHora);
    }
}
