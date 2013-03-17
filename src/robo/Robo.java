package robo;


public class Robo {
	
	private Posicao posicao = new Posicao();
	private Rumo rumo = Rumo.N;

	public void executar(Comando comando) {
		comando.executar(this);
	}


	public Posicao getPosicao() {
		return posicao;
	}
	
	public Rumo getRumo() {
		return rumo;
	}

	public void setRumo(Rumo rumo) {
		this.rumo = rumo;
	}

	@Override
	public String toString() {

		return posicao + " " + rumo;
	}

}
