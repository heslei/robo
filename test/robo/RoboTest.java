package robo;

import junit.framework.Assert;

import org.junit.Test;

public class RoboTest {

	@Test
	public void estadoInicial() {
		Robo robo = new Robo();
		Assert.assertEquals("0 0 N", robo.toString());
	}

	
	
}
