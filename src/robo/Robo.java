package robo;

public class Robo {

	private final Rumo rumo;
	private final int x;
	private final int y;
	
	public Robo(){
		this(Rumo.N, 0, 0);
	}

	public Robo(Rumo rumo, int x, final int y) {
		this.rumo = rumo;
		this.x = x;
		this.y = y;
	}

	public Robo executar(Comando comando) {
		return comando.executar(this);
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Rumo getRumo() {
		return rumo;
	}

	@Override
	public String toString() {

		return x + " " + y + " " + rumo;
	}

}
