package PadroesDeProjetos.Estrutural.Facade;

import PadroesDeProjetos.subsistema1.CrmService;
import PadroesDeProjetos.subsistema2.CepApi;

public class Facade {
    public void migrarCliente(String nome, String cep){
        String cidade = CepApi.getInstancia().recuperarCidade(cep);
        String estado = CepApi.getInstancia().recuperarEstado(cep);
        CrmService.gravarCliente(nome, cidade, estado, cep);
    }
}
