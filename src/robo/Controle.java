package robo;

import robo.comando.Andar;
import robo.comando.Comando;
import robo.comando.Direita;
import robo.comando.Esquerda;

public class Controle {

	private enum Botoes {
		A(new Andar()), D(new Direita()), E(new Esquerda());

		private Comando comando;

		private Botoes(final Comando comando) {
			this.comando = comando;
		}

		public Comando comando() {
			return comando;
		}

	}

	private Robo robo;

	public Controle(){
		this(new Robo());
	}
	
	public Controle(final Robo robo) {
		this.robo = robo;
	}
	
	

	public void executar(final String comandos) {

		String[] listaComandos = comandos.split(" ");

		for (int i = 0; i < listaComandos.length; i++) {

			String comando = listaComandos[i];
			
			Botoes botao = Botoes.valueOf(comando);
			try {
				robo = robo.executar(botao.comando());
			} catch (Exception e) {
				throw new RuntimeException("Erro ao executar o comando " + i, e);
			}
		}
	}
	
	public Robo getRobo(){
		return robo;
	}

}
