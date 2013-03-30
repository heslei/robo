package robo;

import junit.framework.Assert;

import org.junit.Test;

public class AndarTest {
	
	@Test
	public void andarDaOrigem_0_0_N_SentidoNorteChegandoEm_0_1_N() {
		Robo robo = new Robo();
		Andar andar = new Andar();
		robo = andar.andar(robo);

		Assert.assertEquals("0 1 N", robo.toString());
	}

	@Test
	public void andarDaOrigem_0_0_S_SentidoSulChegandoEm_0_1n_S() {
		Robo robo = new Robo(Rumo.S, 0, 0);
		Andar andar = new Andar();

		robo = andar.andar(robo);

		Assert.assertEquals("0 -1 S", robo.toString());
	}

	@Test
	public void andarDaOrigem_0_0_L_SentidoLesteChegandoEm_1_0_L() {
		Robo robo = new Robo(Rumo.L, 0, 0);
		Andar andar = new Andar();
		robo = andar.andar(robo);

		Assert.assertEquals("1 0 L", robo.toString());
	}

	@Test
	public void andarDaOrigem_0_0_O_SentidoOesteChegandoEm_1n_0_O() {
		Robo robo = new Robo(Rumo.O, 0, 0);
		Andar andar = new Andar();
		robo = andar.andar(robo);

		Assert.assertEquals("-1 0 O", robo.toString());
	}
}
