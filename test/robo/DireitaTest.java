package robo;

import junit.framework.Assert;

import org.junit.Test;

public class DireitaTest {

	@Test
	public void virarDireitaNorteOeste() {
		Robo robo = new Robo();
		Direita direita = new Direita();
		direita.direita(robo);

		Assert.assertEquals("0 0 O", robo.toString());
	}
	
	@Test
	public void virarDireitaNorteSul() {
		Robo robo = new Robo();
		Direita direita = new Direita();
		direita.direita(robo);
		direita.direita(robo);

		Assert.assertEquals("0 0 S", robo.toString());
	}
	
	@Test
	public void virarDireitaNorteLeste() {
		Robo robo = new Robo();
		Direita direita = new Direita();
		direita.direita(robo);
		direita.direita(robo);
		direita.direita(robo);

		Assert.assertEquals("0 0 L", robo.toString());
	}
	
	@Test
	public void virarDireitaNorteNorte() {
		Robo robo = new Robo();
		Direita direita = new Direita();
		direita.direita(robo);
		direita.direita(robo);
		direita.direita(robo);
		direita.direita(robo);

		Assert.assertEquals("0 0 N", robo.toString());
	}


}
