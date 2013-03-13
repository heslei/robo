package robo;


public class Robo {

	private int x;
	private int y;
	private Rumo rumo = Rumo.N;

	public void executar(Comando comando) {
		comando.executar(this);
	}

	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public Rumo getRumo() {
		return rumo;
	}


	public void setRumo(Rumo rumo) {
		this.rumo = rumo;
	}

	@Override
	public String toString() {

		return x + " " + y + " " + rumo;
	}

}
