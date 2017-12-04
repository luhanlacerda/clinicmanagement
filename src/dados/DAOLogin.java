package dados;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import classesBasicas.Login;


public class DAOLogin extends DAOGenerico<Login> {

	public DAOLogin(EntityManagerFactory emf) {
		super(emf);
	}
	
	public Login login(Login login) {
		EntityManager em = this.getEntityManagerFactory().createEntityManager();
		Login result = null;
		String consulta = "FROM Login WHERE username = :Username";
		try {
			Query query = em.createQuery(consulta, Login.class);
			query.setParameter("Username", login.getUsername());
			result = (Login) query.getSingleResult();
		} catch (RuntimeException re) {
			re.printStackTrace();
		}
		em.close();
		return result;
	}
	
}
