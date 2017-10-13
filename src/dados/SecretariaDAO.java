package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import classesBasicas.Secretaria;

public class SecretariaDAO extends DAOGenerico<Secretaria> {

	public SecretariaDAO(EntityManagerFactory emf) {
		super(emf);
	}

	public List<Secretaria> searchByName(String filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Secretaria> listaSecretaria = null;
		String consulta = "SELECT s FROM Secretaria s WHERE s.nome LIKE :nome";
		try {
			Query query = em.createQuery(consulta, Secretaria.class);
			query.setParameter("nome",  "%" + filtro + "%");
			listaSecretaria = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaSecretaria;
	}
}
