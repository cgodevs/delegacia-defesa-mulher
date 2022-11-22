package br.gov.ssp.ddm.entities.superclasses;

import br.gov.ssp.ddm.entities.enums.TipoDenuncia;

public class Denuncia {
    private TipoDenuncia tipoDenuncia;
    private Vitima vitima;
    private Denunciante denunciante;

    private String tempoDeResolucao;

    public Denuncia(TipoDenuncia tipoDenuncia, Vitima vitima, Denunciante denunciante, String tempoDeResolucao) {
        this.tipoDenuncia = tipoDenuncia;
        this.vitima = vitima;
        this.denunciante = denunciante;
        this.tempoDeResolucao = tempoDeResolucao;
    }

    public Denuncia(TipoDenuncia tipoDenuncia, Vitima vitima, Denunciante denunciante) {
        this.tipoDenuncia = tipoDenuncia;
        this.vitima = vitima;
        this.denunciante = denunciante;
        this.tempoDeResolucao = "Padrão";
    }

    public TipoDenuncia getTipoDenuncia() {
        return tipoDenuncia;
    }

    public void setTipoDenuncia(TipoDenuncia tipoDenuncia) {
        this.tipoDenuncia = tipoDenuncia;
    }

    public Vitima getVitima() {
        return vitima;
    }

    public void setVitima(Vitima vitima) {
        this.vitima = vitima;
    }

    public Denunciante getDenunciante() {
        return denunciante;
    }

    public void setDenunciante(Denunciante denunciante) {
        this.denunciante = denunciante;
    }

    public String getTempoDeResolucao() {
        return tempoDeResolucao;
    }

    public void setTempoDeResolucao(String tempoDeResolucao) {
        this.tempoDeResolucao = tempoDeResolucao;
    }

    @Override
    public String toString() {
        return "Denuncia{" +
                "tipoDenuncia=" + tipoDenuncia +
                ", vitima=" + vitima +
                ", denunciante=" + denunciante +
                ", tempoDeResolucao='" + tempoDeResolucao + '\'' +
                '}';
    }
}
