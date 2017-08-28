package br.com.fj93.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PagamentosTest {

    private Pagamentos pagamentos;

    @BeforeEach
    void setUp() {
        this.pagamentos = new Pagamentos();

    }

    @Test
    void pagamentosAntesDe() {
    }

    @Test
    void pagamentosComValorMaiorQue() {
    }

    @Test
    void pagamentosDo() {
    }

    @Test
    void getValorPago() {
        Pagamento pagamento1 = new Pagamento();
        Pagamento pagamento2 = new Pagamento();
        pagamento1.setValor(new Double(105));
        pagamento2.setValor(new Double(25));

        pagamentos.registra(pagamento1);
        pagamentos.registra(pagamento2);
        assertEquals(new Double(122), this.pagamentos.getValorPago(), 0.0001);
    }

    @Test
    void registra() {
    }

}