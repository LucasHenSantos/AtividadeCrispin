package br.edu.imepac;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("200"), new BigDecimal("10"));
        System.out.println("Valor do orçamento antes = " + orcamento.getValorOrcamento());
        System.out.println("Tempo para ver o desconto = " + orcamento.getDescontoOrcamento());

        OrcamentoProxy proxy = new OrcamentoProxy(orcamento);
        System.out.println("Valor sem proxy = " + proxy.getDescontoOrcamento());
        System.out.println("Valor sem proxy = " + proxy.getDescontoOrcamento());
        System.out.println("Valor sem proxy = " + proxy.getDescontoOrcamento());
        System.out.println("Valor sem proxy = " + proxy.getDescontoOrcamento());
        System.out.println("Valor sem proxy = " + proxy.getDescontoOrcamento());

    }
}

