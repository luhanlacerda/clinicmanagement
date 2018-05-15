package testesunitarios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import classesBasicas.Login;
import classesBasicas.Pessoa;
import classesBasicas.incorporada.Endereco;
import classesBasicas.incorporada.EstadoCivil;

public class PessoaTest {
	
	private Pessoa pessoa;
	
	@Before
	public void inicializarPessoa() {
		this.pessoa = new Pessoa();
	}

	    @Test
	    public void testSetName() {
	        // Given
	        String expected = "Thiago";

	        // When
	        pessoa.setNome(expected);
	        String actual = pessoa.getNome();

	        // Then
	        Assert.assertEquals(expected, actual);
	    }

	    @Test
	    public void testSetRg() {
	    	//Given
	    	String expected = "7178289";
	    	
	    	//When
	    	pessoa.setRg(expected);
	    	String actual = pessoa.getRg();
	    	
	    	//Then
	    	Assert.assertEquals(expected, actual);
	    }
	    
	    @Test
	    public void testSetCpf() {
	    	//Given
	    	String expected = "481.649.530-40";
	    	
	    	//When
	    	pessoa.setCpf(expected);
	    	String actual = pessoa.getCpf();
	    	
	    	//Then
	    	Assert.assertEquals(expected, actual);
	    }
	    
	    @Test
	    public void testSetContato() {
	    	//Given
	    	String expected = "(81)3123-4556";
	    	
	    	//When
	    	pessoa.setContato(expected);
	    	String actual = pessoa.getContato();
	    	
	    	//Then
	    	Assert.assertEquals(expected, actual);
	    }
	    
	    @Test
	    public void testSetDataNascimnto() throws ParseException {
	    	//Given
	    	Date expected = new SimpleDateFormat("dd/MM/yyyy").parse("26/09/1997");
	    	
	    	//When
	    	pessoa.setDtNascimento(expected);
	    	Date actual = pessoa.getDtNascimento();
	    	
	    	//Then
	    	Assert.assertEquals(expected, actual);
	    }
	    
	    @Test
	    public void testSetEmail() {
	    	//Given
	    	String expected = "teste@gmail.com";
	    	
	    	//When
	    	pessoa.setEmail(expected);
	    	String actual = pessoa.getEmail();
	    	
	    	//Then
	    	Assert.assertEquals(expected, actual);
	    }
	    
	    @Test
	    public void testSetEstadoCivil() {
	    	//Given
	    	EstadoCivil expected = EstadoCivil.SOLTEIRO;
	    	
	    	//When
	    	pessoa.setEstadoCivil(expected);
	    	EstadoCivil actual = pessoa.getEstadoCivil();
	    	
	    	//Then
	    	Assert.assertEquals(expected, actual);
	    }
	    
	    @Test
	    public void testSetEndereco() {
	    	//Given
	    	Endereco expected = new Endereco();
	    	expected.setLogradouro("Rua 01");
	    	expected.setNumero("131");
	    	expected.setComplemento("Apto 1001");
	    	expected.setBairro("Boa Viagem");
	    	expected.setCep("51111-000");
	    	expected.setCidade("Recife");
	    	expected.setUf("PE");
	    	expected.setPais("Brasil");
	    	
	    	//When
	    	pessoa.setEndereco(expected);
	    	Endereco actual = pessoa.getEndereco();
	    	
	    	//Then
	    	Assert.assertEquals(expected, actual);
	    }
	    
	    @Test
	    public void testGetLogin() {
	    	//O hibernate inclui automaticamente a classe login, 
	    	//entao como nao ha possibilidade de setar, deveria ser igual a null
	    	
	    	//Given
	    	Login expected = null;
	    	
	    	//When
	    	
	    	Login actual = pessoa.getLogin();
	    	
	    	//Then
	    	Assert.assertEquals(expected, actual);
	    }
	    
	    @Test
	    public void testGetId() {
	    	//O id é inserido atraves do sequence do banco com o hibernate
	    	
	    	//Given
	    	int expected = 0;
	    	
	    	//When
	    	int actual = pessoa.getId();
	    	
	    	//Then
	    	Assert.assertEquals(expected, actual);
	    }
	    
}
