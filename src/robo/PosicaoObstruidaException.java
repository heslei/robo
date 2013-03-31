package robo;

public class PosicaoObstruidaException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 948407533324837997L;

	public PosicaoObstruidaException(Posicao posicaoObstruida) {
		super("Posicao obstruida em x, y: " + posicaoObstruida);
	}
}
