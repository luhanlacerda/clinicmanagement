package testesintegracao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import classesBasicas.Login;
import negocios.INegocioLogin;
import negocios.NegocioLogin;

public class LoginTest {

	private Login login;
	private static INegocioLogin negocio;
	
	@BeforeClass
	public static void inicializarnegocioMedico() {
		negocio = new NegocioLogin();
	}
	
	@Before
	public void inicializarMedico() {
		this.login = new Login();
	}
	
	@Test
	public void testInserirLoginValido() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		
		// Then
		negocio.insert(this.login);
	}
	
	@Test(expected=Exception.class)
	public void testInserirLoginUsernameNulo() throws Exception {
		// Given
		this.login.setUsername(null);
		this.login.setPassword("Juca");
		
		// Then
		negocio.insert(this.login);
	}
	
	@Test(expected=Exception.class)
	public void testInserirLoginUsernameVazio() throws Exception {
		// Given
		this.login.setUsername("");
		this.login.setPassword("Juca");
		
		// Then
		negocio.insert(this.login);
	}
	
	@Test(expected=Exception.class)
	public void testInserirLoginUsernameApenasEspaco() throws Exception {
		// Given
		this.login.setUsername("   ");
		this.login.setPassword("Juca");
		
		// Then
		negocio.insert(this.login);
	}
	
	@Test(expected=Exception.class)
	public void testInserirLoginPasswordNulo() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword(null);
		
		// Then
		negocio.insert(this.login);
	}
	
	@Test(expected=Exception.class)
	public void testInserirLoginPasswordVazio() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword("");
		
		// Then
		negocio.insert(this.login);
	}
	
	@Test(expected=Exception.class)
	public void testInserirLoginPasswordApenasEspaco() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword("   ");
		
		// Then
		negocio.insert(this.login);
	}
	
	@Test
	public void testLogin() throws Exception {
		// Given
		int notExpected = 0;
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		negocio.insert(this.login);
		
		// When
		Login actual = negocio.login(this.login);
		
		// Then
		assertTrue(actual.getId() > notExpected);
	}
	
	@Test(expected=Exception.class)
	public void testLoginUsernameNulo() throws Exception {
		// Given
		this.login.setUsername(null);
		this.login.setPassword("Juca");
		
		// Then
		negocio.login(this.login);
	}
	
	@Test(expected=Exception.class)
	public void testLoginUsernameVazio() throws Exception {
		// Given
		this.login.setUsername("");
		this.login.setPassword("Juca");
		
		// Then
		negocio.login(this.login);
	}
	
	@Test(expected=Exception.class)
	public void testLoginUsernameApenasEspaco() throws Exception {
		// Given
		this.login.setUsername("   ");
		this.login.setPassword("Juca");
		
		// Then
		negocio.login(this.login);
	}
	
	@Test(expected=Exception.class)
	public void testLoginPasswordNulo() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword(null);
		
		// Then
		negocio.login(this.login);
	}
	
	@Test(expected=Exception.class)
	public void testLoginPasswordVazio() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword("");
		
		// Then
		negocio.login(this.login);
	}
	
	@Test(expected=Exception.class)
	public void testLoginPasswordApenasEspaco() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword("   ");
		
		// Then
		negocio.login(this.login);
	}
	
	@Test(expected=Exception.class)
	public void testLoginUsernameIncorreto() throws Exception {
		// Given
		this.login.setUsername("Jujua");
		this.login.setPassword("Juca");
		
		// Then
		negocio.login(this.login);
	}
	
	@Test(expected=Exception.class)
	public void testLoginPasswordIncorreto() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword("Jucaa");
		
		// Then
		negocio.login(this.login);
	}
	
	@Test
	public void testLoginUpdateValido() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		negocio.insert(this.login);
		Login actual = negocio.login(this.login);
		
		// When
		actual.setUsername("teste");
		actual.setPassword("qwerty");
		
		// Then
		negocio.update(actual);
	}
	
	@Test(expected=Exception.class)
	public void testLoginUpdateUsernameNulo() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		negocio.insert(this.login);
		Login actual = negocio.login(this.login);
		
		// When
		actual.setUsername(null);
		actual.setPassword("qwerty");
		
		// Then
		negocio.update(actual);
	}
	
	@Test(expected=Exception.class)
	public void testLoginUpdateUsernameVazio() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		negocio.insert(this.login);
		Login actual = negocio.login(this.login);
		
		// When
		actual.setUsername("");
		actual.setPassword("qwerty");
		
		// Then
		negocio.update(actual);
	}
	
	@Test(expected=Exception.class)
	public void testLoginUpdateUsernameComEspaco() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		negocio.insert(this.login);
		Login actual = negocio.login(this.login);
		
		// When
		actual.setUsername("  ");
		actual.setPassword("qwerty");
		
		// Then
		negocio.update(actual);
	}
	
	@Test(expected=Exception.class)
	public void testLoginUpdatePasswordNulo() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		negocio.insert(this.login);
		Login actual = negocio.login(this.login);
		
		// When
		actual.setUsername("Juju");
		actual.setPassword(null);
		
		// Then
		negocio.update(actual);
	}
	
	@Test(expected=Exception.class)
	public void testLoginUpdatePasswordVazio() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		negocio.insert(this.login);
		Login actual = negocio.login(this.login);
		
		// When
		actual.setUsername("Juju");
		actual.setPassword("");
		
		// Then
		negocio.update(actual);
	}
	
	@Test(expected=Exception.class)
	public void testLoginUpdatePasswordComEspaco() throws Exception {
		// Given
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		negocio.insert(this.login);
		Login actual = negocio.login(this.login);
		
		// When
		actual.setUsername("Juju");
		actual.setPassword("   ");
		
		// Then
		negocio.update(actual);
	}
	
	@Test
	public void testRefreshValido() throws Exception {
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		negocio.insert(login);
		
		Login actual = negocio.login(this.login);
		actual.setUsername("teste");
		actual.setPassword("qwerty");
		negocio.update(actual);
		
		negocio.refresh(this.login);
		
		assertEquals(this.login, actual);
	}
	
	@Test
	public void testInsertCollectionValido() throws Exception {
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		Login login2 = new Login();
		login2.setUsername("teste");
		login2.setPassword("qwerty");
		
		negocio.insertCollection(new ArrayList<Login>(Arrays.asList(this.login, login2)), Login.class);
	}
	
	@Test
	public void testGetAllValido() throws Exception {
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		negocio.insert(this.login);
		
		assertFalse(negocio.getAll(Login.class).isEmpty());
	}
	
	@Test
	public void testSearchByKeyValido() throws Exception {
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		negocio.insert(this.login);
		
		Login expected = negocio.login(this.login);
		Login actual = negocio.searchByKey(expected.getId(), Login.class);
		
		assertEquals(expected, actual);
	}
	
	@Test(expected=Exception.class)
	public void testSearchByKeyInvalido() throws Exception {
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		
		negocio.searchByKey(this.login.getId(), Login.class);
	}
	
	@Test
	public void testLoginRemoverValido() throws Exception {
		Login actual;
		
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		actual = negocio.login(this.login);
		negocio.remove(actual);
		
		this.login.setUsername("teste");
		this.login.setPassword("qwerty");
		actual = negocio.login(this.login);
		negocio.remove(actual);
	}
	
	@Test(expected=Exception.class)
	public void testLoginRemoverInvalido() throws Exception {
		this.login.setUsername("Juju");
		this.login.setPassword("Juca");
		negocio.remove(this.login);
	}
	
}
