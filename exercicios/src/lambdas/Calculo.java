package lambdas;

// essa anotacao força que essa interface soh possa ter um metodo abstrato q eh usado para atribuir
// funcoes lambda
@FunctionalInterface
public interface Calculo {

	public abstract double executar(double a, double b);

	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return "muito legal";
	}

}
