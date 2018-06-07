package testessistemas;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConvenioTest {
	
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
	public void testarInserirConvenio() {
		driver.navigate().to(URL);
		
		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");
		
		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();
		
		//driver.navigate().to("http://localhost:8080/ClinicManagementFront/ListarConvenio.xhtml");
		
		WebElement irCadastrar = driver.findElement(By.className("waves-effect waves-dark"));
		irCadastrar.click();
		
		WebElement btnNovoConvenio = driver.findElement(By.id("formnovoconvenio:btn-novo-convenio"));
		btnNovoConvenio.click();
		
		WebElement descricao = driver.findElement(By.id("form-convenio:descricao"));
		descricao.sendKeys("Teste Selenium");
		
		WebElement btnCadastrarConvenio = driver.findElement(By.id("form-convenio:btn-cadastrar"));
		btnCadastrarConvenio.click();
		
		boolean encontrouNome = driver.getPageSource().contains("Everton Walker");
		Assert.assertFalse(encontrouNome);
	}
	
}
