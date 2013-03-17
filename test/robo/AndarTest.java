package robo;

import junit.framework.Assert;

import org.junit.Test;

public class AndarTest {
	
	@Test
	public void rumoNorte() {
		Robo robo = new Robo();
		Andar andar = new Andar();
		andar.andar(robo);

		Assert.assertEquals("0 1 N", robo.toString());
	}

	@Test
	public void rumoSul() {
		Robo robo = new Robo();
		robo.setRumo(Rumo.S);
		Andar andar = new Andar();

		andar.andar(robo);

		Assert.assertEquals("0 -1 S", robo.toString());
	}

	@Test
	public void rumoLeste() {
		Robo robo = new Robo();
		robo.setRumo(Rumo.L);
		Andar andar = new Andar();
		andar.andar(robo);

		Assert.assertEquals("1 0 L", robo.toString());
	}

	@Test
	public void rumoOeste() {
		Robo robo = new Robo();
		robo.setRumo(Rumo.O);
		Andar andar = new Andar();
		andar.andar(robo);

		Assert.assertEquals("-1 0 O", robo.toString());
	}
}
