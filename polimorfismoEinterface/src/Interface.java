public class Interface {
    public static void main(String[] args){
        Gamer gamer = new Gamer();

        gamer.carregandoSistema();
        gamer.desligar();
        gamer.ligar();
        gamer.reiniciar();

        Home home = new Home();
        home.carregandoSistema();
        home.desligar();
        home.ligar();
        home.reiniciar();

    }
}
