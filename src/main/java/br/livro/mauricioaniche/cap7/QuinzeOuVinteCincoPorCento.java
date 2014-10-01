package br.livro.mauricioaniche.cap7;

public class QuinzeOuVinteCincoPorCento implements RegraDeCalculo {

	@Override
	public double calculaSalario(Funcionario funcionario) {
		if (funcionario.getSalario() < 2500) {
			return funcionario.getSalario() * 0.85;
		}
		return funcionario.getSalario() * 0.75;
	}

}
