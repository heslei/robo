package robo;

import org.junit.Assert;
import org.junit.Test;

public class ControleTest {

	@Test
	public void andarUmaPosicaoParaNorte() {

		Controle controle = new Controle();
		controle.executar("A");

		Assert.assertEquals("0 1 N", controle.getRobo().toString());

	}

	@Test
	public void virarDireitaAndarUmaPosicaoParaLeste() {

		Controle controle = new Controle();
		controle.executar("D A");

		Assert.assertEquals("1 0 L", controle.getRobo().toString());

	}

	@Test
	public void virarDireitaDireitaAndarUmaPosicaoParaSul() {

		Controle controle = new Controle();
		controle.executar("D D A");

		Assert.assertEquals("0 -1 S", controle.getRobo().toString());

	}

	@Test
	public void chegarEm_1n_1n_S_aposExecutarDEAAEAEAAA() {

		Controle controle = new Controle();
		controle.executar("D E A A E A E A A A");

		Assert.assertEquals("-1 -1 S", controle.getRobo().toString());

	}

	@Test
	public void chegarEm_1n_1n_S_aposExecutar_DEAAEAEAAA_umPassoPorVez() {

		Controle controle = new Controle();
		controle.executar("D");
		Assert.assertEquals("0 0 L", controle.getRobo().toString());
		controle.executar("E");
		Assert.assertEquals("0 0 N", controle.getRobo().toString());
		controle.executar("A");
		Assert.assertEquals("0 1 N", controle.getRobo().toString());
		controle.executar("A");
		Assert.assertEquals("0 2 N", controle.getRobo().toString());
		controle.executar("E");
		Assert.assertEquals("0 2 O", controle.getRobo().toString());
		controle.executar("A");
		Assert.assertEquals("-1 2 O", controle.getRobo().toString());
		controle.executar("E");
		Assert.assertEquals("-1 2 S", controle.getRobo().toString());
		controle.executar("A");
		Assert.assertEquals("-1 1 S", controle.getRobo().toString());
		controle.executar("A");
		Assert.assertEquals("-1 0 S", controle.getRobo().toString());
		controle.executar("A");
		Assert.assertEquals("-1 -1 S", controle.getRobo().toString());

	}
}
