package heranca;

public class Principal {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Lari", "15.981.08");
        System.out.println("Pessoa: ");
        System.out.println("Nome" + pessoa.getNome());
        System.out.println("Telefone" + pessoa.getTelefone());

        PessoaFisica pessoaFisica = new PessoaFisica("Lari", "15.981.08", "999.999.999", "999.999.999");
        System.out.println("Pessoa Física: " + pessoaFisica.getNome());
        System.out.println("Pessoa Física: " + pessoaFisica.getTelefone());
        System.out.println("Pessoa Física: " + pessoaFisica.getCpf());
        System.out.println("Pessoa Física: " + pessoaFisica.getRg());

        PessoaJuridica juridica = new PessoaJuridica("Latex", "15.981.08", "999.999");
        System.out.println("Pessoa juridica: " + juridica.getNome());
        System.out.println("Pessoa juridica: " + juridica.getTelefone());
        System.out.println("Pessoa juridica: " + juridica.getCnpj());
    }
}

