import java.util.Scanner;
public class objetoAviao {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        Aviao a1 = new Aviao();
        Aviao a2 = new Aviao();
        Aviao a3 = new Aviao();

        String tipo;
        String cor;
        int velocidade;
        int quantidadeAssento;

        System.out.print("Insira o tipo do primeiro avião: ");
        tipo = ler.nextLine();
        System.out.print("Insira a cor do avião: ");
        cor = ler.nextLine();
        System.out.print("Insira a velocidade do avião: ");
        velocidade = ler.nextInt();
        System.out.print("Insira a quantidade de assentos que tem no avião:");
        quantidadeAssento = ler.nextInt();

        a1.setTipo(tipo);
        a1.setCor(cor);
        a1.setVelocidade(velocidade);
        a1.setQuantidadeAssento(quantidadeAssento);

        System.out.println("----Os dados do primeiro avião informado é:----");
        System.out.println(a1.getTipo());
        System.out.println(a1.getCor());
        System.out.println(a1.getVelocidade());
        System.out.println(a1.getQuantidadeAssento());

        System.out.print("Insira o tipo do segundo avião: ");
        tipo = ler.nextLine();
        tipo = ler.nextLine();
        System.out.print(" Insira a cor do avião: ");
        cor = ler.nextLine();
        System.out.print("Insira a velocidade do avião: ");
        velocidade = ler.nextInt();
        System.out.print("Insira a quantidade de assentos que tem no avião:");
        quantidadeAssento = ler.nextInt();

        a2.setTipo(tipo);
        a2.setCor(cor);
        a2.setVelocidade(velocidade);
        a2.setQuantidadeAssento(quantidadeAssento);

        System.out.println("----Os dados do segundo avião informado é:----");
        System.out.println(a2.getTipo());
        System.out.println(a2.getCor());
        System.out.println(a2.getVelocidade());
        System.out.println(a2.getQuantidadeAssento());

        System.out.print("Insira o tipo do terceiro avião: ");
        tipo = ler.nextLine();
        tipo = ler.nextLine();
        ler.nextLine();
        System.out.print("Insira a cor do avião: ");
        cor = ler.nextLine();
        System.out.print("Insira a velocidade do avião: ");
        velocidade = ler.nextInt();
        System.out.print("Insira a quantidade de assentos que tem no avião:");
        quantidadeAssento = ler.nextInt();

        a3.setTipo(tipo);
        a3.setCor(cor);
        a3.setVelocidade(velocidade);
        a3.setQuantidadeAssento(quantidadeAssento);

        System.out.println("----Os dados do terceiro avião informado é:----");
        System.out.println(a3.getTipo());
        System.out.println(a3.getCor());
        System.out.println(a3.getVelocidade());
        System.out.println(a3.getQuantidadeAssento());
    }
}
