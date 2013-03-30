package robo;

import junit.framework.Assert;

import org.junit.Test;

public class RoboTest {

	@Test
	public void estadoInicialdoRoboDeveSer_0_0_N() {
		Robo robo = new Robo();
		Assert.assertEquals("0 0 N", robo.toString());
	}

	
	
}
