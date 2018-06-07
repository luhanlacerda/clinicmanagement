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
	}

	@After
	public void fecharDriver() {
		driver.close();
	}

	@Test
	public void testarLogarUsuarioInvalido() {
		driver.navigate().to(URL);
		WebElement username = driver.findElement(By.id("formulariologin:username"));

		username.sendKeys("");
		username.submit();
		
		boolean existeMensagem = driver.getPageSource().contains("Username obrigatorio.");

		Assert.assertTrue(existeMensagem);
	}
	
	@Test
	public void testarLogarPasswordInvalido() {
		driver.navigate().to(URL);
		WebElement password = driver.findElement(By.id("formulariologin:password"));
		
		password.sendKeys("dasd");
		password.submit();
		
		boolean existeMensagem = driver.getPageSource().contains("Username obrigatorio.");

		Assert.assertTrue(existeMensagem);
	}

}
