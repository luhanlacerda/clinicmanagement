package dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import java.util.List;
import classesBasicas.Paciente;

public class PacienteDAO extends DAOGenerico<Paciente> {

	public PacienteDAO(EntityManagerFactory emf) {
		super(emf);
	}

	public List<Paciente> searchByName(String filtro) {
		
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Paciente> listaPaciente = null;
		
		String consulta = "SELECT p FROM Paciente p WHERE p.nome LIKE :nome";
		
		try {
			
			Query query = em.createQuery(consulta, Paciente.class);
			query.setParameter("nome", "%" + filtro + "%");
			listaPaciente = query.getResultList();
			
		} catch (RuntimeException re) {
			re.printStackTrace();			
		}
		
		return listaPaciente;
		
	}
	
	
}
