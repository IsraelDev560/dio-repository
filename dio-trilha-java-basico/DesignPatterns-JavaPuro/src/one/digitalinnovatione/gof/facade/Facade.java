package one.digitalinnovatione.gof.facade;

import one.digitalinnovatione.gof.facade.crm.CrmService;
import one.digitalinnovatione.gof.facade.cep.CepApi;

public class Facade {

    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstance().recuperarCidade(cep);
        String estado = CepApi.getInstance().recuperarEstado(cep);

        CrmService.gravarCliente(nome,cep, cidade, estado);
    }
}
