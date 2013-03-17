package robo;


public class Andar implements Comando{

	public void executar(Robo robo) {
		andar(robo);
	}

	
	void andar(Robo robo) {
		Posicao atual = robo.getPosicao();
		robo.getRumo().andar(atual);
	}
}
