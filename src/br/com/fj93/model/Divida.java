package br.com.fj93.model;

import java.util.ArrayList;
import java.util.Calendar;

public class Divida {

    private Double total;

    private String credor;
    private Cnpj cnpjCredor = new Cnpj();
    private Pagamentos pagamentos = new Pagamentos();

    public Cnpj getCnpjCredor() {
        return cnpjCredor;
    }

    public Pagamentos getPagamentos() {
        return pagamentos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getCredor() {
        return credor;
    }

    public void setCredor(String credor) {
        this.credor = credor;
    }

    /**
     * Com este método, deixamos de violar o princípio "Tell, Don't Ask"
     * Assim, não temos a necessidade de pedir os dados das outras classes para executarmos uma determinada lógica.
     * @param pagamento
     */
    public void registra(Pagamento pagamento) {
        pagamentos.registra(pagamento);
    }

    public Double getValorPago() {
        return pagamentos.getValorPago();
    }
}
