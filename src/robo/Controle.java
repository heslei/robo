package robo;

public class Controle {

	private enum Botoes {
		A(new Andar()), D(new Direita()), E(new Esquerda());

		private Comando comando;

		private Botoes(Comando comando) {
			this.comando = comando;
		}

		public Comando comando() {
			return comando;
		}

	}

	private Robo robo;

	public Controle(Robo robo) {
		this.robo = robo;
	}

	public void executar(String comandos) {

		String[] listaComandos = comandos.split(" ");

		for (String comando : listaComandos) {

			Botoes botao = Botoes.valueOf(comando);
			robo.executar(botao.comando());
		}
	}

}
