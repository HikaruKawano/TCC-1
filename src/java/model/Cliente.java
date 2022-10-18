package model;

public class Cliente extends Pessoa{

    private int idCliente;

    public Cliente(int idCliente,String nomePessoa, String dataNascimentoPessoa, String cpfPessoa, String enderecoPessoa,  String cidadePessoa, String estadoPessoa, String cepPessoa, String telefonePessoa, String emailPessoa, String generoPessoa, String senhaPessoa) {
        super(nomePessoa, dataNascimentoPessoa, cpfPessoa, enderecoPessoa, cidadePessoa, estadoPessoa, cepPessoa, telefonePessoa, emailPessoa, generoPessoa, senhaPessoa);
        this.idCliente = idCliente;
    }
    
    public Cliente(){
        super("","","","","","","","","","","");
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
}
    
    