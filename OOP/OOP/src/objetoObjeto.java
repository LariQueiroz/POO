import java.util.Scanner;
public class objetoObjeto {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        Objeto o1 = new Objeto();
        String nome;
        String cor;
        String funcao;
        int quantidade;

        System.out.print("Insira o nome do objeto: ");
        nome = ler.nextLine();
        System.out.print("Insira a cor do objeto: ");
        cor = ler.nextLine();
        System.out.print("Insira a função do objeto: ");
        funcao = ler.nextLine();
        System.out.print("Insira a quantidade do objeto: ");
        quantidade = ler.nextInt();

        o1.setNome(nome);
        o1.setCor(cor);
        o1.setFuncao(funcao);
        o1.setQuantidade(quantidade);

        System.out.println("----Os dados inseridos são:----");
        System.out.println(o1.getNome());
        System.out.println(o1.getCor());
        System.out.println(o1.getFuncao());
        System.out.println(o1.getQuantidade());
    }
}
