public class Gamer implements Computador{

    @Override
    public void carregandoSistema() {
        System.out.println("Aguarde! O sistema está carregando!");
    }

    @Override
    public void desligar() {
        System.out.println("Desligar!");
    }

    @Override
    public void ligar() {
        System.out.println("Ligar");
    }

    @Override
    public void reiniciar() {
        System.out.println("Reiniciar!");
    }
}
