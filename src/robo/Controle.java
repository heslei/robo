package robo;

public class Controle {

	private Robo robo;
	private Andar andar;
	private Direita direita;
	private Esquerda esquerda;

	public Controle(Robo robo) {
		this.robo = robo;
		this.andar = new Andar();
		this.direita = new Direita();
		this.esquerda = new Esquerda();
	}

	public void executar(String comandos) {

		String[] listaComandos = comandos.split(" ");

		for (String comando : listaComandos) {

			char comandoReal = comando.charAt(0);

			switch (comandoReal) {
			case 'A':
				robo.executar(andar);
				break;
			case 'D':
				robo.executar(direita);
				break;
			case 'E':
				robo.executar(esquerda);
			}
		}
	}

}
