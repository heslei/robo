package robo.comando;

import robo.Robo;

public class Andar implements Comando {

	public Robo executar(final Robo robo) {
		return andar(robo);
	}

	Robo andar(final Robo robo) {
		int nextX = robo.getX() + robo.getRumo().andarX();
		int nextY = robo.getY() + robo.getRumo().andarY();
		
		return new Robo(robo.getRumo(), nextX, nextY);
	}
}
