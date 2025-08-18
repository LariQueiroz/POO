import java.util.Scanner;
public class objetoPaciente {
    public static void main (String [] args){
        Scanner ler = new Scanner(System.in);
        paciente p1 = new paciente();
        String nome;
        String endereco;
        int cpf;
        char sexo;
        String nivelDeEscolaridade;
        String email;
        int dataDeNascimento;
        int telefone;

        System.out.print("Insira o nome do paciente: ");
        nome = ler.nextLine();
        System.out.print("Insira o endereço do paciente: ");
        endereco = ler.nextLine();
        System.out.print("Insira o CPF do paciente: ");
        cpf = ler.nextInt();
        System.out.print("Insira o sexo do paciente(f)(m): ");
        sexo = ler.next().charAt(0);
        System.out.print("Insira o nível de escolaridade do paciente: ");
        nivelDeEscolaridade = ler.nextLine();
        System.out.print("Insira o email do paciente: ");
        email = ler.nextLine();
        System.out.print("Insira a data de nascimento do paciente: ");
        dataDeNascimento = ler.nextInt();
        System.out.print("Insira o telefone do paciente: ");
        telefone = ler.nextInt();

        p1.setNome(nome);
        p1.setEndereco(endereco);
        p1.setCpf(cpf);
        p1.setSexo(sexo);
        p1.setNivelDeEscolaridade(nivelDeEscolaridade);
        p1.setEmail(email);
        p1.setDataDeNascimento(dataDeNascimento);
        p1.setTelefone(telefone);

        System.out.println("----Os dados insiridos são:----");
        System.out.println(p1.getNome());
        System.out.println(p1.getEndereco());
        System.out.println(p1.getCpf());
        System.out.println(p1.getSexo());
        System.out.println(p1.getNivelDeEscolaridade());
        System.out.println(p1.getEmail());
        System.out.println(p1.getDataDeNascimento());
        System.out.println(p1.getTelefone());
    }
}