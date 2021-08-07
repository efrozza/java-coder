package lambdas;

public class CalculoTesteComLambda {
	
	public static void main(String[] args) {
		// podemos via Lambda atribuir uma funcao para o metodo da interface
		
		Calculo calc = (x, y) -> { return x + y; };
		
		//executando o metodo 
		System.out.println(calc.executar(5,2));
		
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(5, 2));
		
		
	}

}
