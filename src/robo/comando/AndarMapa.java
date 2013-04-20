package robo.comando;

import java.util.HashSet;
import java.util.Set;

import robo.Posicao;
import robo.PosicaoObstruidaException;
import robo.Robo;

public class AndarMapa implements Comando {

	private final Set<Posicao> obstrucoes = new HashSet<Posicao>();

	private final Andar andar = new Andar();

	public AndarMapa(final Posicao... obstrucoes) {
		
		if (obstrucoes != null) {
			for (Posicao posicao : obstrucoes) {
				this.obstrucoes.add(posicao);
			}
		}
	}

	@Override
	public Robo executar(final Robo robo) throws PosicaoObstruidaException {
		
		Robo roboNovaPosicao = andar.executar(robo);
		Posicao novaPosicao = new Posicao(roboNovaPosicao.getX(), roboNovaPosicao.getY());
		
		boolean estaObstruido = obstrucoes.contains(novaPosicao);
		
		if(estaObstruido){
			throw new PosicaoObstruidaException(novaPosicao);
		}
		
		return roboNovaPosicao;

	}

}
