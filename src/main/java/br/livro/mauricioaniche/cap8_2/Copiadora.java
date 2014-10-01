package br.livro.mauricioaniche.cap8_2;

public class Copiadora {
	
	/**
	 * A copiadora deve receber uma implementação de 
	 * um Leitor e um Escritor.
	 * 
	 * */
	public Copiadora(Leitor leitor, Escritor escritor) {
		this.leitor = leitor;
		this.escritor = escritor;
	}

	private Leitor leitor;
	private Escritor escritor;
	
	public void copiar(){
		while(leitor.temCaracteres()){
			escritor.escreve(leitor.leCaracteres());
		}
	}
}
