package model;


public class proprietario extends Pessoa {
    
    int idProprietario;
    
    public proprietario(int idProprietario, String nomePessoa, String cpfPessoa, String dataNascimentoPessoa, String enderecoPessoa, String cidadePessoa, String estadoPessoa, String cepPessoa, String telefonePessoa, String emailPessoa, String generoPessoa, String senhaPessoa) {
        super(nomePessoa, cpfPessoa, dataNascimentoPessoa, enderecoPessoa, cidadePessoa, estadoPessoa, cepPessoa, telefonePessoa, emailPessoa, generoPessoa, senhaPessoa);
        this.idProprietario = idProprietario;
    }
    
    public int getIdProprietario(){
        return idProprietario;
    }
    public void setIdProprietario(int idProprietario){
        this.idProprietario = idProprietario;
    }
}
