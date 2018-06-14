package testessistemas;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@FixMethodOrder(MethodSorters.JVM)
public class SecretariaTest {
	
	private static final String URL = "http://localhost:8080/ClinicManagementFront/index.xhtml";
	public static String driverPath = "lib-testes/";
	public static WebDriver driver;
	public static WebDriverWait wait;

	@Before
	public void iniciarDriver() {
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 15);
	}

	@After
	public void fecharDriver() {
		driver.close();
	}
	
	@Test
	public void testarInserirSecretaria() {
		driver.navigate().to(URL);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("formulariologin:username")));
		
		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Secretaria")));
		driver.findElement(By.linkText("Secretaria")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Nova Secretaria")));
		driver.findElement(By.linkText("Nova Secretaria")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@placeholder='Nome']")));
		driver.findElement(By.xpath("//input[@placeholder='Nome']")).sendKeys("Jubileusa");
		driver.findElement(By.xpath("//input[@placeholder='CPF']")).sendKeys("123.456.789-01");
		driver.findElement(By.xpath("//input[@placeholder='RG']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@placeholder='Logradouro']")).sendKeys("Rua ABC");
		driver.findElement(By.xpath("//input[@placeholder='Número']")).sendKeys("123");
		driver.findElement(By.xpath("//input[@placeholder='Complemento']")).sendKeys("Apto 1");
		driver.findElement(By.xpath("//input[@placeholder='Bairro']")).sendKeys("Graças");
		driver.findElement(By.xpath("//input[@placeholder='Cidade']")).sendKeys("Recife");
		driver.findElement(By.xpath("//input[@placeholder='UF']")).sendKeys("PE");
		driver.findElement(By.xpath("//input[@placeholder='CEP']")).sendKeys("56789-012");
		driver.findElement(By.xpath("//input[@placeholder='País']")).sendKeys("Brasil");
		driver.findElement(By.xpath("//input[@placeholder='Contato']")).sendKeys("81991234567");
		driver.findElement(By.xpath("//input[@placeholder='Data de Nascimento']")).sendKeys("01/01/2000");
		driver.findElement(By.xpath("//input[@placeholder='E-Mail']")).sendKeys("jubileusa@jubiloca.com");
		Select select = new Select(driver.findElement(By.xpath("//select")));
		select.selectByVisibleText("Solteiro");
		driver.findElement(By.xpath("//input[@value='Cadastrar']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'Jubileusa')]")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'81991234567')]")));
	}
	
	@Test
	public void testarAtualizarSecretaria() {
		driver.navigate().to(URL);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("formulariologin:username")));
		
		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Secretaria")));
		driver.findElement(By.linkText("Secretaria")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'Jubileusa')]")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'81991234567')]")));
		WebElement row = driver.findElements(By.xpath("//tbody//tr"))
				.stream()
				.filter(e -> e.findElements(By.xpath("td")).get(1).getText().equals("Jubileusa"))
				.findFirst().get();
		row.findElements(By.xpath("td")).get(3).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@value='Jubileusa']")));
		WebElement nome = driver.findElement(By.xpath("//input[@value='Jubileusa']"));
		nome.clear();
		nome.sendKeys("JubileusaEditada");
		WebElement contato = driver.findElement(By.xpath("//input[@value='81991234567']"));
		contato.clear();
		contato.sendKeys("991234567");
		driver.findElement(By.xpath("//input[@value='Editar']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'JubileusaEditada')]")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'991234567')]")));
	}
	
	@Test(expected=TimeoutException.class)
	public void testRemoverSecretaria() {
		driver.navigate().to(URL);

		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("formulariologin:username")));
		
		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Secretaria")));
		driver.findElement(By.linkText("Secretaria")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'JubileusaEditada')]")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'991234567')]")));
		WebElement row = driver.findElements(By.xpath("//tbody//tr"))
				.stream()
				.filter(e -> e.findElements(By.xpath("td")).get(1).getText().equals("JubileusaEditada"))
				.findFirst().get();
		row.findElements(By.xpath("td")).get(4).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//td[contains(text(),'JubileusaEditada')]")));
	}

}
