package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	
	public static void main(String[] args) {
		
		// cria a fabrica de conexoes
		// exercicios-jpa � o <persistence-unit name="exercicios-jpa"> do persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");
		
		//cria entity manager que tem o metodos de acesso e manipula��o do DB
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("TestandoUsuario2", "teste2s@bol.com");
		
		//Para fazer manuten��o na base precisamos ter transaction aberta
		em.getTransaction().begin();
		
		//Metodo persiste, grava na base
		em.persist(novoUsuario);
		//Comitamos
		em.getTransaction().commit();
		
		System.out.println("o ID gerado foi " + novoUsuario.getId());
		
		em.close();
		emf.close();
	}

}
