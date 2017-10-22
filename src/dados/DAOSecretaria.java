package dados;

import javax.persistence.EntityManagerFactory;
import classesBasicas.Secretaria;

public class DAOSecretaria extends DAOPessoa<Secretaria> {

	public DAOSecretaria(EntityManagerFactory emf) {
		super(emf);
	}
	
}
