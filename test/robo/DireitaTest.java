package robo;

import junit.framework.Assert;

import org.junit.Test;

public class DireitaTest {

	@Test
	public void virarDireitaDoNorteParaOeste() {
		Robo robo = new Robo();
		Direita direita = new Direita();
		robo = direita.executar(robo);
		robo = direita.executar(robo);
		robo = direita.executar(robo);

		Assert.assertEquals("0 0 O", robo.toString());
	}
	
	@Test
	public void virarDireitaDoNorteParaSul() {
		Robo robo = new Robo();
		Direita direita = new Direita();
		robo = direita.executar(robo);
		robo = direita.executar(robo);

		Assert.assertEquals("0 0 S", robo.toString());
	}
	
	@Test
	public void virarDireitaDoNorteParaLeste() {
		Robo robo = new Robo();
		Direita direita = new Direita();
		robo = direita.executar(robo);

		Assert.assertEquals("0 0 L", robo.toString());
	}
	
	@Test
	public void virarDireita360grausDoNorteParaNorte() {
		Robo robo = new Robo();
		Direita direita = new Direita();
		robo = direita.executar(robo);
		robo = direita.executar(robo);
		robo = direita.executar(robo);
		robo = direita.executar(robo);

		Assert.assertEquals("0 0 N", robo.toString());
	}


}
