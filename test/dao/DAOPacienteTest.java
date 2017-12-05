package dao;

import java.util.Calendar;

import classesBasicas.Paciente;
import classesBasicas.incorporada.EstadoCivil;
import dados.DAOFactory;
import dados.DAOPaciente;

public class DAOPacienteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente = new Paciente();

		paciente.setNome("Marcos");
		paciente.setContato("99999-9999");
		paciente.setCpf("111.111.111-11");
		Calendar datePaciente = Calendar.getInstance();
		datePaciente.set(1991, Calendar.AUGUST, 02);
		paciente.setDtNascimento(datePaciente.getTime());
		paciente.setEmail("marcos@gmail.com");
		paciente.getEndereco().setLogradouro("rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Aflitos");
		paciente.getEndereco().setCep("52011-250");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setEstadoCivil(EstadoCivil.CASADO);
		paciente.setRg("1.111.111SDS/PE");
		
		DAOPaciente factory = DAOFactory.getPacienteDAO();
		factory.insert(paciente);
		
		paciente.setNome("Mar");
		factory.getAllByName(paciente).forEach(p -> System.out.println(p.getId()));
	}

}
