package model;

public class Funcionario extends Pessoa {

    private int idFuncionario;
    private String cargo;
    
    public Funcionario(int idFuncionario, String nomePessoa, String dataNascimentoPessoa, String cpfPessoa, String enderecoPessoa, String cidadePessoa, String estadoPessoa, String cepPessoa, String telefonePessoa, String emailPessoa, String generoPessoa, String senhaPessoa, String cargo) {
        super(nomePessoa, cpfPessoa, dataNascimentoPessoa, enderecoPessoa, cidadePessoa, estadoPessoa, cepPessoa, telefonePessoa, emailPessoa, generoPessoa, senhaPessoa);
        this.idFuncionario = idFuncionario;
        this.cargo = cargo;
    }

    public Funcionario(int idFuncionario, String nomePessoa, String cpfPessoa, String emailPessoa, String generoPessoa, String cargo) {
           super(nomePessoa, cpfPessoa, emailPessoa, generoPessoa);
           this.idFuncionario = idFuncionario;
           this.cargo = cargo;
    }
      
    public  Funcionario(){
        super("","","","","","","","","","","");
    }

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }  

    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
}
