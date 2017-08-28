package br.com.fj93.model;

import java.text.NumberFormat;
import java.util.Locale;

public class TestaRelatorioDeDividas {

    public static void main(String[] args) {
        Divida divida = new Divida();
        divida.setCredor("Uma empresa");
        divida.setTotal(100.0);
        divida.getCnpjCredor().setValor("00.000.001/0001-01");

        Pagamento pagamento = new Pagamento();
        pagamento.setCnpjPagador("00.000.002/0002-02");
        pagamento.setPagador("Outra Empresa");
        pagamento.setValor(20.0);
        divida.registra(pagamento);

        NumberFormat formatador = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        RelatorioDeDividas relatorio = new RelatorioDeDividas(divida);
        relatorio.gerarRelatorio(formatador);
    }

}
