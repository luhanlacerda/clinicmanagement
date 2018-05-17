package testesunitarios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import classesBasicas.Consulta;
import classesBasicas.Convenio;
import classesBasicas.Paciente;

public class PacienteTest {

	private Paciente paciente;
	
	@Before
	public void inicializadorPaciente() {
		this.paciente = new Paciente();
	}
	
	@Test
	public void testSetConvenio() {
		//Given
        Convenio expected = new Convenio();
        expected.setDescricao("Convenio Teste");
        
        // When
        paciente.setConvenio(expected);
        Convenio actual = paciente.getConvenio();

        // Then
        Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSetConsultas() {
		//Given
        Consulta consulta1 = new Consulta();
        Consulta consulta2 = new Consulta();
        List<Consulta> expected = new ArrayList<>(Arrays.asList(consulta1, consulta2));
        
        // When
        paciente.setListaConsultas(expected);
        List<Consulta> actual = paciente.getListaConsultas();

        // Then
        Assert.assertEquals(expected, actual);
	}
	
}
