package heranca;

public class Automovel extends Veiculo{
    private int portas;
    private String motor;

    public Automovel(String marca, String modelo, int ano, String cor, int portas, String motor){
        super(marca, modelo, ano, cor);
        this.portas = portas;
        this.motor = motor;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }
}
