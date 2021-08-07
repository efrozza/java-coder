package baralho;

import java.util.ArrayList;
import java.util.List;

public class Baralho {

	static int qtdeCartas = 52;

	List<Carta> cartas;

	Baralho() {


	}

	void embaralhar() {

	}
	


	Carta obterCarta() {
		qtdeCartas -= 1;
		return cartas.get(0);
	}

}
