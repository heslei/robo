package robo;


public class Andar implements Comando{

	public void executar(Robo robo) {
		andar(robo);
	}

	
	void andar(Robo robo) {
		switch (robo.getRumo()) {
		case N:
			robo.setY(robo.getY() + 1);
			break;
		case S:
			robo.setY(robo.getY() - 1);
			break;
		case L:
			robo.setX(robo.getX() - 1);
			break;
		case O:
			robo.setX(robo.getX() + 1);
		}

	}
}
