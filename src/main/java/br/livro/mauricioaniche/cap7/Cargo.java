package br.livro.mauricioaniche.cap7;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorCento()),
	TESTADOR(new QuinzeOuVinteCincoPorCento()),
	DBA(new QuinzeOuVinteCincoPorCento());
	
	private RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra){
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
}
