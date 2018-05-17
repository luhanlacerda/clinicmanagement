package testesunitarios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import classesBasicas.Convenio;
import classesBasicas.Paciente;
import classesBasicas.incorporada.Endereco;
import classesBasicas.incorporada.EstadoCivil;

public class ConvenioTest {

	private Convenio convenio;

	@Before
	public void inicializarCovenio() {
		this.convenio = new Convenio();
	}

	@Test
	public void testId() {
		// Id é auto incrementado pelo hibernate

		// Given
		int expectedId = 0;

		// When
		int actualDesc = convenio.getId();

		// Then
		Assert.assertEquals(expectedId, actualDesc);

	}

	@Test
	public void testDescricao() {
		// Given
		String expectedDesc = "";

		// When
		convenio.setDescricao(expectedDesc);
		String actualDesc = convenio.getDescricao();

		// Then
		Assert.assertEquals(expectedDesc, actualDesc);
	}

	@Test
	public void listaPacientes() throws ParseException {
		// Given
		Paciente expected = new Paciente();
		expected.setNome("Juca");
		expected.setRg("233.313-64");
		Date date = new SimpleDateFormat("dd/MM/yyyy").parse("16/10/1996");
		expected.setDtNascimento(date);
		expected.setCpf("123.343.434-11");
		expected.setEmail("juca@gmail.com");
		Endereco endereco = new Endereco();
		endereco.setLogradouro("Rua 20");
		endereco.setNumero("65");
		endereco.setComplemento("Apto 1002");
		endereco.setBairro("Madalena");
		endereco.setCep("51111-000");
		endereco.setCidade("Recife");
		endereco.setUf("PE");
		endereco.setPais("Brasil");
		expected.setEndereco(endereco);
		EstadoCivil estadoCivil = EstadoCivil.SOLTEIRO;
		expected.setEstadoCivil(estadoCivil);
		convenio.setDescricao("Rap da vida");
		expected.setConvenio(convenio);

		// When
		convenio.setListaPacientes(Arrays.asList(expected));

		// Then
		Assert.assertFalse(convenio.getListaPacientes().isEmpty());

	}

}
