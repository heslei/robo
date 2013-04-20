package robo;

public class PosicaoObstruidaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 948407533324837997L;

	public PosicaoObstruidaException(final Posicao posicaoObstruida) {
		super("Posicao obstruida em x, y: " + posicaoObstruida);
	}
}
