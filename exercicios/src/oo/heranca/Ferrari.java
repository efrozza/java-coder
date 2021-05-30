package oo.heranca;

public class Ferrari extends Carro {

	public Ferrari() {
		super(200);
	}

	@Override
	void acelerar() {
		velocidadeAtual += 10;
	}

	@Override
	void frear() {
		if (velocidadeAtual >= 10) {
			velocidadeAtual -= 10;
		}
	}

}
