package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {

		List<String> aprovados = Arrays.asList("João", "Maria", "Jose", "Pedro");

		for (String nome : aprovados) {
			System.out.println(nome);
		}

		System.out.println("\nLamba 01");

		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		// aprovados.forEach((nome) -> System.out.println(nome + "!!!"));

		System.out.println("\nMethod reference");
		aprovados.forEach(System.out::println);

	}

}
