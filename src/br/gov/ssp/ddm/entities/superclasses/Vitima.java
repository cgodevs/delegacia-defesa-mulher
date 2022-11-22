package br.gov.ssp.ddm.entities.superclasses;

import br.gov.ssp.ddm.entities.Endereco;
import br.gov.ssp.ddm.entities.enums.TipoDenuncia;

public class Vitima extends Denunciante{
    private String nome;
    private Endereco endereco;

    public Vitima(Endereco endereco) {
        super();
        this.endereco = endereco;
    }

    public Vitima(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Vitima{" +
                "nome='" + nome + '\'' +
                ", endereco=" + endereco +
                '}';
    }
}
