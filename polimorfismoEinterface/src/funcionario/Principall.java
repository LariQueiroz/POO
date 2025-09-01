package funcionario;

public class Principall {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario(23432543, "Lari", "23423.453", 12,"rua");
        System.out.println("----Funcionário:---- ");
        System.out.println("ID: "+funcionario.getId());
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Telefone: "+funcionario.getTelefone());
        System.out.println("Matricula: "+funcionario.getMatricula());
        System.out.println("Endereço: "+funcionario.getEndereco());

        Jornada jornada = new Jornada(23432543, "Lari", "23423.453", 12, "rua", 20.0, 500);
        System.out.println("----Jornada:---- ");
        System.out.println("ID: "+funcionario.getId());
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Telefone: "+funcionario.getTelefone());
        System.out.println("Matricula: "+funcionario.getMatricula());
        System.out.println("Endereço: "+funcionario.getEndereco());
        System.out.println(funcionario.getNome()+ "Salario: R$"+funcionario.calculaSalario());

        Horista horista = new Horista(6, "Lari", "7598.766", 56, "rua", 20.00, 200);
        System.out.println("----Horista:---- ");
        System.out.println("ID: "+funcionario.getId());
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Telefone: "+funcionario.getTelefone());
        System.out.println("Matricula: "+funcionario.getMatricula());
        System.out.println("Endereço: "+funcionario.getEndereco());
        System.out.println(funcionario.getNome()+ "Salario: R$"+funcionario.calculaSalario());

        pessoaJuridica pessoajuridica= new pessoaJuridica(7, "Lari", "7598.766", 56, "rua", 6000.00, 200.00);
        System.out.println("----Pessoa Juridica:---- ");
        System.out.println("ID: "+funcionario.getId());
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Telefone: "+funcionario.getTelefone());
        System.out.println("Matricula: "+funcionario.getMatricula());
        System.out.println("Endereço: "+funcionario.getEndereco());
        System.out.println(funcionario.getNome()+ "Salario: R$"+funcionario.calculaSalario());
    }
}
