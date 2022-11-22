package br.gov.ssp.ddm.entities;

public class Endereco {
    private String cidade;
    private String regiao;
    private String rua;
    private String numero;
    private String andar;

    private String cep;
    private String telefone;

    public Endereco(){}

    public Endereco(String rua, String numero, String cidade) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
    }

    public Endereco(String cep, String cidade) {
        this.cep = cep;
        this.cidade = cidade;
    }

    public Endereco(String cidade, String regiao, String rua, String numero, String cep) {
        this.cidade = cidade;
        this.regiao = regiao;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
    }

    public Endereco(String cidade, String regiao, String rua, String numero, String cep, String telefone) {
        this.cidade = cidade;
        this.regiao = regiao;
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.telefone = telefone;
    }

    public Endereco(String cidade, String regiao, String rua, String numero, String andar, String cep, String telefone) {
        this.cidade = cidade;
        this.regiao = regiao;
        this.rua = rua;
        this.numero = numero;
        this.andar = andar;
        this.cep = cep;
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade='" + cidade + '\'' +
                ", regiao='" + regiao + '\'' +
                ", rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", andar='" + andar + '\'' +
                ", cep='" + cep + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
