package dao;

import java.util.Calendar;

import classesBasicas.Consulta;
import classesBasicas.Consulta.Estado;
import classesBasicas.Medico;
import dados.DAOConsulta;
import dados.DAOFactory;
import dados.DAOMedico;
import dados.DAOPaciente;
import dados.DAOSecretaria;
import classesBasicas.Paciente;
import classesBasicas.Secretaria;

public class DAOConsultaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Medico medico = new Medico();
		Consulta consulta = new Consulta();
		Secretaria secretaria = new Secretaria();
		Paciente paciente = new Paciente();
		// Especialidade especialidade = new Especialidade();

		// especialidade.setDescricao("Ortopedista");

		medico.setNome("Wilson");
		medico.setContato("99999-9999");
		medico.setCpf("111.111.111-11");
		medico.setCrm("CRM01PE");
		Calendar dateMedico = Calendar.getInstance();
		dateMedico.set(1991, Calendar.AUGUST, 02);
		medico.setDtNascimento(dateMedico);
		medico.setEmail("wilson@gmail.com");
		medico.getEndereco().setLogradouro("rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Aflitos");
		medico.getEndereco().setCep("52011-250");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		// medico.setEspecialidade(especialidade);
		medico.setEstadoCivil("casado");
		medico.setRg("1.111.111SDS/PE");

		secretaria.setNome("Marta");
		secretaria.setEmail("marta@gmail.com");
		secretaria.getEndereco().setLogradouro("rua 02");
		secretaria.getEndereco().setNumero("123");
		secretaria.getEndereco().setComplemento("Apto 2001");
		secretaria.getEndereco().setBairro("Amorlandia");
		secretaria.getEndereco().setCep("52011-240");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setCpf("222.222.222-22");
		Calendar dateSecretaria = Calendar.getInstance();
		dateSecretaria.set(1994, Calendar.JANUARY, 24);
		secretaria.setDtNascimento(dateSecretaria);
		secretaria.setEstadoCivil("Solteira");
		secretaria.setRg("2.222.222SDS/PE");
		secretaria.setContato("2423-2221");

		paciente.setNome("Igor");
		paciente.setEmail("igor@gmail.com");
		paciente.getEndereco().setLogradouro("rua 03");
		paciente.getEndereco().setNumero("589");
		paciente.getEndereco().setComplemento("Apto 21");
		paciente.getEndereco().setBairro("Arruda");
		paciente.getEndereco().setCep("5011-240");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setCpf("333.333.333-33");
		Calendar datePaciente = Calendar.getInstance();
		datePaciente.set(1994, Calendar.JANUARY, 24);
		paciente.setDtNascimento(datePaciente);
		paciente.setEstadoCivil("Casado");
		paciente.setRg("3.333.333SDS/PE");
		paciente.setContato("3030-2020");

		consulta.setEstado(Estado.Marcada);
		consulta.setDuracao(01);
		Calendar dateConsulta = Calendar.getInstance();
		dateConsulta.set(2017, Calendar.OCTOBER, 17, 12, 30);
		consulta.setHorario(dateConsulta);
		consulta.setMedico(medico);
		consulta.setObservacoes(null);
		consulta.setPaciente(paciente);
		consulta.setSecretaria(secretaria);
		consulta.setReceita(null);

		DAOPaciente factoryPaciente = DAOFactory.getPacienteDAO();
		DAOSecretaria factorySecretaria = DAOFactory.getSecretariaDAO();
		DAOConsulta factoryConsulta = DAOFactory.getConsultaDAO();
		DAOMedico factoryMedico = DAOFactory.getMedicoDAO();
		factorySecretaria.insert(secretaria);
		factoryPaciente.insert(paciente);
		factoryMedico.insert(medico);
		factoryConsulta.insert(consulta);

		consulta.getMedico().setNome("wil");
		consulta.getPaciente().setNome("ig");
		consulta.getSecretaria().setNome("mar");
		consulta.getMedico().setCrm("PE");

		// factoryConsulta.getAllByMedico(consulta).forEach(c ->
		// System.out.println(c.getId()));
		// factoryConsulta.getAllByPaciente(consulta).forEach(c ->
		// System.out.println(c.getId()));
		// factoryConsulta.getAllBySecretria(consulta).forEach(c ->
		// System.out.println(c.getId()));
		factoryConsulta.getAllByCRM(consulta).forEach(c -> System.out.println(c.getId()));
	}

}
