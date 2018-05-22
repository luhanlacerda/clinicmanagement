package testesunitarios;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import classesBasicas.Consulta;
import classesBasicas.Especialidade;
import classesBasicas.Medico;

public class MedicoTest {
	
	private Medico medico;
	
	@Before
	public void inicializarMedico() {
		this.medico = new Medico();
	}
	
	@Test
	public void testCrm() {
		// Given
		String expected = "123";

		// When
		medico.setCrm(expected);
		String actual = medico.getCrm();

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testEspecialidade() {
		// Given
		Especialidade expected = new Especialidade();
		String expectedDesc = "Cardiologia";
		expected.setDescricao(expectedDesc);

		// When
		medico.setEspecialidade(expected);
		Especialidade actual = medico.getEspecialidade();

		// Then
		assertEquals(expected, actual);
		assertEquals(expectedDesc, actual.getDescricao());
	}
	
	@Test
	public void testListaConsulta() {
		// Given
		List<Consulta> expected = Arrays.asList(new Consulta(), new Consulta());

		// When
		medico.setListaConsulta(expected);
		List<Consulta> actual = medico.getListaConsulta();

		// Then
		assertEquals(expected, actual);
		assertFalse(actual.isEmpty());
	}

}
