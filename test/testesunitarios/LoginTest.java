package testesunitarios;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import classesBasicas.Login;
import classesBasicas.Pessoa;

public class LoginTest {

	private Login login;
	
	@Before
	public void inicializarLogin() {
		this.login = new Login();
	}
	
	@Test
	public void testId() {
		// Id é auto incrementado pelo hibernate
		
		// Given
		int expected = 0;

		// When
		int actual = login.getId();

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testUsername() {
		// Given
		String expected = "teste";

		// When
		login.setUsername(expected);
		String actual = login.getUsername();

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPassword() {
		// Given
		String expected = "teste";

		// When
		login.setPassword(expected);
		String actual = login.getPassword();

		// Then
		assertEquals(expected, actual);
	}
	
	@Test
	public void testPessoa() {
		// Pessoa é inicializado pelo hibernate
		
		// Given
		Pessoa expected = null;
		
		// When
		Pessoa actual = login.getPessoa();
		
		//Then
		assertEquals(expected, actual);
	}
	
}
