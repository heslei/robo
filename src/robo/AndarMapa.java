package robo;

import java.util.ArrayList;
import java.util.List;

public class AndarMapa implements Comando {

	private final List<Posicao> obstrucoes = new ArrayList<Posicao>();

	private final Andar andar = new Andar();

	public AndarMapa(Posicao... obstrucoes) {
		
		if (obstrucoes != null) {
			for (Posicao posicao : obstrucoes) {
				this.obstrucoes.add(posicao);
			}
		}
	}

	@Override
	public Robo executar(Robo robo) throws PosicaoObstruidaException {
		
		Robo roboNovaPosicao = andar.executar(robo);
		Posicao novaPosicao = new Posicao(roboNovaPosicao.getX(), roboNovaPosicao.getY());
		
		boolean estaObstruido = obstrucoes.contains(novaPosicao);
		
		if(estaObstruido){
			throw new PosicaoObstruidaException(novaPosicao);
		}
		
		return roboNovaPosicao;

	}

}
