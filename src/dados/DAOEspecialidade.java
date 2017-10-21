package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import classesBasicas.Especialidade;

public class DAOEspecialidade extends DAOGenerico<Especialidade> {

	public DAOEspecialidade(EntityManagerFactory emf) {
		super(emf);

	}

	@SuppressWarnings("unchecked")
	public List<Especialidade> getAllByDescricao(Especialidade filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Especialidade> listaEspecialidade = null;
		String consulta = "FROM Especialidade e WHERE e.descricao LIKE :Descricao";
		try {
			Query query = em.createQuery(consulta, Especialidade.class);
			query.setParameter("Descricao", "%" + filtro.getDescricao() + "%");
			listaEspecialidade = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaEspecialidade;
	}
}
