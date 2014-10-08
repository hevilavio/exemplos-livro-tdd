package br.livro.mauricioaniche.cap9;

import java.util.ArrayList;
import java.util.List;

public class Fatura {
	/**
	 * @param cliente
	 * @param valor
	 */
	public Fatura(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.pagamentos = new ArrayList<>();
	}

	private String cliente;
	private double valor;
	private List<Pagamento> pagamentos;
	private boolean paga;
	
	public boolean isPaga() {
		return paga;
	}
	public void setPaga(boolean paga) {
		this.paga = paga;
	}
	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}
	public String getCliente() {
		return cliente;
	}
	public double getValor() {
		return valor;
	}
	
	public void adicionaPagamento(Pagamento pagamento){
		pagamentos.add(pagamento);
		double valorTotal = 0;
		for (Pagamento p : pagamentos) {
			valorTotal += p.getValor();
		}
		
		if(valorTotal >= valor){
			paga = true;
		}
	}
	
}
