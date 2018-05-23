package testesintegracao;


import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import classesBasicas.Convenio;
import classesBasicas.Paciente;
import classesBasicas.incorporada.EstadoCivil;
import negocios.INegocioConvenio;
import negocios.NegocioConvenio;

public class ConvenioTest {
	
	private Convenio convenio;
	private static INegocioConvenio negocioConvenio;

	@BeforeClass
	public static void inicializarNegocioConvenio() {
		negocioConvenio = new NegocioConvenio();
	}

	@Before
	public void inicializarConvenio() {
		this.convenio = new Convenio();
	}
	
	@Ignore
	public void testarInserirConvenioValido() throws Exception {
		//Given
		Convenio c = new Convenio();
		Paciente p = new Paciente();
		p.setNome("Juca");
		p.setCpf("123.123.123-12");
		p.setRg("123");
		p.getEndereco().setLogradouro("Rua 01");
		p.getEndereco().setNumero("132");
		p.getEndereco().setComplemento("Apto 1001");
		p.getEndereco().setBairro("Boa Viagem");
		p.getEndereco().setCep("12100-213");
		p.getEndereco().setCidade("Recife");
		p.getEndereco().setUf("PE");
		p.getEndereco().setPais("Brasil");
		p.setContato("3333-3333");
		p.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		p.setEmail("email@email.com");
		p.setEstadoCivil(EstadoCivil.SOLTEIRO);
		c.setDescricao("HAPVIDA");
		c.setListaPacientes(Arrays.asList(p));
		p.setConvenio(c);
		
		negocioConvenio.insert(c);
	}
	
	@Test(expected = Exception.class)
	public void testarInserirDescricaoVazio() throws Exception {
		Convenio c = new Convenio();
		Paciente p = new Paciente();
		p.setNome("Juca");
		p.setCpf("123.123.123-12");
		p.setRg("123");
		p.getEndereco().setLogradouro("Rua 01");
		p.getEndereco().setNumero("132");
		p.getEndereco().setComplemento("Apto 1001");
		p.getEndereco().setBairro("Boa Viagem");
		p.getEndereco().setCep("12100-213");
		p.getEndereco().setCidade("Recife");
		p.getEndereco().setUf("PE");
		p.getEndereco().setPais("Brasil");
		p.setContato("3333-3333");
		p.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		p.setEmail("email@email.com");
		p.setEstadoCivil(EstadoCivil.SOLTEIRO);
		c.setDescricao("");
		c.setListaPacientes(Arrays.asList(p));
		p.setConvenio(c);
		
		negocioConvenio.insert(c);
		
	}

	@Test(expected = Exception.class)
	public void testarInserirDescricaoMaior() throws Exception {
		Convenio c = new Convenio();
		Paciente p = new Paciente();
		p.setNome("Juca");
		p.setCpf("123.123.123-12");
		p.setRg("123");
		p.getEndereco().setLogradouro("Rua 01");
		p.getEndereco().setNumero("132");
		p.getEndereco().setComplemento("Apto 1001");
		p.getEndereco().setBairro("Boa Viagem");
		p.getEndereco().setCep("12100-213");
		p.getEndereco().setCidade("Recife");
		p.getEndereco().setUf("PE");
		p.getEndereco().setPais("Brasil");
		p.setContato("3333-3333");
		p.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		p.setEmail("email@email.com");
		p.setEstadoCivil(EstadoCivil.SOLTEIRO);
		c.setDescricao("asdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasd");
		c.setListaPacientes(Arrays.asList(p));
		p.setConvenio(c);
		
		negocioConvenio.insert(c);
		
	}
	
	//Update
	
	@Test(expected = Exception.class)
	public void testarUpdateDescricaoVazio() throws Exception {
		Convenio c = new Convenio();
		Paciente p = new Paciente();
		p.setNome("Juca");
		p.setCpf("123.123.123-12");
		p.setRg("123");
		p.getEndereco().setLogradouro("Rua 01");
		p.getEndereco().setNumero("132");
		p.getEndereco().setComplemento("Apto 1001");
		p.getEndereco().setBairro("Boa Viagem");
		p.getEndereco().setCep("12100-213");
		p.getEndereco().setCidade("Recife");
		p.getEndereco().setUf("PE");
		p.getEndereco().setPais("Brasil");
		p.setContato("3333-3333");
		p.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		p.setEmail("email@email.com");
		p.setEstadoCivil(EstadoCivil.SOLTEIRO);
		c.setDescricao("");
		c.setListaPacientes(Arrays.asList(p));
		p.setConvenio(c);
		
		negocioConvenio.update(c);
		
	}
	
	@Test(expected = Exception.class)
	public void testarUpdateDescricaoMaior() throws Exception {
		Convenio c = new Convenio();
		Paciente p = new Paciente();
		p.setNome("Juca");
		p.setCpf("123.123.123-12");
		p.setRg("123");
		p.getEndereco().setLogradouro("Rua 01");
		p.getEndereco().setNumero("132");
		p.getEndereco().setComplemento("Apto 1001");
		p.getEndereco().setBairro("Boa Viagem");
		p.getEndereco().setCep("12100-213");
		p.getEndereco().setCidade("Recife");
		p.getEndereco().setUf("PE");
		p.getEndereco().setPais("Brasil");
		p.setContato("3333-3333");
		p.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
		p.setEmail("email@email.com");
		p.setEstadoCivil(EstadoCivil.SOLTEIRO);
		c.setDescricao("asdasdasdasdasasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasasdasdasd");
		c.setListaPacientes(Arrays.asList(p));
		p.setConvenio(c);
		
		negocioConvenio.update(c);
		
	}
	
	// REMOVE

		@Test(expected = Exception.class)
		public void testarRemoverConvenioSemID() throws Exception {
			Convenio c = new Convenio();
			c.getId();
			negocioConvenio.remove(c);
		}
		
	// Refresh
		
		public void testarRefreshDescricaoVazio() throws Exception {
			Convenio c = new Convenio();
			Paciente p = new Paciente();
			p.setNome("Juca");
			p.setCpf("123.123.123-12");
			p.setRg("123");
			p.getEndereco().setLogradouro("Rua 01");
			p.getEndereco().setNumero("132");
			p.getEndereco().setComplemento("Apto 1001");
			p.getEndereco().setBairro("Boa Viagem");
			p.getEndereco().setCep("12100-213");
			p.getEndereco().setCidade("Recife");
			p.getEndereco().setUf("PE");
			p.getEndereco().setPais("Brasil");
			p.setContato("3333-3333");
			p.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
			p.setEmail("email@email.com");
			p.setEstadoCivil(EstadoCivil.SOLTEIRO);
			c.setDescricao("");
			c.setListaPacientes(Arrays.asList(p));
			p.setConvenio(c);
			
			negocioConvenio.refresh(c);
			
		}
		
		@Test(expected = Exception.class)
		public void testarRefreshDescricaoMaior() throws Exception {
			Convenio c = new Convenio();
			Paciente p = new Paciente();
			p.setNome("Juca");
			p.setCpf("123.123.123-12");
			p.setRg("123");
			p.getEndereco().setLogradouro("Rua 01");
			p.getEndereco().setNumero("132");
			p.getEndereco().setComplemento("Apto 1001");
			p.getEndereco().setBairro("Boa Viagem");
			p.getEndereco().setCep("12100-213");
			p.getEndereco().setCidade("Recife");
			p.getEndereco().setUf("PE");
			p.getEndereco().setPais("Brasil");
			p.setContato("3333-3333");
			p.setDtNascimento(new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997"));
			p.setEmail("email@email.com");
			p.setEstadoCivil(EstadoCivil.SOLTEIRO);
			c.setDescricao("asdasdasdasdasasdasdasdasdasdasdasdasdasdasdasdasdasdasdasdasasdasdasd");
			c.setListaPacientes(Arrays.asList(p));
			p.setConvenio(c);
			
			negocioConvenio.refresh(c);
			
		}
		
	
}
