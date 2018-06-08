package testessistemas;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	private static final String URL = "http://localhost:8080/ClinicManagementFront/index.xhtml";
	public static String driverPath = "/Users/luhanlacerda/Documents/Developer/Git/clinicmanagement/lib-testes/";
	public static WebDriver driver;

	@Before
	public void iniciarDriver() {
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to(URL);
	}

	@After
	public void fecharDriver() {
		driver.close();
	}

	@Test
	public void testarLogarUsuarioInvalido() {
		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("");
		//username.submit();
		
		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");
		
		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();
		
		boolean existeMensagem = driver.getPageSource().contains("Username obrigatorio.");

		Assert.assertTrue(existeMensagem);
	}
	
	@Test
	public void testarLogarPasswordInvalido() {
		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");
		
		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("");
		//password.submit();
		
		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();
		
		boolean existeMensagem = driver.getPageSource().contains("Password obrigatorio.");

		Assert.assertTrue(existeMensagem);
	}
	
	@Test
	public void testarLogarInvalido() {
		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("");
		
		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("");
		//password.submit();

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();
		
		boolean existeMensagemErroUsername = driver.getPageSource().contains("Username obrigatorio.");
		boolean existeMensagemErroPassword = driver.getPageSource().contains("Password obrigatorio.");

		Assert.assertTrue(existeMensagemErroUsername);
		Assert.assertTrue(existeMensagemErroPassword);
	}
	
	@Test
	public void testarLogar() {
		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");
		
		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");
		//password.submit();

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();
		
		boolean existeMensagemErroUsername = driver.getPageSource().contains("Username obrigatorio.");
		boolean existeMensagemErroPassword = driver.getPageSource().contains("Password obrigatorio.");

		Assert.assertFalse(existeMensagemErroUsername);
		Assert.assertFalse(existeMensagemErroPassword);
	}

}
