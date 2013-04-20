package robo.comando;

import robo.Robo;

public class Direita implements Comando {

	public Robo executar(final Robo robo) {
		return new Robo(robo.getRumo().direita(), robo.getX(), robo.getY());
	}
}