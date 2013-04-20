package robo;

public enum Rumo {

	N("O", "L", 0, 1), O("S", "N", -1, 0), S("L", "O", 0, -1), L("N", "S", 1, 0);

	private final String direita;
	private final String esquerda;
	private final int andaX;
	private final int andaY;

	private Rumo(final String esquerda, final String direita, final int andaX, final int andaY) {
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
	
	public int andarX(){
		return andaX;
	}

	public int andarY(){
		return andaY;
	}
}
