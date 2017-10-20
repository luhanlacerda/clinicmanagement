package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import classesBasicas.Secretaria;

public class DAOSecretaria extends DAOGenerico<Secretaria> {

	public DAOSecretaria(EntityManagerFactory emf) {
		super(emf);
	}

	@SuppressWarnings("unchecked")
	public List<Secretaria> getAllByName(Secretaria filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Secretaria> listaSecretaria = null;
		String consulta = "SELECT s FROM Secretaria s WHERE s.nome LIKE :nome";
		try {
			Query query = em.createQuery(consulta, Secretaria.class);
			query.setParameter("nome",  "%" + filtro.getNome() + "%");
			listaSecretaria = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaSecretaria;
	}
}
