package dados;

import javax.persistence.EntityManagerFactory;

import classesBasicas.Secretaria;

public class SecretariaDAO extends DAOGenerico<Secretaria> {

	public SecretariaDAO(EntityManagerFactory emf) {
		super(emf);
	}
}
