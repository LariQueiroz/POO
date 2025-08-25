package MODIFICADORES;

import java.util.Scanner;
public class ObjetoAutomovel {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        int velocidade;
        String cor;
        String nome;

        System.out.print("Insira a velocidade do automóvel: ");
        velocidade = ler.nextInt();
        System.out.print("Insira a cor do automóvel: ");
        cor = ler.nextLine();
        cor = ler.nextLine();
        System.out.print("Insira o nome do automóvel: ");
        nome = ler.nextLine();

        Automovel automovel1 = new Automovel();
        automovel1.setVelocidade(velocidade);
        automovel1.setCor(cor);
        automovel1.setNome(nome);

        System.out.println("----OS DADOS INSERIDOS SÃO:----");
        System.out.println(automovel1.getVelocidade());
        System.out.println(automovel1.getCor());
        System.out.println(automovel1.getNome());

    }
}
