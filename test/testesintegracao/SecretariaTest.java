package testesintegracao;

import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import classesBasicas.Secretaria;
import classesBasicas.incorporada.EstadoCivil;
import negocios.INegocioSecretaria;
import negocios.NegocioSecretaria;

public class SecretariaTest {

	private Secretaria secretaria;
	private static INegocioSecretaria negocioSecretaria;

	@BeforeClass
	public static void inicializarNegocioSecretaria() {
		negocioSecretaria = new NegocioSecretaria();
	}

	@Before
	public void inicializarSecretaria() {
		this.secretaria = new Secretaria();
	}

	@Ignore
	public void testarInserirSecretariaValido() throws Exception {
		// Given
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirNomeVazio() throws Exception {
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		secretaria.setNome("");
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirNomeMaiorQueEsperado() throws Exception {
		secretaria.setNome(
				"asasasassasasasdsdsasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasas");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirCPFVazio() throws Exception {
		secretaria.setCpf("");
		secretaria.setNome("Juca");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirCPFMaiorQueEsperado() throws Exception {
		secretaria.setCpf("123.213.213-122");
		secretaria.setNome("Juca");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirRGVazio() throws Exception {
		secretaria.setRg("");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirRGMaiorQueEsperado() throws Exception {
		secretaria.setRg("123456789012345678901");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirLogradouroVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirLogradouroMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("asaaasasasassasasdsdsasasassasasasasassasasasasassa");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirNumeroVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirNumeroMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("13245678901");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirComplementoVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirComplementoMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Complemento");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirBairroVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirBairroMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro Maior Que vinte");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirCEPVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro");
		secretaria.getEndereco().setCep("");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirCEPMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("RUa 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro");
		secretaria.getEndereco().setCep("12100-2213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirCidadeVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirCidadeMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro ");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Cidade Maior que o permitido para inserir no bancoo");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirUfVazio() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirUfMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("Estado Maior");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirPaisVazio() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirPaisMaiorQueEsperado() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("pais maior que o esperado 30!!!");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirContatoVazio() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirContatoMaiorQueEsperado() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("(12)2345-12332444");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.insert(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarInserirEstadoCivilNull() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("(81)2322-3222");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(null);
		negocioSecretaria.insert(secretaria);
	}

	// UPDATE

	@Test(expected = Exception.class)
	public void testarUpdateNomeVazio() throws Exception {
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		secretaria.setNome("");
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateNomeMaiorQueEsperado() throws Exception {
		secretaria.setNome(
				"asasasassasasasdsdsasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasas");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCPFVazio() throws Exception {
		secretaria.setCpf("");
		secretaria.setNome("Juca");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCPFMaiorQueEsperado() throws Exception {
		secretaria.setCpf("123.213.213-122");
		secretaria.setNome("Juca");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateRGVazio() throws Exception {
		secretaria.setRg("");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateRGMaiorQueEsperado() throws Exception {
		secretaria.setRg("123456789012345678901");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateLogradouroVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateLogradouroMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("asaaasasasassasasdsdsasasassasasasasassasasasasassa");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateNumeroVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateNumeroMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("13245678901");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateComplementoVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateComplementoMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Complemento");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateBairroVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateBairroMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro Maior Que vinte");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCEPVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro");
		secretaria.getEndereco().setCep("");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCEPMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("RUa 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro");
		secretaria.getEndereco().setCep("12100-2213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCidadeVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCidadeMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro ");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Cidade Maior que o permitido para inserir no bancoo");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateUfVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro ");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Cidade");
		secretaria.getEndereco().setUf("");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateUfMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro ");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Cidade");
		secretaria.getEndereco().setUf("PEE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdatePaisVazio() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdatePaisMaiorQueEsperado() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("pais maior que o esperado 30!!!");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateContatoVazio() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateContatoMaiorQueEsperado() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("(12)2345-12332444");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.update(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarUpdateEstadoCivilNull() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("(81)2322-3222");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(null);
		negocioSecretaria.update(secretaria);
	}

	// REMOVE

	@Ignore
	public void testarRemoverSecretariaSemID() throws Exception {
		secretaria.getId();
		negocioSecretaria.remove(secretaria);
	}
	
	// REFRESH

	@Test(expected = Exception.class)
	public void testarRefreshNomeVazio() throws Exception {
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		secretaria.setNome("");
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshNomeMaiorQueEsperado() throws Exception {
		secretaria.setNome(
				"asasasassasasasdsdsasassasasadsfsdfssasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasas");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCPFVazio() throws Exception {
		secretaria.setCpf("");
		secretaria.setNome("Juca");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCPFMaiorQueEsperado() throws Exception {
		secretaria.setCpf("123.213.213-122");
		secretaria.setNome("Juca");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshRGVazio() throws Exception {
		secretaria.setRg("");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshRGMaiorQueEsperado() throws Exception {
		secretaria.setRg("123456789012345678901");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshLogradouroVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshLogradouroMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("asaaasasasassasasdsdsasasassasasasasassasasasasassa");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshNumeroVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshNumeroMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("13245678901");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshComplementoVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshComplementoMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Complemento");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshBairroVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshBairroMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro Maior Que vinte");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCEPVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro");
		secretaria.getEndereco().setCep("");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCEPMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("RUa 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro");
		secretaria.getEndereco().setCep("12100-2213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCidadeVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCidadeMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro ");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Cidade Maior que o permitido para inserir no bancoo");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshUfVazio() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro ");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Cidade");
		secretaria.getEndereco().setUf("");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshUfMaiorQueEsperado() throws Exception {
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Bairro ");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Cidade");
		secretaria.getEndereco().setUf("PEE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshPaisVazio() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshPaisMaiorQueEsperado() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("pais maior que o esperado 30!!!");
		secretaria.setContato("3333-3333");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshContatoVazio() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshContatoMaiorQueEsperado() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("(12)2345-12332444");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioSecretaria.refresh(secretaria);
	}

	@Test(expected = Exception.class)
	public void testarRefreshEstadoCivilNull() throws Exception {
		secretaria.setNome("Juca");
		secretaria.setCpf("123.123.123-12");
		secretaria.setRg("123");
		secretaria.getEndereco().setLogradouro("Rua 01");
		secretaria.getEndereco().setNumero("132");
		secretaria.getEndereco().setComplemento("Apto 1001");
		secretaria.getEndereco().setBairro("Boa Viagem");
		secretaria.getEndereco().setCep("12100-213");
		secretaria.getEndereco().setCidade("Recife");
		secretaria.getEndereco().setUf("PE");
		secretaria.getEndereco().setPais("Brasil");
		secretaria.setContato("(81)2322-3222");
		secretaria.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		secretaria.setEmail("email@email.com");
		secretaria.setEstadoCivil(null);
		negocioSecretaria.refresh(secretaria);
	}
	
}
