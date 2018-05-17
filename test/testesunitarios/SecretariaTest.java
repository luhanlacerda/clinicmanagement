package testesunitarios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import classesBasicas.Consulta;
import classesBasicas.Secretaria;

public class SecretariaTest {

	private Secretaria secretaria;
	
	@Before
	public void inicializarSecretaria() {
		this.secretaria = new Secretaria();
	}
	
	@Test
	public void testSetConsultas() {
		//Given
        Consulta consulta1 = new Consulta();
        Consulta consulta2 = new Consulta();
        List<Consulta> expected = new ArrayList<>(Arrays.asList(consulta1, consulta2));
        
        // When
        secretaria.setListaConsultas(expected);
        List<Consulta> actual = secretaria.getListaConsultas();

        // Then
        Assert.assertEquals(expected, actual);
	}

}
