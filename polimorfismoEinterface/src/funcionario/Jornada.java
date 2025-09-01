package funcionario;

public class Jornada extends Funcionario{
    private double salarioHora;
    private int horasTrabalhadas;

    public Jornada(long id, String nome, String telefone, int matricula, String endereco, Double salarioHora, int horasTrabalhadas) {
        super(id, nome, telefone, matricula, endereco);
        this.salarioHora = salarioHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calculaSalario() {
        return salarioHora * horasTrabalhadas;
    }
}
