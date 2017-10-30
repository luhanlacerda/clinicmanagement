package negocio;

import java.util.Calendar;

import classesBasicas.Consulta;
import classesBasicas.Convenio;
import classesBasicas.Especialidade;
import classesBasicas.Medico;
import classesBasicas.Paciente;
import classesBasicas.Secretaria;
import classesBasicas.incorporada.EstadoCivil;
import classesBasicas.incorporada.EstadoConsulta;
import dados.DAOConvenio;
import dados.DAOEspecialidade;
import dados.DAOFactory;
import dados.DAOMedico;
import dados.DAOPaciente;
import dados.DAOSecretaria;
import negocios.INegocioConsulta;
import negocios.NegocioConsulta;

public class NegocioConsultaTest {

	public static void main(String[] args) {

		Consulta consulta = new Consulta();
		
		Medico medico = new Medico();
		DAOMedico daoMedico = DAOFactory.getMedicoDAO();
		
		Especialidade especialidade = new Especialidade();
		DAOEspecialidade daoEspecialidade = DAOFactory.getEspecialidadeDAO();
		
		Paciente paciente = new Paciente();
		DAOPaciente daoPAciente = DAOFactory.getPacienteDAO();
		
		Secretaria secretaria = new Secretaria();
		DAOSecretaria daoSecretaria = DAOFactory.getSecretariaDAO();

		Convenio convenio = new Convenio();
		DAOConvenio daoConvenio = DAOFactory.getConvenioDAO();
		
		convenio.setDescricao("Unimed");
		daoConvenio.insert(convenio);
		
		especialidade.setDescricao("Ortopedistsa");
		daoEspecialidade.insert(especialidade);
		
		medico.setNome("Wilson");
		medico.setRg("4.032.894-40");
		medico.setCpf("555.239.366-00");
		medico.setContato("(81) 9.9999-9999");
		Calendar dateMedico = Calendar.getInstance();
		dateMedico.set(1991, Calendar.AUGUST, 02);
		medico.setDtNascimento(dateMedico);
		medico.setEmail("medic@test.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		medico.getEndereco().setLogradouro("rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Aflitos");
		medico.getEndereco().setCep("52011-250");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setEspecialidade(especialidade);
		daoMedico.insert(medico);
		
		paciente.setNome("igor");
		paciente.setContato("99999-9999");
		paciente.setCpf("222.222.222-22");
		Calendar datePaciente = Calendar.getInstance();
		datePaciente.set(1991, Calendar.AUGUST, 02);
		paciente.setDtNascimento(datePaciente);
		paciente.setEmail("igor@gmail.com");
		paciente.getEndereco().setLogradouro("rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Aflitos");
		paciente.getEndereco().setCep("52011-250");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setEstadoCivil(EstadoCivil.CASADO);
		paciente.setRg("2.222.222SDS/PE");
		paciente.setConvenio(convenio);
		daoPAciente.insert(paciente);
		
		secretaria.setNome("monica");
		secretaria.setContato("99999-9999");
		secretaria.setCpf("333.333.333-33");
		Calendar dateSecretaria = Calendar.getInstance();
		dateSecretaria.set(1991, Calendar.AUGUST, 02);
		secretaria.setDtNascimento(dateSecretaria);
		secretaria.setEmail("monica@gmail.com");
		secretaria.getEndereco().setLogradouro("rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Aflitos");
		secretaria.getEndereco().setCep("52011-250");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setEstadoCivil(EstadoCivil.CASADO);
		secretaria.setRg("3.333.333/PE");
		daoSecretaria.insert(secretaria);
		
		consulta.setDuracao(1);
		consulta.setEstado(EstadoConsulta.MARCADA);
		Calendar dateConsulta = Calendar.getInstance();
		dateConsulta.set(2017, Calendar.OCTOBER, 23, 19, 23);
		consulta.setHorario(dateConsulta);
		consulta.setObservacoes("Paciente com urgencia");
		consulta.setMedico(medico);
		consulta.setPaciente(paciente);
		consulta.setSecretaria(secretaria);

		INegocioConsulta negocioConsulta = new NegocioConsulta();
		negocioConsulta.insert(consulta);
	}

}
