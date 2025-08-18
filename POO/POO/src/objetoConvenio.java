import java.util.Scanner;
public class objetoConvenio {
    public static void main (String[] args) {
        Scanner ler = new Scanner(System.in);
        convenio c1 = new convenio();
        String nome;
        String plano;
        String tarifa;

        System.out.print("Insira o nome: ");
        nome = ler.nextLine();
        System.out.print("Insira o plano: ");
        plano = ler.nextLine();
        System.out.print("Insira a tarifa: ");
        tarifa = ler.nextLine();

        c1.setNome(nome);
        c1.setPlano(plano);
        c1.setTarifa(tarifa);

        System.out.println("----Os dados insiridos são:----");
        System.out.println(c1.getNome());
        System.out.println(c1.getPlano());
        System.out.println(c1.getTarifa());
    }
}
