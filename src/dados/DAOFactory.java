package dados;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public abstract class DAOFactory {

	private static final EntityManagerFactory factory;

	static {
		factory = Persistence.createEntityManagerFactory("ProjetoClinic");
	}

	public static DAOSecretaria getSecretariaDAO() {
		DAOSecretaria dao = new DAOSecretaria(factory);
		return dao;
	}

	public static DAOConsulta getConsultaDAO() {
		DAOConsulta dao = new DAOConsulta(factory);
		return dao;
	}

	public static DAOPaciente getPacienteDAO() {
		DAOPaciente dao = new DAOPaciente(factory);
		return dao;
	}

	public static DAOEspecialidade getEspecialidadeDAO() {
		DAOEspecialidade dao = new DAOEspecialidade(factory);
		return dao;
	}

	public static DAOMedico getMedicoDAO() {
		DAOMedico dao = new DAOMedico(factory);
		return dao;
	}

	public static DAOConvenio getConvenioDAO() {
		DAOConvenio dao = new DAOConvenio(factory);
		return dao;
	}

}
