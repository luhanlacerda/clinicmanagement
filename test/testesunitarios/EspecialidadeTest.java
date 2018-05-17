package testesunitarios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import classesBasicas.Consulta;
import classesBasicas.Especialidade;
import classesBasicas.Medico;

public class EspecialidadeTest {

	private Especialidade especialidade;

	@Before
	public void inicializarEspecialidade() {
		this.especialidade = new Especialidade();
	}

	@Test
	public void testSetDescricao() {
		// Given
		String expected = "Cardiologista";

		// When
		especialidade.setDescricao(expected);
		String actual = especialidade.getDescricao();

		// Then
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public void testSetMedicos() {
		//Given
        Medico medico1 = new Medico();
        Medico medico2 = new Medico();
        List<Medico> expected = new ArrayList<>(Arrays.asList(medico1, medico2));
        
        // When
        especialidade.setListaMedicos(expected);
        List<Medico> actual = especialidade.getListaMedicos();

        // Then
        Assert.assertEquals(expected, actual);
	}
	
	@Test
    public void testGetId() {
    	//O id é inserido atraves do sequence do banco com o hibernate
    	
    	//Given
    	int expected = 0;
    	
    	//When
    	int actual = especialidade.getId();
    	
    	//Then
    	Assert.assertEquals(expected, actual);
    }
}
