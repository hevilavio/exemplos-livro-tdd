package br.livro.mauricioaniche;

public class CalculadoraDeSalario implements RegraDeCalculo{

	public double calculaSalario(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().calculaSalario(funcionario);
	}

}
