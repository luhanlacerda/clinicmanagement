package dados;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import classesBasicas.Consulta;

public class ConsultaDAO extends DAOGenerico<Consulta> {

	public ConsultaDAO(EntityManagerFactory emf) {
		super(emf);
	}

	public List<Consulta> searchByMedico(String filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Consulta> listaConsultas = null;
		String consulta = "FROM Consulta c WHERE c.medico.nome LIKE :nome";
		try {
			Query query = em.createQuery(consulta, Consulta.class);
			query.setParameter("nome", "%" + filtro + "%");
			listaConsultas = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaConsultas;
	}

	public List<Consulta> searchByCRM(String filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Consulta> listaConsultas = null;
		String consulta = "FROM Consulta c WHERE c.medico.crm LIKE :crm";
		try {
			Query query = em.createQuery(consulta, Consulta.class);
			query.setParameter("crm", "%" + filtro + "%");
			listaConsultas = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaConsultas;
	}

	public List<Consulta> searchBySecretria(String filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Consulta> listaConsultas = null;
		String consulta = "FROM Consulta c WHERE c.secretaria.nome LIKE :nome";
		try {
			Query query = em.createQuery(consulta, Consulta.class);
			query.setParameter("nome", "%" + filtro + "%");
			listaConsultas = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaConsultas;
	}

	public List<Consulta> searchByPaciente(String filtro) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Consulta> listaConsultas = null;
		String consulta = "FROM Consulta c WHERE c.paciente.nome LIKE :nome";
		try {
			Query query = em.createQuery(consulta, Consulta.class);
			query.setParameter("nome", "%" + filtro + "%");
			listaConsultas = query.getResultList();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return listaConsultas;
	}
}
