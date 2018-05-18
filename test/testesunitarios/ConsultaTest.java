package testesunitarios;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import classesBasicas.Consulta;
import classesBasicas.Medico;
import classesBasicas.Paciente;
import classesBasicas.Secretaria;
import classesBasicas.incorporada.EstadoConsulta;

public class ConsultaTest {
	
	private Consulta consulta;
	
	@Before
	public void inicializarConsulta() {
		this.consulta = new Consulta();
	}
	
	@Test
	public void testId() {
		// Id é auto incrementado pelo hibernate

		// Given
		int expectedId = 0;

		// When
		int actualDesc = this.consulta.getId();

		// Then
		Assert.assertEquals(expectedId, actualDesc);
	}
	
	@Test
	public void testHorario() throws ParseException {
		// Given
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
		formatter.setLenient(false);
		Date expected = formatter.parse("12:40");
		consulta.setHorario(expected);
		
		// When
		Date actual = consulta.getHorario();
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testInvalidHorario() throws ParseException {
		// Given
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm");
		String expected = "26:40";
		Date date = formatter.parse(expected);
		consulta.setHorario(date);
		
		// When
		String actual = formatter.format(consulta.getHorario());
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDuracao() {
		// Given
		int expected = 1000000;
		consulta.setDuracao(expected);
		
		// When
		int actual = consulta.getDuracao();
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testObservacoesInicio() {
		// Given
		String expected = "";
		consulta.setObservacoes(expected);
		
		// When
		String actual = consulta.getObservacoes();
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test(expected=Exception.class)
	public void testObservacoesNula() {
		// Given
		String expected = null;
		consulta.setObservacoes(expected);
		
		// Then
		consulta.getObservacoes();
	}
	
	@Test
	public void testObservacoesVazio() {
		// Given
		String expected = "";
		consulta.setObservacoes(expected);
		
		// When
		String actual = consulta.getObservacoes();
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testObservacoesComTexto() {
		// Given
		String expected = "teste";
		consulta.setObservacoes(expected);
		
		// When
		String actual = consulta.getObservacoes();
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test(expected=Exception.class)
	public void testEstadoConsultaInicio() {
		// Then
		consulta.getEstado();
	}
	
	@Test
	public void testEstadoConsultaMarcada() {
		// Given
		EstadoConsulta expected = EstadoConsulta.MARCADA;
		consulta.setEstado(expected);
		
		// When
		EstadoConsulta actual = consulta.getEstado();
		
		// Then
		assertEquals(actual, expected);
	}
	
	@Test
	public void testReceitaInicio() {
		// Given
		String expected = "";
		consulta.setReceita(expected);
		
		// When
		String actual = consulta.getReceita();
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test(expected=Exception.class)
	public void testReceitaNula() {
		// Given
		String expected = null;
		consulta.setReceita(expected);
		
		// Then
		consulta.getReceita();
	}
	
	@Test
	public void testReceitaVazio() {
		// Given
		String expected = "";
		consulta.setReceita(expected);
		
		// When
		String actual = consulta.getReceita();
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testReceitaComTexto() {
		// Given
		String expected = "teste";
		consulta.setReceita(expected);
		
		// When
		String actual = consulta.getReceita();
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test(expected=Exception.class)
	public void testMedicoInicio() {
		// Then
		consulta.getMedico();
	}
	
	@Test(expected=Exception.class)
	public void testMedicoNulo() {
		// Then
		consulta.setMedico(null);
	}
	
	@Test
	public void testMedico() {
		// Given
		Medico expected = new Medico();
		consulta.setMedico(expected);
		
		// When
		Medico actual = consulta.getMedico();
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test(expected=Exception.class)
	public void testPacienteInicio() {
		// Then
		consulta.getPaciente();
	}
	
	@Test(expected=Exception.class)
	public void testPacienteNulo() {
		// Then
		consulta.setPaciente(null);
	}
	
	@Test
	public void testPaciente() {
		// Given
		Paciente expected = new Paciente();
		consulta.setPaciente(expected);
		
		// When
		Paciente actual = consulta.getPaciente();
		
		// Then
		assertEquals(expected, actual);
	}
	
	@Test(expected=Exception.class)
	public void testSecretariaInicio() {
		// Then
		consulta.getSecretaria();
	}
	
	@Test(expected=Exception.class)
	public void testSecretariaNulo() {
		// Then
		consulta.setSecretaria(null);
	}
	
	@Test
	public void testSecretaria() {
		// Given
		Secretaria expected = new Secretaria();
		consulta.setSecretaria(expected);
		
		// When
		Secretaria actual = consulta.getSecretaria();
		
		// Then
		assertEquals(expected, actual);
	}

}
