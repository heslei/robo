package robo;


public class Esquerda implements Comando {

	public Robo executar(Robo robo) {
		return new Robo(robo.getRumo().esquerda(), robo.getX(), robo.getY());
	}
}
