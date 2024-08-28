package br.edu.imepac;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new
                BigDecimal("1120.98"), "ICMS_SP");
        IcmsFactory icmsFactory = new IcmsFactory();
        BigDecimal resultado = icmsFactory.IcmsPorEstado(
                "ICMS_SP").calculoRegiao(orcamento);
        System.out.println("Icms = " + resultado);
    }
}

