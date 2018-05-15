package testesunitarios;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import classesBasicas.incorporada.Endereco;

public class EnderecoTest {
	
	private Endereco endereco;
	
	@Before
	public void inicializarEndereco() {
		this.endereco = new Endereco();
	}
	
	@Test
	public void testLogradouro() {
		// Given 
		String expectedLogra = "";

		// When
		endereco.setLogradouro(expectedLogra);
		String actualExpect = endereco.getLogradouro(); 
		
		// Then
		Assert.assertEquals(expectedLogra, actualExpect);
	}
	
	@Test
	public void testNumero() {
		// Given 
		String expectedNum = "10";

		// When
		endereco.setNumero(expectedNum);
		String actualExpect = endereco.getNumero(); 
		
		// Then
		Assert.assertEquals(expectedNum, actualExpect);
	}
	
	@Test
	public void testComplemento() {
		// Given 
		String expectedComp = "Bloco 1";

		// When
		endereco.setComplemento(expectedComp);
		String actualExpect = endereco.getComplemento(); 
		
		// Then
		Assert.assertEquals(expectedComp, actualExpect);
	}
	
	@Test
	public void testBairro() {
		// Given 
		String expectedBairro = "Boa Viagem";

		// When
		endereco.setBairro(expectedBairro);
		String actualExpect = endereco.getBairro();
		
		// Then
		Assert.assertEquals(expectedBairro, actualExpect);
	}
	
	
	@Test
	public void testCidade() {
		// Given 
		String expectedCidade = "Recife";

		// When
		endereco.setCidade(expectedCidade);
		String actualExpect = endereco.getCidade();
		
		// Then
		Assert.assertEquals(expectedCidade, actualExpect);
	}
	
	
	@Test
	public void testUf() {
		// Given 
		String expectedUf = "PE";

		// When
		endereco.setUf(expectedUf);
		String actualExpect = endereco.getUf();
		
		// Then
		Assert.assertEquals(expectedUf, actualExpect);
	}
	
	@Test
	public void testCep() {
		// Given 
		String expectedCep = "52081200";

		// When
		endereco.setCep(expectedCep);
		String actualExpect = endereco.getCep();
		
		// Then
		Assert.assertEquals(expectedCep, actualExpect);
	}
	
	@Test
	public void testPais() {
		// Given 
		String expectedPais = "Brasil";

		// When
		endereco.setPais(expectedPais);
		String actualExpect = endereco.getPais();
		
		// Then
		Assert.assertEquals(expectedPais, actualExpect);
	}
	
	
}
