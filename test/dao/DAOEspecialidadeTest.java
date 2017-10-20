package dao;

import classesBasicas.Especialidade;
import dados.DAOFactory;
import dados.DAOEspecialidade;

public class DAOEspecialidadeTest {
	public static void main(String[] args) {
		
		Especialidade especialidade = new Especialidade();
		especialidade.setDescricao("Ortopedista");
		

		DAOEspecialidade factory = DAOFactory.getEspecialidadeDAO();
		factory.insert(especialidade);
		
		especialidade.setDescricao("or");
		factory.getAllByDescricao(especialidade).forEach(e -> System.out.println(e.getId()));
	}
}
