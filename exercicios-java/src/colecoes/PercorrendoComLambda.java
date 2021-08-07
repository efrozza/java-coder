package colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PercorrendoComLambda {

	public static void main(String[] args) {

		List<String> aulas = new ArrayList<>();
		
		//incluindo
		aulas.add("aula 1");
		aulas.add("aula 3");
		aulas.add("aula 2");
		aulas.add("aula 5");
		aulas.add("aula 4");
		
		//removendo		
		aulas.remove(0);

		aulas.forEach(aula -> System.out.println(aula));
		
		System.out.println("quantidade de aulas" + aulas.size());

		
		//ordenando		
		Collections.sort(aulas);

		for (String aula : aulas) {

			System.out.println(aula);

		}
	}

}
