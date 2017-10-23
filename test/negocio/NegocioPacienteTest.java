package negocio;

import java.util.Calendar;

import classesBasicas.Paciente;
import classesBasicas.incorporada.EstadoCivil;
import negocios.INegocioPaciente;
import negocios.NegocioPaciente;

public class NegocioPacienteTest {
	
	public static void main(String[] args) {
		
		Paciente paciente = new Paciente();
		
		paciente.setNome("Angelo");
		paciente.setEmail("angelito@gmail.com");
		
		paciente.getEndereco().setLogradouro("Rua Juju");
		paciente.getEndereco().setNumero("334");
		paciente.getEndereco().setComplemento("Apto 2002");
		paciente.getEndereco().setBairro("Graças KKKKK");
		paciente.getEndereco().setCep("33333-444");
		paciente.getEndereco().setCidade("João Pessoa");
		paciente.getEndereco().setUf("PA");
		paciente.getEndereco().setPais("Brasil");
		
		Calendar datePaciente = Calendar.getInstance();
		datePaciente.set(1956, 3, 23);
		paciente.setDtNascimento(datePaciente);
		
		paciente.setCpf("333.333.333-44");
		paciente.setEstadoCivil(EstadoCivil.DIVORCIADO);
		paciente.setRg("3.333.434SDS/PE");
		paciente.setContato("3333-3333");
		
		INegocioPaciente negocioPaciente = new NegocioPaciente();
				
		negocioPaciente.insert(paciente);
//		negocioPaciente.remove(paciente);
		
	}
	
}
