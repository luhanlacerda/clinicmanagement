package negocio;

import java.util.Calendar;

import classesBasicas.Secretaria;
import classesBasicas.incorporada.EstadoCivil;
import negocios.INegocioSecretaria;
import negocios.NegocioSecretaria;

public class NegocioSecretariaTest {

	public static void main(String[] args) {

		Secretaria secretaria = new Secretaria();

		secretaria.setNome("Monica");
		secretaria.setEmail("monica@gmail.com");
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
		dateSecretaria.set(1994, 01, 24);
		secretaria.setDtNascimento(dateSecretaria);
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		secretaria.setRg("2.222.222SDS/PE");
		secretaria.setContato("2423-2221");

		INegocioSecretaria negocioSecretaria = new NegocioSecretaria();

		negocioSecretaria.insert(secretaria);
		//secretaria = negocioSecretaria.searchByKey(14);
		//negocioSecretaria.remove(secretaria);

	}

}
