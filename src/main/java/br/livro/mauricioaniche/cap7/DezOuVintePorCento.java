package br.livro.mauricioaniche.cap7;

public class DezOuVintePorCento implements RegraDeCalculo {

	@Override
	public double calculaSalario(Funcionario funcionario) {
		if (funcionario.getSalario() > 3000) {
			return funcionario.getSalario() * 0.8;
		}
		return funcionario.getSalario() * 0.9;
	}

}
