package testesintegracao;

import java.text.SimpleDateFormat;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import classesBasicas.Especialidade;
import classesBasicas.Medico;
import classesBasicas.incorporada.EstadoCivil;
import negocios.INegocioMedico;
import negocios.NegocioMedico;

public class MedicoTest {
	
	private Medico medico;
	private Especialidade especialidade;
	private static INegocioMedico negocioMedico;
	
	@BeforeClass
	public static void inicializarnegocioMedico() {
		negocioMedico = new NegocioMedico();
	}

	@Before
	public void inicializarMedico() {
		this.medico = new Medico();
		this.especialidade = new Especialidade();
	}
	@Test
	public void testarInserirMedicoValido() throws Exception {
		// Given
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarEspecialidade() throws Exception {
		Especialidade especialidade = null;
		medico.setEspecialidade(especialidade);
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		medico.setNome("Juca");
		medico.setCrm("0000000000/SP");
		negocioMedico.insert(medico);
	}
	

	@Test(expected = Exception.class)
	public void testarInserirCRMVazio() throws Exception {
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		medico.setNome("Juca");
		medico.setCrm("");
		negocioMedico.insert(medico);
	}
	
	@Test(expected = Exception.class)
	public void testarInserirCRMMaiorQueEsperado() throws Exception {
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		medico.setNome("Juca");
		medico.setCrm("00000000000/SPPP");
		negocioMedico.insert(medico);
	}
	
	
	@Test(expected = Exception.class)
	public void testarInserirNomeVazio() throws Exception {
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		medico.setNome("");
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirNomeMaiorQueEsperado() throws Exception {
		medico.setNome("sasasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasas");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirCPFVazio() throws Exception {
		medico.setCpf("");
		medico.setNome("Juca");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirCPFMaiorQueEsperado() throws Exception {
		medico.setCpf("123.213.213-122");
		medico.setNome("Juca");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirRGVazio() throws Exception {
		medico.setRg("");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirRGMaiorQueEsperado() throws Exception {
		medico.setRg("123456789012345678901");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirLogradouroVazio() throws Exception {
		medico.getEndereco().setLogradouro("");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirLogradouroMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("asaaasasasassasasdsdsasasassasasasasassasasasasassa");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirNumeroVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirNumeroMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("13245678901");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirComplementoVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirComplementoMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Complemento");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirBairroVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirBairroMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro Maior Que vinte");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirCEPVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro");
		medico.getEndereco().setCep("");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirCEPMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("RUa 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro");
		medico.getEndereco().setCep("12100-2213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirCidadeVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirCidadeMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro ");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Cidade Maior que o permitido para inserir no bancoo");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirUfVazio() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirUfMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("Estado Maior");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirPaisVazio() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirPaisMaiorQueEsperado() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("pais maior que o esperado 30!!!");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirContatoVazio() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirContatoMaiorQueEsperado() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("(12)2345-12332444");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.insert(medico);
	}

	@Test(expected = Exception.class)
	public void testarInserirEstadoCivilNull() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("(81)2322-3222");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(null);
		negocioMedico.insert(medico);
	}

	// UPDATE

	@Test(expected = Exception.class)
	public void testarUpdateNomeVazio() throws Exception {
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		medico.setNome("");
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateNomeMaiorQueEsperado() throws Exception {
		medico.setNome(
				"asasasassasasasdsdsasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasas");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCPFVazio() throws Exception {
		medico.setCpf("");
		medico.setNome("Juca");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCPFMaiorQueEsperado() throws Exception {
		medico.setCpf("123.213.213-122");
		medico.setNome("Juca");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateRGVazio() throws Exception {
		medico.setRg("");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateRGMaiorQueEsperado() throws Exception {
		medico.setRg("123456789012345678901");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateLogradouroVazio() throws Exception {
		medico.getEndereco().setLogradouro("");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateLogradouroMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("asaaasasasassasasdsdsasasassasasasasassasasasasassa");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateNumeroVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateNumeroMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("13245678901");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateComplementoVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateComplementoMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Complemento");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateBairroVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateBairroMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro Maior Que vinte");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCEPVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro");
		medico.getEndereco().setCep("");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCEPMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("RUa 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro");
		medico.getEndereco().setCep("12100-2213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCidadeVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateCidadeMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro ");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Cidade Maior que o permitido para inserir no bancoo");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateUfVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro ");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Cidade");
		medico.getEndereco().setUf("");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateUfMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro ");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Cidade");
		medico.getEndereco().setUf("PEE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdatePaisVazio() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdatePaisMaiorQueEsperado() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("pais maior que o esperado 30!!!");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateContatoVazio() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateContatoMaiorQueEsperado() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("(12)2345-12332444");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.update(medico);
	}

	@Test(expected = Exception.class)
	public void testarUpdateEstadoCivilNull() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("(81)2322-3222");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(null);
		negocioMedico.update(medico);
	}

	// REMOVE

	@Test(expected = Exception.class)
	public void testarRemovermedicoSemID() throws Exception {
		medico.getId();
		negocioMedico.remove(medico);
	}
	
	// REFRESH

	@Test(expected = Exception.class)
	public void testarRefreshNomeVazio() throws Exception {
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		medico.setNome("");
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshNomeMaiorQueEsperado() throws Exception {
		medico.setNome(
				"asasasassasasasdsdsasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasasasasassasas");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCPFVazio() throws Exception {
		medico.setCpf("");
		medico.setNome("Juca");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCPFMaiorQueEsperado() throws Exception {
		medico.setCpf("123.213.213-122");
		medico.setNome("Juca");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshRGVazio() throws Exception {
		medico.setRg("");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshRGMaiorQueEsperado() throws Exception {
		medico.setRg("123456789012345678901");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshLogradouroVazio() throws Exception {
		medico.getEndereco().setLogradouro("");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshLogradouroMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("asaaasasasassasasdsdsasasassasasasasassasasasasassa");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshNumeroVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshNumeroMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("13245678901");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshComplementoVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshComplementoMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Complemento");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshBairroVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshBairroMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro Maior Que vinte");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCEPVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro");
		medico.getEndereco().setCep("");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCEPMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("RUa 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro");
		medico.getEndereco().setCep("12100-2213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCidadeVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshCidadeMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro ");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Cidade Maior que o permitido para inserir no bancoo");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshUfVazio() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro ");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Cidade");
		medico.getEndereco().setUf("");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshUfMaiorQueEsperado() throws Exception {
		medico.getEndereco().setLogradouro("Rua 01");
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Bairro ");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Cidade");
		medico.getEndereco().setUf("PEE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshPaisVazio() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshPaisMaiorQueEsperado() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("pais maior que o esperado 30!!!");
		medico.setContato("3333-3333");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshContatoVazio() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshContatoMaiorQueEsperado() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("(12)2345-12332444");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(EstadoCivil.SOLTEIRO);
		negocioMedico.refresh(medico);
	}

	@Test(expected = Exception.class)
	public void testarRefreshEstadoCivilNull() throws Exception {
		medico.setNome("Juca");
		medico.setCpf("123.123.123-12");
		medico.setRg("123");
		medico.getEndereco().setLogradouro("Rua 01");
		medico.getEndereco().setNumero("132");
		medico.getEndereco().setComplemento("Apto 1001");
		medico.getEndereco().setBairro("Boa Viagem");
		medico.getEndereco().setCep("12100-213");
		medico.getEndereco().setCidade("Recife");
		medico.getEndereco().setUf("PE");
		medico.getEndereco().setPais("Brasil");
		medico.setContato("(81)2322-3222");
		medico.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		medico.setEmail("email@email.com");
		medico.setEstadoCivil(null);
		negocioMedico.refresh(medico);
	}
	
}
