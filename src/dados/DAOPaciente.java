package dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import java.util.List;
import classesBasicas.Paciente;

public class DAOPaciente extends DAOGenerico<Paciente> {

	public DAOPaciente(EntityManagerFactory emf) {
		super(emf);
	}

	@SuppressWarnings("unchecked")
	public List<Paciente> getAllByName(Paciente filtro) {
		
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		List<Paciente> listaPaciente = null;
		
		String consulta = "SELECT p FROM Paciente p WHERE p.nome LIKE :nome";
		
		try {
			
			Query query = em.createQuery(consulta, Paciente.class);
			query.setParameter("nome", "%" + filtro.getNome() + "%");
			listaPaciente = query.getResultList();
			
		} catch (RuntimeException re) {
			re.printStackTrace();			
		}
		
		return listaPaciente;
		
	}
	
	
}
