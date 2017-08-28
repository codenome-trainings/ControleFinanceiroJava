package br.com.fj93.model;

public class Cnpj {

    private String valor;

    public Boolean ehValido() {
        return primeiroVerificador() == primeiroDigitoCorreto() && segundoDigitoVerificador() == segundoDigitoCorreto();
    }

    private Integer segundoDigitoCorreto() {
        return 2;
    }

    private Integer segundoDigitoVerificador() {
        return 2;
    }

    private Integer primeiroDigitoCorreto() {
        return 1;
    }

    private Integer primeiroVerificador() {
        return 1;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String cnpjCredor) {
        this.valor = cnpjCredor;
    }

    @Override
    public String toString() {
        return this.valor;
    }
}
