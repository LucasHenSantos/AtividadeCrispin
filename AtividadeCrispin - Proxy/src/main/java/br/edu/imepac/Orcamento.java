package br.edu.imepac;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valorOrcamento;
    private int qItem;
    private BigDecimal descontoOrcamento;


    public Orcamento(BigDecimal valorOrcamento, BigDecimal descontoOrcamento) {

        this.valorOrcamento = valorOrcamento;
        this.descontoOrcamento = descontoOrcamento;

    }

    public Orcamento() {

    }

    public int getqItem(){
        return qItem;
    }

    public void setqItem(int qItem) {
        this.qItem = qItem;
    }

    public BigDecimal getDescontoOrcamento() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return descontoOrcamento;
    }

    public void setDescontoOrcamento(BigDecimal descontoOrcamento) {
        this.descontoOrcamento = descontoOrcamento;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public void setValorOrcamento(BigDecimal valorOrcamento) {
        this.valorOrcamento = valorOrcamento;
    }
}
