package robo;

public enum Rumo {

	N("O", "L", 0, 1), O("S", "N", -1, 0), S("L", "O", 0, -1), L("N", "S", 1, 0);

	private String direita;
	private String esquerda;
	private int andaX;
	private int andaY;

	private Rumo(String esquerda, String direita, int andaX, int andaY) {
		this.esquerda = esquerda;
		this.direita = direita;
		this.andaX = andaX;
		this.andaY = andaY;
	}

	public Rumo direita() {
		return Rumo.valueOf(direita);
	}

	public Rumo esquerda() {
		return Rumo.valueOf(esquerda);
	}

	public void andar(Posicao posicao) {
		// TODO aqui poderia criar uma nova Posicao com os novos valores e
		// retorná-lo?
		// Neste contexto não o fiz para evitar a criação de novos objetos a
		// cada movimento.
		posicao.setX(posicao.getX() + andaX);
		posicao.setY(posicao.getY() + andaY);
	}
}
