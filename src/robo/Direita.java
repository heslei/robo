package robo;


public class Direita implements Comando{

	public void executar(Robo robo) {
		direita(robo);
	}
	
	void direita(Robo robo){
		
		Rumo direita = robo.getRumo().direita();
		robo.setRumo(direita);		
	}


}
