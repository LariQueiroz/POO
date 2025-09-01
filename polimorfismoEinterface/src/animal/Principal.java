package animal;

public class Principal {
    public static void main (String[] args){

        Lobo lobo = new Lobo("Thor", "M", "Qualquer");
        lobo.emitirSom();

        Leao leao = new Leao("Thor", "M", "qualquer");
        leao.emitirSom();

        Tigre tigre = new Tigre("Thor", "M", "Qualquer");
        tigre.emitirSom();

        Cachorro cachorro = new Cachorro("Laika", "F", "Vira-lata");
        cachorro.emitirSom();

        Gato gato = new Gato("Thor", "M", "Qualquer");
        gato.emitirSom();
    }
}
