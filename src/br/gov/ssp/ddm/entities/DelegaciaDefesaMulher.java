package br.gov.ssp.ddm.entities;

import br.gov.ssp.ddm.entities.interfaces.PrioridadeParaPessoasVulneraveis;
import br.gov.ssp.ddm.entities.superclasses.Delegacia;
import br.gov.ssp.ddm.entities.interfaces.VitimaPrioritaria;

import java.util.ArrayList;

public class DelegaciaDefesaMulher extends Delegacia implements PrioridadeParaPessoasVulneraveis {
    private ArrayList<DenunciaPrioritaria> listaDePrioridade;
    private ArrayList<VitimaPrioritaria> vitimasPrioritarias;

    public DelegaciaDefesaMulher(String nome, Endereco endereco, String andar, String telefone) {
        super(nome, endereco, andar, telefone);
        this.listaDePrioridade = new ArrayList<DenunciaPrioritaria>();
        this.vitimasPrioritarias = new ArrayList<VitimaPrioritaria>();
    }

    public ArrayList<DenunciaPrioritaria> getListaDePrioridade() {
        return listaDePrioridade;
    }

    @Override
    public void receberDenuncia(DenunciaPrioritaria denuncia){
        super.receberDenuncia(denuncia);
        this.listaDePrioridade.add(denuncia);
        this.vitimasPrioritarias.add((VitimaPrioritaria) denuncia.getVitima());
    }

    public ArrayList<VitimaPrioritaria> getVitimasPrioritarias(){
        return this.vitimasPrioritarias;
    }
}
