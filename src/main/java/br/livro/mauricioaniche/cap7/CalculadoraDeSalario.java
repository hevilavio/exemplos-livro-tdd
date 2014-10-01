package br.livro.mauricioaniche.cap7;

public class CalculadoraDeSalario implements RegraDeCalculo{

	public double calculaSalario(Funcionario funcionario) {
		return funcionario.getCargo().getRegra().calculaSalario(funcionario);
	}

}
