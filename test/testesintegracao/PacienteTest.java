package testesintegracao;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import classesBasicas.Paciente;
import classesBasicas.incorporada.EstadoCivil;
import negocios.INegocioPaciente;
import negocios.NegocioPaciente;

public class PacienteTest {

	private Paciente paciente;
	private static INegocioPaciente negocioPaciente;

	@BeforeClass
	public static void inicializarNegocioPaciente() {
		negocioPaciente = new NegocioPaciente();
	}

	@Before
	public void inicializarPaciente() {
		this.paciente = new Paciente();
	}

	@Ignore
	public void testarInserirPacienteValido() throws ParseException {
		// Given
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		Paciente expected = paciente;

		// When
		paciente.setNome("Carlos");
		Paciente actual = paciente;

		// Then
		Assert.assertEquals(expected, actual);
	}

	@Test(expected = Exception.class)
	public void testarInserirNomeVazio() throws Exception {
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		paciente.setNome("");
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirNomeMaiorQueEsperado() throws Exception {
		paciente.setNome(
				"asasasassasasasdsdsasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasas");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirCPFVazio() throws Exception {
		paciente.setCpf("");
		paciente.setNome("Juca");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirCPFMaiorQueEsperado() throws Exception {
		paciente.setCpf("123.213.213-122");
		paciente.setNome("Juca");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirRGVazio() throws Exception {
		paciente.setRg("");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirRGMaiorQueEsperado() throws Exception {
		paciente.setRg("123456789012345678901");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirLogradouroVazio() throws Exception {
		paciente.getEndereco().setLogradouro("");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirLogradouroMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("asaaasasasassasasdsdsasasassasasasasassasasasasassa");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirNumeroVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirNumeroMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("13245678901");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirComplementoVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirComplementoMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Complemento");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirBairroVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirBairroMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro Maior Que vinte");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirCEPVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro");
		paciente.getEndereco().setCep("");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirCEPMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("RUa 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro");
		paciente.getEndereco().setCep("12100-2213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirCidadeVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirCidadeMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro ");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Cidade Maior que o permitido para inserir no bancoo");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirUfVazio() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirUfMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("Estado Maior");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirPaisVazio() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirPaisMaiorQueEsperado() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("pais maior que o esperado 30!!!");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirContatoVazio() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirContatoMaiorQueEsperado() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("(12)2345-12332444");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.insert(paciente);
	}

	@Test(expected = Exception.class)
	public void testarInserirEstadoCivilNull() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("(81)2322-3222");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(null);
		negocioPaciente.insert(paciente);
	}

	// UPDATE

	@Test(expected = Exception.class)
	public void testarUpdateNomeVazio() throws Exception {
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		paciente.setNome("");
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateNomeMaiorQueEsperado() throws Exception {
		paciente.setNome(
				"asasasassasasasdsdsasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasas");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCPFVazio() throws Exception {
		paciente.setCpf("");
		paciente.setNome("Juca");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCPFMaiorQueEsperado() throws Exception {
		paciente.setCpf("123.213.213-122");
		paciente.setNome("Juca");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateRGVazio() throws Exception {
		paciente.setRg("");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateRGMaiorQueEsperado() throws Exception {
		paciente.setRg("123456789012345678901");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateLogradouroVazio() throws Exception {
		paciente.getEndereco().setLogradouro("");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateLogradouroMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("asaaasasasassasasdsdsasasassasasasasassasasasasassa");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateNumeroVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateNumeroMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("13245678901");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateComplementoVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateComplementoMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Complemento");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateBairroVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateBairroMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro Maior Que vinte");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCEPVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro");
		paciente.getEndereco().setCep("");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCEPMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("RUa 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro");
		paciente.getEndereco().setCep("12100-2213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCidadeVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCidadeMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro ");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Cidade Maior que o permitido para inserir no bancoo");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateUfVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro ");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Cidade");
		paciente.getEndereco().setUf("");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateUfMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro ");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Cidade");
		paciente.getEndereco().setUf("PEE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdatePaisVazio() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdatePaisMaiorQueEsperado() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("pais maior que o esperado 30!!!");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateContatoVazio() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateContatoMaiorQueEsperado() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("(12)2345-12332444");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.update(paciente);
	}

	@Test(expected = Exception.class)
	public void testarUpdateEstadoCivilNull() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("(81)2322-3222");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(null);
		negocioPaciente.update(paciente);
	}

	// REMOVE

	@Test(expected = Exception.class)
	public void testarRemoverPacienteSemID() throws Exception {
		paciente.getId();
		negocioPaciente.remove(paciente);
	}
	
	// REFRESH

	@Test(expected = Exception.class)
	public void testarRefreshNomeVazio() throws Exception {
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		paciente.setNome("");
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshNomeMaiorQueEsperado() throws Exception {
		paciente.setNome(
				"asasasassasasasdsdsasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasas");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCPFVazio() throws Exception {
		paciente.setCpf("");
		paciente.setNome("Juca");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCPFMaiorQueEsperado() throws Exception {
		paciente.setCpf("123.213.213-122");
		paciente.setNome("Juca");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshRGVazio() throws Exception {
		paciente.setRg("");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshRGMaiorQueEsperado() throws Exception {
		paciente.setRg("123456789012345678901");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshLogradouroVazio() throws Exception {
		paciente.getEndereco().setLogradouro("");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshLogradouroMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("asaaasasasassasasdsdsasasassasasasasassasasasasassa");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshNumeroVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshNumeroMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("13245678901");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshComplementoVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshComplementoMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Complemento");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshBairroVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshBairroMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro Maior Que vinte");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCEPVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro");
		paciente.getEndereco().setCep("");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCEPMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("RUa 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro");
		paciente.getEndereco().setCep("12100-2213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCidadeVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCidadeMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro ");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Cidade Maior que o permitido para inserir no bancoo");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshUfVazio() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro ");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Cidade");
		paciente.getEndereco().setUf("");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshUfMaiorQueEsperado() throws Exception {
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Bairro ");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Cidade");
		paciente.getEndereco().setUf("PEE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshPaisVazio() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshPaisMaiorQueEsperado() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("pais maior que o esperado 30!!!");
		paciente.setContato("3333-3333");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshContatoVazio() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshContatoMaiorQueEsperado() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("(12)2345-12332444");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioPaciente.refresh(paciente);
	}

	@Test(expected = Exception.class)
	public void testarRefreshEstadoCivilNull() throws Exception {
		paciente.setNome("Juca");
		paciente.setCpf("123.123.123-12");
		paciente.setRg("123");
		paciente.getEndereco().setLogradouro("Rua 01");
		paciente.getEndereco().setNumero("132");
		paciente.getEndereco().setComplemento("Apto 1001");
		paciente.getEndereco().setBairro("Boa Viagem");
		paciente.getEndereco().setCep("12100-213");
		paciente.getEndereco().setCidade("Recife");
		paciente.getEndereco().setUf("PE");
		paciente.getEndereco().setPais("Brasil");
		paciente.setContato("(81)2322-3222");
		paciente.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		paciente.setEmail("email@email.com");
		paciente.setEstadoCivil(null);
		negocioPaciente.refresh(paciente);
	}

}
