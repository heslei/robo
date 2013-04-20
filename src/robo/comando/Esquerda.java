package robo.comando;

import robo.Robo;


public class Esquerda implements Comando {

	public Robo executar(final Robo robo) {
		return new Robo(robo.getRumo().esquerda(), robo.getX(), robo.getY());
	}
}
