package robo;

import org.junit.Assert;
import org.junit.Test;

public class ControleTest {

	@Test
	public void executarComandoAnda() {

		Robo robo = new Robo();
		Controle controle = new Controle(robo);
		controle.executar("A");
		
		Assert.assertEquals("0 1 N", robo.toString());
		
	}
	
	@Test
	public void executarComandoDireitaAnda() {

		Robo robo = new Robo();
		Controle controle = new Controle(robo);
		controle.executar("D A");
		
		Assert.assertEquals("1 0 L", robo.toString());
		
	}
	
	@Test
	public void executarComandoDireitaDireitaAnda() {

		Robo robo = new Robo();
		Controle controle = new Controle(robo);
		controle.executar("D D A");
		
		Assert.assertEquals("0 -1 S", robo.toString());
		
	}
	
	@Test
	public void executarComandoDireitaEsquerdaAndaAndaEsquerdaAndaEquerdaAndaAndaAnda() {

		Robo robo = new Robo();
		Controle controle = new Controle(robo);
		controle.executar("D E A A E A E A A A");
		
		Assert.assertEquals("-1 -1 S", robo.toString());
		
	}
	
	@Test
	public void executarCadaPassoComandoDireitaEsquerdaAndaAndaEsquerdaAndaEquerdaAndaAndaAnda() {

		Robo robo = new Robo();
		Controle controle = new Controle(robo);
		controle.executar("D");
		Assert.assertEquals("0 0 L", robo.toString());
		controle.executar("E");
		Assert.assertEquals("0 0 N", robo.toString());
		controle.executar("A");
		Assert.assertEquals("0 1 N", robo.toString());
		controle.executar("A");
		Assert.assertEquals("0 2 N", robo.toString());
		controle.executar("E");
		Assert.assertEquals("0 2 O", robo.toString());
		controle.executar("A");
		Assert.assertEquals("-1 2 O", robo.toString());
		controle.executar("E");
		Assert.assertEquals("-1 2 S", robo.toString());
		controle.executar("A");
		Assert.assertEquals("-1 1 S", robo.toString());
		controle.executar("A");
		Assert.assertEquals("-1 0 S", robo.toString());
		controle.executar("A");
		Assert.assertEquals("-1 -1 S", robo.toString());
		
	}
}
