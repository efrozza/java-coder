package lambdas;

public class CalculoTeste {
	
	public static void main(String[] args) {
		
		// Estamos usando polimorfismo 
		// Podemos instanciar toda classe que implementa uma interface
		// pela interface
		
		Calculo calculo = new Somar();		
		System.out.println("somar " + calculo.executar(5, 2));		
		
		calculo = new Multiplicar();
		System.out.println("multiplicar " + calculo.executar(5, 2));
		
	}
	


}
