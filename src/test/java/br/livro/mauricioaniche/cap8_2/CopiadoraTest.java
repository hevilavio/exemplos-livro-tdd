package br.livro.mauricioaniche.cap8_2;

import static org.mockito.Mockito.*;

import org.junit.Test;

/**
 * Classe para teste da Copiadora 
 * e verificação da chamada de métodos do(s) mock(s).
 * 
 * Perceba que estamos usando o import estático do Mockito.
 * 
 * @author hs
 * */
public class CopiadoraTest {

	@Test
	public void deveEnviarOConteudoLido() {
		Leitor leitor = mock(Leitor.class);
		Escritor escritor = mock(Escritor.class);
		
		// "ensinamos" um comportamento para nossos Mocks
		when(leitor.temCaracteres()).thenReturn(true, false);
		when(leitor.leCaracteres()).thenReturn("foo");
		
		
		Copiadora c = new Copiadora(leitor, escritor);
		c.copiar();
		
		// certificamos que a String "lida" foi a mesma string "escrita"
		verify(escritor).escreve("foo");
	}

}
