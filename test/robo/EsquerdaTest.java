package robo;

import junit.framework.Assert;

import org.junit.Test;

public class EsquerdaTest {
	@Test
	public void virarEsquerdaNorteOeste() {
		Robo robo = new Robo();
		Esquerda esquerda = new Esquerda();
		esquerda.esquerda(robo);
		esquerda.esquerda(robo);
		esquerda.esquerda(robo);

		Assert.assertEquals("0 0 O", robo.toString());
	}
	
	@Test
	public void virarEsquerdaNorteSul() {
		Robo robo = new Robo();
		Esquerda esquerda = new Esquerda();
		esquerda.esquerda(robo);
		esquerda.esquerda(robo);

		Assert.assertEquals("0 0 S", robo.toString());
	}
	
	@Test
	public void virarEsquerdaNorteLeste() {
		Robo robo = new Robo();
		Esquerda esquerda = new Esquerda();
		esquerda.esquerda(robo);
		

		Assert.assertEquals("0 0 L", robo.toString());
	}
	
	@Test
	public void virarEsquerdaNorteNorte() {
		Robo robo = new Robo();
		Esquerda esquerda = new Esquerda();
		esquerda.esquerda(robo);
		esquerda.esquerda(robo);
		esquerda.esquerda(robo);
		esquerda.esquerda(robo);

		Assert.assertEquals("0 0 N", robo.toString());
	}
	
	@Test
	public void virarEsquerdaOesteNorte() {
		Robo robo = new Robo();
		robo.setRumo(Rumo.O);
		Esquerda esquerda = new Esquerda();
		esquerda.esquerda(robo);
		

		Assert.assertEquals("0 0 N", robo.toString());
	}
}
