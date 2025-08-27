public class ConstrutorAnimal {
    public static void main(String[] args){
        Animal animal1 = new Animal();
        Animal animal2 = new Animal(2.00);
        Animal animal3 = new Animal(2.00, "Branco");

        System.out.println("----Animal1----");
        System.out.println("----Animal2----");
        System.out.println("Tamanho: "+animal2.getTamanho());
        System.out.println("----Animal3----");
        System.out.println("Tamanho: "+animal3.getTamanho());
        System.out.println("Cor: "+animal3.getCor());
    }
}
