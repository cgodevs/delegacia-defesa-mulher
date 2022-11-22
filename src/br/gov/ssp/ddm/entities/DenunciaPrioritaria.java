package br.gov.ssp.ddm.entities;

import br.gov.ssp.ddm.entities.enums.TipoDenuncia;
import br.gov.ssp.ddm.entities.superclasses.Denuncia;
import br.gov.ssp.ddm.entities.superclasses.Denunciante;
import br.gov.ssp.ddm.entities.superclasses.Vitima;

public class DenunciaPrioritaria extends Denuncia {

    public DenunciaPrioritaria(TipoDenuncia tipoDenuncia, Vitima vitima, Denunciante denunciante) {
        super(tipoDenuncia, vitima, denunciante, "Rápido");
    }
}
