package dao;

import java.util.Calendar;

import classesBasicas.Paciente;
import dados.DAOFactory;
import dados.PacienteDAO;

public class DAOPacienteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente = new Paciente();

		paciente.setNome("Pitoquinha");
		paciente.setContato("99999-9999");
		paciente.setCpf("111.111.111-11");
		Calendar datePaciente = Calendar.getInstance();
		datePaciente.set(1991, Calendar.AUGUST, 02);
		paciente.setDtNascimento(datePaciente);
		paciente.setEmail("house@gmail.com");
/*		paciente.getEndereco().setLogradouro("rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Aflitos");
		paciente.getEndereco().setCep("52011-250");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");*/
		paciente.setEstadoCivil("casado");
		paciente.setRg("1.111.111SDS/PE");
		
		PacienteDAO factory = DAOFactory.getPacienteDAO();
		factory.insert(paciente);
	}

}
