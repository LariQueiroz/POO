package funcionario;

public class pessoaJuridica  extends Funcionario {
    private double valorBruto;
    private double impostos;

    public pessoaJuridica(long id, String nome, String telefone, int matricula, String endereco, Double valorBruto, Double impostos) {
        super(id, nome, telefone, matricula, endereco);
        this.valorBruto = valorBruto;
        this.impostos = impostos;
    }

    @Override
    public double calculaSalario() {
        return valorBruto - impostos;
    }
}