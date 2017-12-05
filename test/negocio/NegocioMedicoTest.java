package negocio;

import java.util.Calendar;

import classesBasicas.Medico;
import classesBasicas.incorporada.EstadoCivil;
import negocios.INegocioMedico;
import negocios.NegocioMedico;

public class NegocioMedicoTest {

	public static void main(String[] args) throws Exception {

		Medico medico = new Medico();

		medico.setNome("Monica2");
		medico.setEmail("monica2@gmail.com");
		medico.getEndereco().setLogradouro("rua 02");
		medico.getEndereco().setNumero("123");
		medico.getEndereco().setComplemento("Apto 2001");
		medico.getEndereco().setBairro("Amorlandia");
		medico.getEndereco().setCep("52011-240");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setCpf("222.223.222-22");
		Calendar dateMedico = Calendar.getInstance();
		dateMedico.set(1994, 01, 24);
		medico.setDtNascimento(dateMedico.getTime());
		medico.setCrm("12435PE");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		medico.setRg("2.222.233SDS/PE");
		medico.setContato("2423-2221");

		INegocioMedico negocioMedico = new NegocioMedico();

		//negocioMedico.insert(medico);
		medico = negocioMedico.searchByKey(2, Medico.class);
		//negocioMedico.remove(medico);
	}

}
