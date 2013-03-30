package robo;

public class Direita implements Comando {

	public Robo executar(Robo robo) {
		return new Robo(robo.getRumo().direita(), robo.getX(), robo.getY());
	}
}