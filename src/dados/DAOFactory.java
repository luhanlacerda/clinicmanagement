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

	public static ConsultaDAO getConsultaDAO() {
		ConsultaDAO dao = new ConsultaDAO(factory);
		return dao;
	}

	public static PacienteDAO getPacienteDAO() {
		PacienteDAO dao = new PacienteDAO(factory);
		return dao;
	}
	
	public static EspecialidadeDAO getEspecialidadeDAO(){
		EspecialidadeDAO dao = new EspecialidadeDAO(factory);
		return dao;
	}
}
