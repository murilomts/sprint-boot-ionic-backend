package com.murilomartins.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.murilomartins.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento{
	private static final long serialVersionUID = 1L;
	
	private Date davaVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date davaVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.davaVencimento = davaVencimento;
		this.dataPagamento = dataPagamento;
	}

	public Date getDavaVencimento() {
		return davaVencimento;
	}

	public void setDavaVencimento(Date davaVencimento) {
		this.davaVencimento = davaVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
}
