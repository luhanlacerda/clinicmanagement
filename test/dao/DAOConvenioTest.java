package dao;

import classesBasicas.Convenio;
import dados.DAOConvenio;
import dados.DAOFactory;

public class DAOConvenioTest {

	public static void main(String[] args) {
		
		Convenio convenio = new Convenio();
		convenio.setDescricao("HapVida");
		
		DAOConvenio factory = DAOFactory.getConvenioDAO();
		factory.insert(convenio);
		
		convenio.setDescricao("Hap");
		factory.getAllByDescricao(convenio).forEach(e -> System.out.println(e.getId()));
		
	}

}
