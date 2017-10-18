package dao;

import classesBasicas.Especialidade;
import dados.DAOFactory;
import dados.EspecialidadeDAO;

public class DAOEspecialidadeTest {
	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		especialidade.setDescricao("Ortopedista");
		

		EspecialidadeDAO factory = DAOFactory.getEspecialidadeDAO();
		factory.insert(especialidade);
	}
}
