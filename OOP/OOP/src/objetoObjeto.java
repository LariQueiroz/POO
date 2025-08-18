import java.util.Scanner;
public class objetoObjeto {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        Objeto o1 = new Objeto();
        Objeto o2 = new Objeto();
        Objeto o3 = new Objeto();
        String nome;
        String cor;
        String funcao;
        int quantidade;

        System.out.print("Insira o nome do primeiro objeto: ");
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

        System.out.println("----Os dados inseridos do primeiro objeto é:----");
        System.out.println(o1.getNome());
        System.out.println(o1.getCor());
        System.out.println(o1.getFuncao());
        System.out.println(o1.getQuantidade());

        System.out.print("Insira o nome do segundo objeto: ");
        nome = ler.nextLine();
        nome = ler.nextLine();
        System.out.print("Insira a cor do objeto: ");
        cor = ler.nextLine();
        System.out.print("Insira a função do objeto: ");
        funcao = ler.nextLine();
        System.out.print("Insira a quantidade do objeto: ");
        quantidade = ler.nextInt();

        o2.setNome(nome);
        o2.setCor(cor);
        o2.setFuncao(funcao);
        o2.setQuantidade(quantidade);

        System.out.println("----Os dados inseridos do segundo objeto é:----");
        System.out.println(o2.getNome());
        System.out.println(o2.getCor());
        System.out.println(o2.getFuncao());
        System.out.println(o2.getQuantidade());

        System.out.print("Insira o nome do terceiro objeto: ");
        nome = ler.nextLine();
        nome = ler.nextLine();
        System.out.print("Insira a cor do objeto: ");
        cor = ler.nextLine();
        System.out.print("Insira a função do objeto: ");
        funcao = ler.nextLine();
        System.out.print("Insira a quantidade do objeto: ");
        quantidade = ler.nextInt();

        o3.setNome(nome);
        o3.setCor(cor);
        o3.setFuncao(funcao);
        o3.setQuantidade(quantidade);

        System.out.println("----Os dados inseridos do terceiro objeto é:----");
        System.out.println(o3.getNome());
        System.out.println(o3.getCor());
        System.out.println(o3.getFuncao());
        System.out.println(o3.getQuantidade());
    }
}
