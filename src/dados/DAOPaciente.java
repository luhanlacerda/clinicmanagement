package dados;

import javax.persistence.EntityManagerFactory;
import classesBasicas.Paciente;

public class DAOPaciente extends DAOPessoa<Paciente> {

	public DAOPaciente(EntityManagerFactory emf) {
		super(emf);
	}
	
}
