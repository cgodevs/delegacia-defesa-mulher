package br.gov.ssp.ddm.entities.superclasses;

import br.gov.ssp.ddm.entities.enums.TipoDenuncia;

public class Denunciante {
    public Denuncia denunciar(TipoDenuncia tipoDenuncia, Vitima vitima){
        return new Denuncia(tipoDenuncia, vitima, this);
    }

}
