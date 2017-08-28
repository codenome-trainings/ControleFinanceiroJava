package br.com.fj93.model;

import java.util.HashMap;

public class BalancoEmpresa {

    private HashMap<String, Divida> dividas = new HashMap<>();

    public void registraDivida(String credor, String cnpjCredor, Double valor) {
        Divida divida = new Divida();
        divida.setCredor(credor);
        divida.setTotal(valor);
        divida.getCnpjCredor().setValor(cnpjCredor);
        this.dividas.put(cnpjCredor, divida);
    }

    public void pagaDivida(String cnpjCredor, Double valor, String nomeDoPagador, String cnpjDoPagador) {
        Divida divida  = dividas.get(cnpjCredor);
        if (!divida.equals(null)) {
            Pagamento pagamento = new Pagamento();
            pagamento.setCnpjPagador(cnpjDoPagador);
            pagamento.setPagador(nomeDoPagador);
            pagamento.setValor(valor);
            divida.registra(pagamento);
        }
    }

}
