package robo.comando;

import junit.framework.Assert;

import org.junit.Test;

import robo.Posicao;
import robo.PosicaoObstruidaException;
import robo.Robo;
import robo.comando.AndarMapa;

public class AndarMapaComObstrucoes {

	@Test(expected=PosicaoObstruidaException.class)
	public void andarParaUmaPosicaoObstruidaEReceberUmErro() throws Exception{
		AndarMapa andarMapa = new AndarMapa(new Posicao(0,1));
		Robo robo = new Robo();
		
		robo.executar(andarMapa);
		
	}
	
	@Test(expected=PosicaoObstruidaException.class)
	public void andarDoisPassosParaUmaPosicaoObstruidaEReceberUmErro() throws Exception{
		AndarMapa andarMapa = new AndarMapa(new Posicao(0,2));
		Robo robo = new Robo();
		try{
		robo = robo.executar(andarMapa);
		}
		catch(Exception e){
			Assert.fail(e.getMessage());
		}
		robo = robo.executar(andarMapa);
	}
}
