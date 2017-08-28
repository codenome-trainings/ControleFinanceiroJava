package br.com.fj93.model;

public class GerenciadorDeDividas {

    public void efetuaPagamento(Divida divida, String nomePagador, String cnpjPagador, Double valor) {
        Pagamento pagamento = new Pagamento();
        pagamento.setCnpjPagador(cnpjPagador);
        pagamento.setPagador(nomePagador);
        pagamento.setValor(valor);
        divida.registra(pagamento);
    }

}
