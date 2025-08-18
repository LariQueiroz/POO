public class funcionario {
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

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public int getCpf(){
        return cpf;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public int getTelefone(){
        return telefone;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
    public int getdataAdmissao(){
        return dataAdmissao;
    }
    public void setdataAdmissao(int dataAdimissao){
        this.dataAdmissao = dataAdimissao;
    }
    public int getdataDeDemissao(){
        return dataDeDemissao;
    }
    public void setdataDeDemissao(int dataDeDemissao){
        this.dataDeDemissao = dataDeDemissao;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getSexo(){
        return sexo;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public String getnivelDeEscolaridade(){
        return nivelDeEscolaridade;
    }
    public void setnivelDeEscolaridade(String nivelDeescolaridade){
        this.nivelDeEscolaridade = nivelDeEscolaridade;
    }
}
