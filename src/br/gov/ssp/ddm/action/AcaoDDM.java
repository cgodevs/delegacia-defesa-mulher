package br.gov.ssp.ddm.action;

import br.gov.ssp.ddm.entities.*;
import br.gov.ssp.ddm.entities.DenunciaPrioritaria;
import br.gov.ssp.ddm.entities.enums.TipoDenuncia;
import br.gov.ssp.ddm.entities.DelegaciaDefesaMulher;
import br.gov.ssp.ddm.entities.Mulher;
import br.gov.ssp.ddm.entities.interfaces.VitimaPrioritaria;
import br.gov.ssp.ddm.entities.superclasses.*;

public class AcaoDDM {
    public static void main(String[] args) {

        DelegaciaDefesaMulher ddm = new DelegaciaDefesaMulher("1ª Delegacia de Defesa da Mulher",
                                                        new Endereco("São Paulo","Centro",
                                                                "Rua Dr. Bittencourt Rodrigues",
                                                                "200", "01017-010"),
                                                "térreo","1132413328");

        Denunciante d1 = new Denunciante();
        Denuncia denuncia1 = d1.denunciar(TipoDenuncia.VIOLENCIA_FISICA, new Crianca("José Vitor",
                new Endereco("Rua ABC","123","Cidade X")));

        VitimaPrioritaria v1 = new Mulher("Marília",
                new Endereco("Cidade Y","Centro","Rua XYZ","321","00000-000"));
        DenunciaPrioritaria denuncia2 = v1.denunciar(TipoDenuncia.VIOLENCIA_SEXUAL, v1);

        ddm.receberDenuncia(denuncia1);
        ddm.receberDenuncia(denuncia2);

        // -------------- PRINTS ---------------- //
        System.out.println(v1);

        for(Denuncia denuncia: ddm.getListaDeDenuncias())
            System.out.println(denuncia);

        for(VitimaPrioritaria vitima: ddm.getVitimasPrioritarias())
            System.out.println(vitima);
    }
}
