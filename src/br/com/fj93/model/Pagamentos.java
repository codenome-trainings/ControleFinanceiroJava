package br.com.fj93.model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashSet;

public class Pagamentos {

    private double valorPago;
    private ArrayList<Pagamento> pagamentos = new ArrayList<>();

    public ArrayList<Pagamento> pagamentosAntesDe(Calendar data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();
        for (Pagamento pagamento: this.pagamentos) {
            if (pagamento.getData().before(data))
                pagamentosFiltrados.add(pagamento);

        }
        return pagamentosFiltrados;
    }

    public ArrayList<Pagamento> pagamentosComValorMaiorQue(Double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();
        for (Pagamento pagamento : this.pagamentos) {
            if(pagamento.getValor() > valorMinimo)
                pagamentosFiltrados.add(pagamento);
        }
        return pagamentosFiltrados;
    }

    public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();
        for (Pagamento pagamento : this.pagamentos) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador))
                pagamentosFiltrados.add(pagamento);
        }
        return pagamentosFiltrados;
    }

    public double getValorPago() {
        return valorPago;
    }

    private void paga(Double valor) {
        if (valor.compareTo(new Double(0)) < 0)
            throw new IllegalArgumentException("Valor inválido para pagamento");

        if (valor.compareTo(new Double(100)) > 0)
            valor -= new Double(8);

        this.valorPago += valor;
    }

    public void registra(Pagamento pagamento) {
        this.pagamentos.add(pagamento);
        this.paga(pagamento.getValor());
    }

    public Boolean foiRealizado(Pagamento pagamento) {
        return this.pagamentos.contains(pagamento);
    }
}
