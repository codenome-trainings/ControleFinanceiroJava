package br.com.fj93.model;

import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDividas {

    private final Divida divida;

    public RelatorioDeDividas(Divida divida) {
        this.divida = divida;
    }

    public void gerarRelatorio(NumberFormat formatador) {
        System.out.println("CNPJ CREDOR: " + divida.getCnpjCredor());
        System.out.println("CREDOR: " + divida.getCredor());
        System.out.println("VALOR DA DÍVIDA: " + formatador.format(divida.getTotal()));
        System.out.println("VALOR PAGO: " + formatador.format(divida.getValorPago()));
    }

}
