package br.gov.ssp.ddm.entities.interfaces;

import br.gov.ssp.ddm.entities.DenunciaPrioritaria;

public interface PrioridadeParaPessoasVulneraveis {
    public abstract void receberDenuncia(DenunciaPrioritaria denuncia);
}
