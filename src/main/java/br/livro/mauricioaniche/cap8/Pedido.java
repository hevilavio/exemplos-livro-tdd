package br.livro.mauricioaniche.cap8;

public class Pedido {
	
	public Pedido(String cliente, double valorTotal, int quantidadeItens) {
		this.cliente = cliente;
		this.valorTotal = valorTotal;
		this.quantidadeItens = quantidadeItens;
	}
	private String cliente;
	private double valorTotal;
	private int quantidadeItens;
	
	public String getCliente() {
		return cliente;
	}
	public double getValorTotal() {
		return valorTotal;
	}
	public int getQuantidadeItens() {
		return quantidadeItens;
	}
}
