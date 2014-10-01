package br.livro.mauricioaniche.cap7;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.livro.mauricioaniche.cap7.CalculadoraDeSalario;
import br.livro.mauricioaniche.cap7.Cargo;
import br.livro.mauricioaniche.cap7.Funcionario;

public class CalculadoraDeSalarioTest {

	CalculadoraDeSalario calculadora;
	
	@Before
	public void init(){
		calculadora = new CalculadoraDeSalario();
	}
	
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite() {
		Funcionario desenvolvedor = new Funcionario("Mauricio", 1500.0,
				Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(desenvolvedor);
		
		assertEquals(1500.0 * 0.9, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite() {
		Funcionario desenvolvedor = new Funcionario("Mauricio", 3500.0,
				Cargo.DESENVOLVEDOR);
		double salario = calculadora.calculaSalario(desenvolvedor);
		
		assertEquals(3500.0 * 0.8, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDBAComSalarioAbaixoDoLimite() {
		Funcionario dba = new Funcionario("Mauricio", 1500.0,
				Cargo.DBA);
		double salario = calculadora.calculaSalario(dba);
		
		assertEquals(1500.0 * 0.85, salario, 0.00001);
	}
	
	@Test
	public void deveCalcularSalarioParaDBAComSalarioAcimaDoLimite() {
		Funcionario dba = new Funcionario("Mauricio", 3500.0,
				Cargo.DBA);
		double salario = calculadora.calculaSalario(dba);
		
		assertEquals(3500.0 * 0.75, salario, 0.00001);
	}
}
