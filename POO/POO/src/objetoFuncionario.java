import java.util.Scanner;
public class objetoFuncionario {
    public static void main (String[] args){
        Scanner ler = new Scanner (System.in);
        funcionario f1 = new funcionario();
        String nome;
        String endereco;
        int cpf;
        int telefone;
        String cargo;
        int dataAdmissao;
        int dataDeDemissao;
        String email;
        char sexo;
        String nivelDeEscolaridade;

        System.out.print("Insira o nome do funcionário: ");
        nome = ler.nextLine();
        System.out.print("Insira o endereço do funcionário: ");
        endereco = ler.nextLine();
        System.out.print("Insira o CPF do funcionário: ");
        cpf = ler.nextInt();
        System.out.print("Insira o telefone do funcionário: ");
        telefone = ler.nextInt();
        System.out.print("Insira o cargo do funcionário: ");
        cargo = ler.nextLine();
        System.out.print("Insira a data de admissão do funcionário: ");
        dataAdmissao = ler.nextInt();
        System.out.print("Insira a data de demissão do funcionário: ");
        dataDeDemissao = ler.nextInt();
        System.out.print("Insira o email do funcionário: ");
        email = ler.nextLine();
        System.out.print("Insira o sexo do funcionário (f)(m): ");
        sexo = ler.next().charAt(0);
        System.out.print("Insira o nível de escolaridade do funcionário: ");
        nivelDeEscolaridade = ler.nextLine();

        f1.setNome(nome);
        f1.setEndereco(endereco);
        f1.setCpf(cpf);
        f1.setTelefone(telefone);
        f1.setCargo(cargo);
        f1.setdataAdmissao(dataAdmissao);
        f1.setdataDeDemissao(dataDeDemissao);
        f1.setEmail(email);
        f1.setSexo(sexo);
        f1.setnivelDeEscolaridade(nivelDeEscolaridade);

        System.out.println("Os dados inseridos são:----");
        System.out.print(f1.getNome());
        System.out.print(f1.getEndereco());
        System.out.print(f1.getCpf());
        System.out.print(f1.getTelefone());
        System.out.print(f1.getCargo());
        System.out.print(f1.getdataAdmissao());
        System.out.print(f1.getdataDeDemissao());
        System.out.print(f1.getEmail());
        System.out.print(f1.getSexo());
        System.out.print(f1.getTelefone());
    }
}