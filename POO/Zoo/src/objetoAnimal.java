import java.util.Scanner;
public class objetoAnimal {

    public static void main (String[] args ) {
        Scanner ler = new Scanner(System.in);

        System.out.println("digite o nome do animal: ");
        String nome = ler.nextLine();
        System.out.println("digite a especie do animal: ");
        String especie = ler.nextLine();
        System.out.println("digite o peso do animal: ");
        double peso = ler.nextDouble();
        System.out.println("digite a idade do animal: ");
        int idade = ler.nextInt();

        Animal animal = new Animal();
        animal.setNome(nome);
        animal.setEspecie(especie);
        animal.setIdade(idade);
        animal.setPeso(peso);

        System.out.println("Dados do animal cadastrados:");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Espécie: " + animal.getEspecie());
        System.out.println("Idade: " + animal.getIdade() + " anos");
        System.out.println("Peso: " + animal.getPeso() + " kg");

    }
}
