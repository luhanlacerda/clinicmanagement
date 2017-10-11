package dados;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAOFactory {

	private static final EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("ProjetoClinic");
	}

	public static SecretariaDAO getSecretariaDAO() {
		SecretariaDAO dao = new SecretariaDAO(factory);
		return dao;
	}
}
