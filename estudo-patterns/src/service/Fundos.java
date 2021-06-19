package service;

import modelo.Categoria;

public class Fundos extends Categoria {

	@Override
	public double calcularIR(int tempoInvestimento) {
		if (tempoInvestimento < 10) {
			return 0.1;
		} else {
			return 0.2;
		}
	}

}
