package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import classesBasicas.Consulta;

public class DAOConsulta extends DAOGenerico<Consulta> {

	public DAOConsulta(EntityManagerFactory emf) {
		super(emf);
	}

	@SuppressWarnings("unchecked")
	public List<Consulta> getAllByMedico(Consulta filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Consulta> listaConsultas = null;
		String consulta = "FROM Consulta c WHERE c.medico.nome LIKE :nome";
		try {
			Query query = em.createQuery(consulta, Consulta.class);
			query.setParameter("nome", "%" + filtro.getMedico().getNome() + "%");
			listaConsultas = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaConsultas;
	}

	@SuppressWarnings("unchecked")
	public List<Consulta> getAllByCRM(Consulta filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Consulta> listaConsultas = null;
		String consulta = "FROM Consulta c WHERE c.medico.crm LIKE :crm";
		try {
			Query query = em.createQuery(consulta, Consulta.class);
			query.setParameter("crm", "%" + filtro.getMedico().getCrm() + "%");
			listaConsultas = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaConsultas;
	}

	@SuppressWarnings("unchecked")
	public List<Consulta> getAllBySecretria(Consulta filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Consulta> listaConsultas = null;
		String consulta = "FROM Consulta c WHERE c.secretaria.nome LIKE :nome";
		try {
			Query query = em.createQuery(consulta, Consulta.class);
			query.setParameter("nome", "%" + filtro.getSecretaria().getNome() + "%");
			listaConsultas = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaConsultas;
	}

	@SuppressWarnings("unchecked")
	public List<Consulta> getAllByPaciente(Consulta filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Consulta> listaConsultas = null;
		String consulta = "FROM Consulta c WHERE c.paciente.nome LIKE :nome";
		try {
			Query query = em.createQuery(consulta, Consulta.class);
			query.setParameter("nome", "%" + filtro.getPaciente().getNome() + "%");
			listaConsultas = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaConsultas;
	}
}
