package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import classesBasicas.Especialidade;

public class EspecialidadeDAO extends DAOGenerico<Especialidade> {

	public EspecialidadeDAO(EntityManagerFactory emf) {
		super(emf);

	}

	public List<Especialidade> searchByName(String filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Especialidade> listaEspecialidade = null;
		String consulta = "FROM Especialidade e WHERE e.Descricao LIKE :Descricao";
		try {
			Query query = em.createQuery(consulta, Especialidade.class);
			query.setParameter("Descricao", "%" + filtro + "%");
			listaEspecialidade = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaEspecialidade;
	}
}
