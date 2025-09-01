package funcionario;

public class Horista extends Funcionario {
    private double valorHora;
    private int quantidadeHoras;

    public Horista(long id, String nome, String telefone, int matricula, String endereco, Double valorHora, int quantidadeHoras) {
        super(id, nome, telefone, matricula, endereco);
        this.valorHora = valorHora;
        this.quantidadeHoras = quantidadeHoras;
    }

    @Override
    public double calculaSalario() {
        return valorHora * quantidadeHoras;
    }
}