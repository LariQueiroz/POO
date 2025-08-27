import java.util.Scanner;
public class ConstrutorPessoa {
    public static void main (String [] args){
        Scanner ler= new Scanner (System.in);
        System.out.println ("Insira o seu nome:");
        String nome=ler.nextLine();
        System.out.println ("Qual a sua idade?:");
        int idade= ler.nextInt();

        Pessoa jogador2 = new Pessoa ();
        jogador2.setNome (nome);
        jogador2.setIdade (idade);

        System.out.println (jogador2.getNome());
        System.out.println (jogador2.getIdade()+" anos");
    }
}