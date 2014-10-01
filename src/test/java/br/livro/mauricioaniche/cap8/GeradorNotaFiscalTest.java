package br.livro.mauricioaniche.cap8;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

import org.junit.Test;
import org.mockito.Mockito;

public class GeradorNotaFiscalTest {

	@Test
	public void deveGerarNFComValordeImpostoDescontado() {
		GeradorNotaFiscal gerador = new GeradorNotaFiscal(new ArrayList<AcaoAposGerarNota>());
		Pedido pedido = new Pedido("HS", 1000.0, 1);
		NotaFiscal nf = gerador.gera(pedido);
		
		assertEquals(1000 * 0.94, nf.getValor(), 0.00001);
	}
	
	@Test
	public void devePersistirNfGerada(){
		AcaoAposGerarNota dao = Mockito.mock(NFDao.class);
		
		GeradorNotaFiscal gerador = new GeradorNotaFiscal(Arrays.asList(dao));
		Pedido pedido = new Pedido("HS", 1000.0, 1);
		NotaFiscal nf = gerador.gera(pedido);
		
		Mockito.verify(dao).executa(nf);
	}
	
	@Test
	public void deveEnviarNFGeradaParaSAP(){
		AcaoAposGerarNota sap = Mockito.mock(NFDao.class);
		
		GeradorNotaFiscal gerador = new GeradorNotaFiscal(Arrays.asList(sap));
		Pedido pedido = new Pedido("HS", 1000.0, 1);
		NotaFiscal nf = gerador.gera(pedido);
		
		Mockito.verify(sap).executa(nf);
	}
	
	/**
	 * Apenas para testar se o Mockito diferencia a instância passada 
	 * como parâmetro para o método verificado.
	 * 
	 * */
	@Test(expected=org.mockito.exceptions.verification.junit.ArgumentsAreDifferent.class)
	public void mockitoConsideraInstanciasDeObjeto(){
		AcaoAposGerarNota sap = Mockito.mock(NFDao.class);
		
		GeradorNotaFiscal gerador = new GeradorNotaFiscal(Arrays.asList(sap));
		Pedido pedido = new Pedido("HS", 1000.0, 1);
		@SuppressWarnings("unused")
		NotaFiscal nf = gerador.gera(pedido);
		NotaFiscal nfNova = new NotaFiscal("FOO", 100.0, Calendar.getInstance());
		
		Mockito.verify(sap).executa(nfNova);
	}
}


