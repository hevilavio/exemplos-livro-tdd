package br.livro.mauricioaniche.cap9;

public class Pagamento {
	/**
	 * @param valor
	 * @param meio
	 */
	public Pagamento(double valor, MeioDePagamento meio) {
		this.valor = valor;
		this.meio = meio;
	}
	private double valor;
	private MeioDePagamento meio;
	
	
	public double getValor() {
		return valor;
	}
	public MeioDePagamento getMeio() {
		return meio;
	}
}
