package br.gov.ssp.ddm.entities.superclasses;

import br.gov.ssp.ddm.entities.Endereco;

import java.util.ArrayList;

public abstract class Delegacia {
    private String nome;
    private Endereco endereco;
    private String andar;
    private String telefone;
    private ArrayList<Denuncia> listaDeDenuncias;

    protected Delegacia(String nome, Endereco endereco, String andar, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.andar = andar;
        this.telefone = telefone;
        this.listaDeDenuncias = new ArrayList<Denuncia>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Denuncia> getListaDeDenuncias() {
        return listaDeDenuncias;
    }

    public void receberDenuncia(Denuncia denuncia){
        this.listaDeDenuncias.add(denuncia);
    }
}
