package model;

public class Pessoa {
    int idPessoa;
    private String nomePessoa;
    private String cpfPessoa;
    private String dataNascimentoPessoa;
    private String enderecoPessoa;
    private String cidadePessoa;
    private String estadoPessoa;
    private String cepPessoa;
    private String telefonePessoa;
    private String emailPessoa;
    private String generoPessoa;
    private String senhaPessoa;

    public Pessoa(String nomePessoa, String dataNascimentoPessoa, String cpfPessoa, String enderecoPessoa, String cidadePessoa, String estadoPessoa, String cepPessoa, String telefonePessoa, String emailPessoa, String generoPessoa, String senhaPessoa) {
        this.nomePessoa = nomePessoa;
        this.cpfPessoa = cpfPessoa;
        this.dataNascimentoPessoa = dataNascimentoPessoa;
        this.enderecoPessoa = enderecoPessoa;
        this.cidadePessoa = cidadePessoa;
        this.estadoPessoa = estadoPessoa;
        this.cepPessoa = cepPessoa;
        this.telefonePessoa = telefonePessoa;
        this.emailPessoa = emailPessoa;
        this.generoPessoa = generoPessoa;
        this.senhaPessoa = senhaPessoa;
    }
    
    public Pessoa(String nomePessoa, String cpfPessoa, String emailPessoa, String generoPessoa){
        this.nomePessoa = nomePessoa;
        this.cpfPessoa = cpfPessoa;
        this.emailPessoa = emailPessoa;
        this.generoPessoa = generoPessoa;
    }

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int codigoPessoa) {
        this.idPessoa = codigoPessoa;
    }

    public String getNomePessoa() {
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getDataNascimentoPessoa() {
        return dataNascimentoPessoa;
    }

    public void setDataNascimentoPessoa(String dataNascimentoPessoa) {
        this.dataNascimentoPessoa = dataNascimentoPessoa;
    }

    public String getCpfPessoa() {
        return cpfPessoa;
    }

    public void setCpfPessoa(String cpfPessoa) {
        this.cpfPessoa = cpfPessoa;
    }

    public String getEnderecoPessoa() {
        return enderecoPessoa;
    }

    public void setEnderecoPessoa(String enderecoPessoa) {
        this.enderecoPessoa = enderecoPessoa;
    }

    public String getCepPessoa() {
        return cepPessoa;
    }

    public void setCepPessoa(String cepPessoa) {
        this.cepPessoa = cepPessoa;
    }

    public String getCidadePessoa() {
        return cidadePessoa;
    }

    public void setCidadePessoa(String cidadePessoa) {
        this.cidadePessoa = cidadePessoa;
    }

    public String getEmailPessoa() {
        return emailPessoa;
    }

    public void setEmailPessoa(String emailPessoa) {
        this.emailPessoa = emailPessoa;
    }

    public String getEstadoPessoa() {
        return estadoPessoa;
    }

    public void setEstadoPessoa(String estadoPessoa) {
        this.estadoPessoa = estadoPessoa;
    }

    public String getGeneroPessoa() {
        return generoPessoa;
    }

    public void setGeneroPessoa(String generoPessoa) {
        this.generoPessoa = generoPessoa;
    }
    
    public String getTelefonePessoa() {
        return telefonePessoa;
    }

    public void setTelefonePessoa(String telefonePessoa) {
        this.telefonePessoa = telefonePessoa;
    }
    public String getSenhaPessoa(){
        return senhaPessoa;
    }
    public void setSenhaPessoa(String senhaPessoa){
        this.senhaPessoa = senhaPessoa;
    }
    
}