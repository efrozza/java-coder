package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	
	public static void main(String[] args) {
		
		//Map faz chave e valor		
		Map<Integer, String> usuarios = new HashMap<>();
		usuarios.put(1, "Roberto");
		
		//o put altera caso ja exista ou inclui, caso nao exista
		usuarios.put(20, "Ricardo");
		usuarios.put(2, "Rafaela");
		usuarios.put(3, "Joana");
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		System.out.println(usuarios.containsKey(20));
		System.out.println(usuarios.containsValue("Joana"));
		System.out.println(usuarios.get(20));
		
		for (int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		for (String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		for (Entry<Integer, String> registro: usuarios.entrySet()){
			System.out.println("chave " + registro.getKey());
			System.out.println("valor " + registro.getValue());
			
		}
		
		
		
	}

}
