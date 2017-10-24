package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import classesBasicas.Especialidade;
import classesBasicas.Medico;

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
	
	@SuppressWarnings("unchecked")
	public List<Especialidade> getAllByMedicos(Medico filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Especialidade> listaEspecialidade= null;
		String consulta = "SELECT e.especialidade FROM Especialidade e JOIN Medico m ON e = m.especialidade WHERE e.id = :Especialidade";
		try {
			Query query = em.createQuery(consulta);
			query.setParameter("Especialidade", filtro.getId());
			listaEspecialidade = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaEspecialidade;
	}
}
