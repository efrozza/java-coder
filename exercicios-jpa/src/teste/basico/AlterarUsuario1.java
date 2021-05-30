package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {

		// cria a fabrica de conexoes
		// exercicios-jpa � o <persistence-unit name="exercicios-jpa"> do
		// persistence.xml
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa");

		// cria entity manager que tem o metodos de acesso e manipula��o do DB
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Usuario usuario = em.find(Usuario.class, 1L);
		usuario.setNome("Everton");
		usuario.setEmail("emaildoeverton@bol.com");

		// metodo merge faz update
		em.merge(usuario);
		em.getTransaction().commit();

		System.out.println(usuario);

		em.close();
		emf.close();

	}

}
