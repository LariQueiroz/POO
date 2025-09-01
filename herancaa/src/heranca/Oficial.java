package heranca;

public class Oficial {
    public static void main(String[] args){
        Veiculo veiculo = new Veiculo ("honda", "xxx", 2019, "amarelo");

        System.out.println("Veiculo: ");
        System.out.println("Marca: "+veiculo.getMarca());
        System.out.println("Modelo: "+veiculo.getModelo());
        System.out.println("Ano: "+veiculo.getAno());
        System.out.println("Cor: "+veiculo.getCor());

        Automovel automovel = new Automovel("honda", "XXX", 2019, "amarelo", 4, "xxxxx");
        System.out.println("Marca: "+automovel.getMarca());
        System.out.println("Modelo: "+automovel.getModelo());
        System.out.println("Ano: "+automovel.getAno());
        System.out.println("Cor: "+automovel.getCor());
        System.out.println("Número e portas: "+automovel.getPortas());
        System.out.println("Motor: "+automovel.getMotor());

        Moto moto = new Moto("honda", "xxx", 2019, "vermelho", 9999);
        System.out.println("Moto: ");
        System.out.println("Marca: "+moto.getMarca());
        System.out.println("Marca: "+moto.getModelo());
        System.out.println("Marca: "+moto.getAno());
        System.out.println("Marca: "+moto.getCor());
        System.out.println("Marca: "+moto.getCilindrada());
    }
}
