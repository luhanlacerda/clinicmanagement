package dao;

import classesBasicas.Secretaria;
import dados.DAOFactory;
import dados.DAOSecretaria;

public class DAOSecretariaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Marta");
		// secretaria.setCpf("123.456.789-01");

		DAOSecretaria factory = DAOFactory.getSecretariaDAO();
		//factory.insert(secretaria);

		secretaria.setNome("Mar");
		factory.getAllByName(secretaria).forEach(s -> System.out.println(s.getId()));;
	}

}
