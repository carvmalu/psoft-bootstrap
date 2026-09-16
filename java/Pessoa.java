public class Pessoa {
    String nome;
    int idade;
    String cpf;
    String telefone;
    Cliente cliente;
    Funcionario funcionario;
    Endereco endereco;

    public Pessoa(String nome, int idade, String cpf, String telefone){
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public String getCpf(){
        return cpf;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String novo){
        this.telefone = novo;
    }
    public void setIdade(int novo){
        this.idade = novo;
    }

    public Cliente getCliente(){
        return cliente;
    }
    public Funcionario getFuncionario(){
        return funcionario;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setCliente(Cliente novo){
        this.cliente = novo;
    }


    public void setFuncionario(Funcionario novo){
        this.funcionario = novo;
    }

    public void setEndereco( Endereco novo){
        this.endereco = novo;
    }
}
