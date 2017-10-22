package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import classesBasicas.Consulta;
import classesBasicas.Especialidade;
import classesBasicas.Medico;

public class DAOMedico extends DAOPessoa<Medico> {

	public DAOMedico(EntityManagerFactory emf) {
		super(emf);
	}

	@SuppressWarnings("unchecked")
	public List<Medico> getAllByEspecialidade(Especialidade filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Medico> listaMedico = null;
		String consulta = "SELECT e.listaMedicos FROM Especialidade e JOIN Medico m ON e = m.especialidade WHERE e.id = :Especialidade";
		try {
			Query query = em.createQuery(consulta);
			query.setParameter("Especialidade", filtro.getId());
			listaMedico = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaMedico;
	}

	public Medico searchByCrm(Medico filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		Medico result = null;
		String consulta = "FROM Medico WHERE crm = :Crm";
		try {
			Query query = em.createQuery(consulta, Medico.class);
			query.setParameter("Crm", filtro.getCrm());
			result = (Medico) query.getSingleResult();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return result;
	}

	public Medico searchByConsulta(Consulta filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		Medico result = null;
		String consulta = "SELECT c.medico FROM Consulta c JOIN Medico m ON c.medico = m WHERE c.id = :Consulta";
		try {
			Query query = em.createQuery(consulta, Medico.class);
			query.setParameter("Consulta", filtro.getId());
			result = (Medico) query.getSingleResult();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return result;
	}

}
