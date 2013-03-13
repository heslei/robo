package robo;

public class Direita implements Comando{

	public void executar(Robo robo) {
		direita(robo);
	}
	
	void direita(Robo robo){
		
		Rumo[] values = Rumo.values();
		int tamanho  = values.length;
						
		int rumoAtual = robo.getRumo().ordinal();
		
		int novoRumo = rumoAtual + 1;
		
		if(novoRumo >= tamanho){
			novoRumo = 0;
		}
		
		robo.setRumo(values[novoRumo]);		
	}


}
