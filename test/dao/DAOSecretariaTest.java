package dao;

import classesBasicas.Secretaria;
import dados.DAOFactory;
import dados.SecretariaDAO;

public class DAOSecretariaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Secretaria secretaria = new Secretaria();
		secretaria.setNome("Chupeta");
		// secretaria.setCpf("123.456.789-01");

		SecretariaDAO cu = DAOFactory.getSecretariaDAO();
		// cu.insert(secretaria);

		cu.searchByName("Chupeta");
	}

}
