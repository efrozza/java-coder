package service;

public class CalculadorDeIR {
	
	public double calcularIR(int categoria, int tempoInvestimento) {
		switch (categoria) {
		case 1:
			if (tempoInvestimento < 10) {
				return 0.1;
			} else {
				return 0.2;
			}
		case 2: {
			if  (tempoInvestimento < 15) {
				return 0.1;
			} else {
				return 0.2;
			}
		}
		}
		
		return 0;
	}

}
