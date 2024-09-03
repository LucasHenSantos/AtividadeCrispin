package br.edu.imepac;
import java.math.BigDecimal;

public class OrcamentoProxy extends Orcamento{

    private BigDecimal descontoOrcamento;
    private Orcamento orcamento;

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getDescontoOrcamento() {
        if(descontoOrcamento == null){
            this.descontoOrcamento = orcamento.getDescontoOrcamento();
        }
        return this.descontoOrcamento;
    }
}
