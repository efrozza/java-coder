package service;

import modelo.Categoria;

public class RendaFixa extends Categoria {

	@Override
	public double calcularIR(int tempoInvestimento) {
		if  (tempoInvestimento < 15) {
			return 0.1;
		} else {
			return 0.2;
		}
	}
	

}
