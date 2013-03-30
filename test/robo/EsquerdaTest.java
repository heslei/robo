package robo;

import junit.framework.Assert;

import org.junit.Test;

public class EsquerdaTest {
	@Test
	public void virarEsquerdaDoNorteParaOeste() {
		Robo robo = new Robo();
		Esquerda esquerda = new Esquerda();
		robo = esquerda.executar(robo);

		Assert.assertEquals("0 0 O", robo.toString());
	}
	
	@Test
	public void virarEsquerdaDoNorteParaSul() {
		Robo robo = new Robo();
		Esquerda esquerda = new Esquerda();
		robo = esquerda.executar(robo);
		robo = esquerda.executar(robo);

		Assert.assertEquals("0 0 S", robo.toString());
	}
	
	@Test
	public void virarEsquerdaDoNorteParaLeste() {
		Robo robo = new Robo();
		Esquerda esquerda = new Esquerda();
		robo = esquerda.executar(robo);
		robo = esquerda.executar(robo);
		robo = esquerda.executar(robo);

		Assert.assertEquals("0 0 L", robo.toString());
	}
	
	@Test
	public void virarEsquerda360grausDoNorteParaNorte() {
		Robo robo = new Robo();
		Esquerda esquerda = new Esquerda();
		robo = esquerda.executar(robo);
		robo = esquerda.executar(robo);
		robo = esquerda.executar(robo);
		robo = esquerda.executar(robo);

		Assert.assertEquals("0 0 N", robo.toString());
	}
	
	@Test
	public void virarEsquerdaDoOesteParaNorte() {
		Robo robo = new Robo(Rumo.O, 0, 0);
		Esquerda esquerda = new Esquerda();
		robo = esquerda.executar(robo);
		robo = esquerda.executar(robo);
		robo = esquerda.executar(robo);
		

		Assert.assertEquals("0 0 N", robo.toString());
	}
}
