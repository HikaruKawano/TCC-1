package model;

import java.io.File;

public class Funcionario extends Pessoa {

    private int idFuncionario;
    private String imagem;
    private String nomeImg;
    private String cargo;

    public Funcionario(int idFuncionario, String imagem, String nomePessoa, String cpfPessoa, String dataNascimentoPessoa, String cepPessoa, String cidadePessoa, String bairroPessoa, String ruaPessoa, String numeroPessoa, String complementoPessoa, String estadoPessoa, String telefonePessoa, String emailPessoa, String generoPessoa, String senhaPessoa,  String cargo, String logouPessoa) {
        super(nomePessoa, dataNascimentoPessoa, cpfPessoa, cepPessoa, cidadePessoa, bairroPessoa, ruaPessoa, numeroPessoa, complementoPessoa, estadoPessoa, telefonePessoa, emailPessoa, generoPessoa, senhaPessoa, logouPessoa);
        this.idFuncionario = idFuncionario;
        this.imagem = imagem;
        this.cargo = cargo;
    }

    public Funcionario(int idFuncionario, String imagem, String nomeImg, String nomePessoa, String cpfPessoa, String emailPessoa, String generoPessoa, String cargo) {
           super(nomePessoa, cpfPessoa, emailPessoa, generoPessoa);
           this.idFuncionario = idFuncionario;
           this.imagem = imagem;
           this.nomeImg = nomeImg;
           this.cargo = cargo;
    }
      
    public  Funcionario(){
        super("","","","","","","","","","","","","");
    }
    
    public Funcionario(int idFuncionario, String imagem, String nomeImg, String nomePessoa, String cepPessoa, String cidadePessoa, String bairroPessoa, String ruaPessoa, String numeroPessoa, String complementoPessoa, String estadoPessoa, String telefonePessoa, String emailPessoa, String generoPessoa, String senhaPessoa, String cargo) {
        super(nomePessoa, cepPessoa, cidadePessoa, bairroPessoa, ruaPessoa, numeroPessoa, complementoPessoa, estadoPessoa, telefonePessoa, emailPessoa, generoPessoa, senhaPessoa);
        this.imagem = imagem;
        this.nomeImg = nomeImg;
        this.idFuncionario = idFuncionario;
        this.cargo = cargo;
    }

    public Funcionario(int idFuncionario, String imagem, String nomeImg, String nomePessoa, String cpfPessoa, String dataNascimentoPessoa, String cepPessoa, String cidadePessoa, String bairroPessoa, String ruaPessoa, String numeroPessoa, String complementoPessoa, String estadoPessoa, String telefonePessoa, String emailPessoa, String generoPessoa, String cargo) {
        super(nomePessoa, cpfPessoa, dataNascimentoPessoa, cepPessoa, cidadePessoa, bairroPessoa, ruaPessoa, numeroPessoa, complementoPessoa, estadoPessoa, telefonePessoa, emailPessoa, generoPessoa);
        this.idFuncionario = idFuncionario;
        this.imagem = imagem;
        this.nomeImg = nomeImg;
        this.cargo = cargo;
    }
   
   public Funcionario(int idFuncionario){
       this.idFuncionario = idFuncionario;
   }
   public Funcionario(File filePath, String nomeImg) {
        this.imagem = imagem;
        this.nomeImg = nomeImg;
    }
   
    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }  
    
    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getNomeImg() {
        return nomeImg;
    }

    public void setNomeImg(String nomeImg) {
        this.nomeImg = nomeImg;
    }

    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo){
        this.cargo = cargo;
    }
}
