package br.gov.ssp.ddm.entities;

import br.gov.ssp.ddm.entities.enums.TipoDenuncia;
import br.gov.ssp.ddm.entities.superclasses.Vitima;
import br.gov.ssp.ddm.entities.interfaces.VitimaPrioritaria;

public class Mulher extends Vitima implements VitimaPrioritaria {

    public Mulher(String nome, Endereco endereco) {
        super(nome, endereco);
    }

    @Override
    public DenunciaPrioritaria denunciar(TipoDenuncia tipoDenuncia, VitimaPrioritaria vitima) {
        return new DenunciaPrioritaria(tipoDenuncia, this, this);
    }
}
