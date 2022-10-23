package model;

public class Cliente extends Pessoa{

    private int idCliente;

    public Cliente(int idCliente, String nomePessoa, String cpfPessoa, String dataNascimentoPessoa, String cepPessoa, String cidadePessoa, String bairroPessoa, String numeroPessoa, String complementoPessoa, String estadoPessoa, String telefonePessoa, String emailPessoa, String generoPessoa, String senhaPessoa, String logouPessoa) {
        super(nomePessoa, cpfPessoa,  dataNascimentoPessoa, cepPessoa, cidadePessoa, bairroPessoa, numeroPessoa, complementoPessoa, estadoPessoa, telefonePessoa, emailPessoa, generoPessoa, senhaPessoa, logouPessoa);
        this.idCliente = idCliente;
    }
    
    public Cliente(){
        super("","","","","","","","","","","","","","");
    }
 
    public Cliente(int idCliente, String nomePessoa, String dataNascimentoPessoa, String cepPessoa, String cidadePessoa, String bairroPessoa, String numeroPessoa, String complementoPessoa, String estadoPessoa, String telefonePessoa, String emailPessoa, String generoPessoa) {
        super(nomePessoa, dataNascimentoPessoa, cepPessoa, cidadePessoa, bairroPessoa, numeroPessoa, complementoPessoa, estadoPessoa, telefonePessoa, emailPessoa, generoPessoa);
        this.idCliente = idCliente;
    }


    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente){
        this.idCliente = idCliente;
    }
}
    
    