package model;

public class Funcionario extends Pessoa {

    private int idFuncionario;
    private String cargo;

    public Funcionario(int idFuncionario, String nomePessoa, String cpfPessoa, String dataNascimentoPessoa, String cepPessoa, String cidadePessoa, String bairroPessoa, String numeroPessoa, String complementoPessoa, String estadoPessoa, String telefonePessoa, String emailPessoa, String generoPessoa, String senhaPessoa,  String cargo, String logouPessoa) {
        super(nomePessoa, dataNascimentoPessoa, cpfPessoa, cepPessoa, cidadePessoa, bairroPessoa, numeroPessoa, complementoPessoa, estadoPessoa, telefonePessoa, emailPessoa, generoPessoa, senhaPessoa, logouPessoa);
        this.idFuncionario = idFuncionario;
        this.cargo = cargo;
    }

    public Funcionario(int idFuncionario, String nomePessoa, String cpfPessoa, String emailPessoa, String generoPessoa, String cargo) {
           super(nomePessoa, cpfPessoa, emailPessoa, generoPessoa);
           this.idFuncionario = idFuncionario;
           this.cargo = cargo;
    }
      
    public  Funcionario(){
        super("","","","","","","","","","","","","","");
    }
    
    public Funcionario(int idFuncionario, String nomePessoa, String cepPessoa, String cidadePessoa, String bairroPessoa, String numeroPessoa, String complementoPessoa, String estadoPessoa, String telefonePessoa, String emailPessoa, String generoPessoa, String senhaPessoa, String cargo) {
        super(nomePessoa, cepPessoa, cidadePessoa, bairroPessoa, numeroPessoa, complementoPessoa, estadoPessoa, telefonePessoa, emailPessoa, generoPessoa, senhaPessoa);
        this.idFuncionario = idFuncionario;
        this.cargo = cargo;
    }

    public Funcionario(int idFuncionario, String nomePessoa, String cpfPessoa, String dataNascimentoPessoa, String cepPessoa, String cidadePessoa, String bairroPessoa, String numeroPessoa, String complementoPessoa, String estadoPessoa, String telefonePessoa, String emailPessoa, String generoPessoa, String cargo) {
        super(nomePessoa, cpfPessoa, dataNascimentoPessoa, cepPessoa, cidadePessoa, bairroPessoa, numeroPessoa, complementoPessoa, estadoPessoa, telefonePessoa, emailPessoa, generoPessoa);
        this.idFuncionario = idFuncionario;
        this.cargo = cargo;
    }
   
   public Funcionario(int idFuncionario){
       this.idFuncionario = idFuncionario;
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
