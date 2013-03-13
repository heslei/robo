package robo;

public class Esquerda implements Comando {

	public void executar(Robo robo) {
		esquerda(robo);
	}

	void esquerda(Robo robo) {

		Rumo[] values = Rumo.values();
		int tamanho = values.length;

		int rumoAtual = robo.getRumo().ordinal();

		int novoRumo = rumoAtual - 1;

		if (novoRumo < 0) {
			novoRumo = tamanho -1;
		}

		robo.setRumo(values[novoRumo]);
	}

}
