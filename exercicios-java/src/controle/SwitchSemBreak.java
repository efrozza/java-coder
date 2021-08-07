package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = "n/a";

		switch (faixa.toLowerCase()) {

		case "preta":
			System.out.println("Pessoa faixa preta");
			break;

		case "marrom":
			System.out.println("Pesoa faixa marron");
			break;

		default: 
			System.out.println("Não faz karate");
		
		}
		

	}

}
