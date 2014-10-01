package br.livro.mauricioaniche.cap8;

import java.util.Calendar;

public class NotaFiscal {

	public NotaFiscal(String cliente, double valor, Calendar data) {
		this.cliente = cliente;
		this.valor = valor;
		this.data = data;
	}

	private String cliente;
	private double valor;
	private Calendar data;
	
	public String getCliente() {
		return cliente;
	}
	public double getValor() {
		return valor;
	}
	public Calendar getData() {
		return (Calendar) data.clone();
	}
}
