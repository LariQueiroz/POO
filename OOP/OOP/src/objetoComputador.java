import java.util.Scanner;
public class objetoComputador {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        Computador c1 = new Computador();
        String marca;
        int memoria;
        String cor;
        String funcao;

        System.out.print("Insira a marca do computador: ");
        marca = ler.nextLine();
        System.out.print("Insira a memória do computador: ");
        memoria = ler.nextInt();
        System.out.print("Insira a cor do computador: ");
        cor = ler.nextLine();
        cor = ler.nextLine();
        System.out.print("Insira a função do computador: ");
        funcao = ler.nextLine();

        c1.setMarca(marca);
        c1.setMemoria(memoria);
        c1.setCor(cor);
        c1.setFuncao(funcao);

        System.out.println("Os dados digitados são: ");
        System.out.println(c1.getMarca());
        System.out.println(c1.getMemoria());
        System.out.println(c1.getCor());
        System.out.println(c1.getFuncao());
    }
}
