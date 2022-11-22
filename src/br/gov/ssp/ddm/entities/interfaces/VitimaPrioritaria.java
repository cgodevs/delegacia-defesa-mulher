package br.gov.ssp.ddm.entities.interfaces;

import br.gov.ssp.ddm.entities.DenunciaPrioritaria;
import br.gov.ssp.ddm.entities.enums.TipoDenuncia;

public interface VitimaPrioritaria {
    public abstract DenunciaPrioritaria denunciar(TipoDenuncia tipoDenuncia, VitimaPrioritaria vitima);
}
