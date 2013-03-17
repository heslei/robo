package robo;


public class Esquerda implements Comando {

	public void executar(Robo robo) {
		esquerda(robo);
	}

	void esquerda(Robo robo) {

		Rumo esquerda = robo.getRumo().esquerda();
		robo.setRumo(esquerda);	
	}

}
