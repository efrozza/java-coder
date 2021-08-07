package lambdas;

public class Somar implements Calculo {

	@Override
	public double executar(double a, double b) {
		
		return a + b;
	}
	
	public double somaValidada(double a, double b) {
		
		if  (a < 0 || b < 0) {
			throw new IllegalArgumentException("valor de parâmetro inválido");
		}
		return a + b;
	}
	

}
