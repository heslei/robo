package robo;

public class Andar implements Comando {

	public Robo executar(Robo robo) {
		return andar(robo);
	}

	Robo andar(Robo robo) {
		int nextX = robo.getX() + robo.getRumo().andarX();
		int nextY = robo.getY() + robo.getRumo().andarY();
		
		return new Robo(robo.getRumo(), nextX, nextY);
	}
}
