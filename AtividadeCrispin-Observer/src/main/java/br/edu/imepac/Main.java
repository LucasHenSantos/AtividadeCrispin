package br.edu.imepac;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal valorInicial = new BigDecimal("2000.0");
        BigDecimal desconto = new BigDecimal("10.0");
        Gerente gerente = new Gerente("João");
        Estoque estoque = new Estoque("Camiseta", valorInicial, desconto);
        estoque.attach(gerente);
        estoque.setValor(valorInicial);
    }
}
