package dao;

import classesBasicas.Endereco;
import classesBasicas.Medico;
import dados.DAOFactory;
import dados.DAOMedico;

public class DAOMedicoTest {

	public static void main(String[] args) {

		// Inserindo elementos necessarios
		DAOEspecialidadeTest.main(null);
		DAOConsultaTest.main(null);

		// Teste de MedicoDAo
		Endereco endereco = new Endereco();
		endereco.setLogradouro("236.609.267-95");
		endereco.setNumero("123");
		endereco.setComplemento("Apto. 703");
		endereco.setBairro("Boa Viagem");
		endereco.setCidade("Recife");
		endereco.setUf("PE");
		endereco.setCep("13506-555");
		endereco.setPais("Brasil");

		Medico medico = new Medico();
		medico.setNome("Matheus Braz");
		medico.setRg("4.032.894-40");
		medico.setCpf("555.239.366-00");
		medico.setEndereco(endereco);
		medico.setContato("(81) 9.9999-9999");
		medico.setDtNascimento(null);
		medico.setEmail("medic@test.com");
		medico.setEstadoCivil("Solteiro");

		medico.setCrm("12345/PE");
		// medico.setEspecialidade(DAOFactory.getEspecialidadeDAO().searchByKey(1));
		// medico.setListaConsulta(Arrays.asList(DAOFactory.getConsultaDAO().searchByKey(1)));

		DAOMedico dao = DAOFactory.getMedicoDAO();
		dao.insert(medico);

		medico.setNome("Math");
		dao.getAllByName(medico).forEach(m -> System.out.println(m.getId()));

		// dao.getAllByEspecialidade(DAOFactory.getEspecialidadeDAO().searchByKey(1)).forEach(m -> System.out.println(m.getId()));;

		// System.out.println(dao.searchByCrm(medico).getId());

		// System.out.println(dao.searchByRg(medico).getId());

		// System.out.println(dao.searchByCpf(medico).getId());

		// System.out.println(dao.searchByConsulta(DAOFactory.getConsultaDAO().searchByKey(1)).getId());
	}

}
