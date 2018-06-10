package testessistemas;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EspecialidadeTest {

	private static final String URL = "http://localhost:8080/ClinicManagementFront/index.xhtml";
	private static String driverPath = "/Users/luhanlacerda/Documents/Developer/Git/clinicmanagement/lib-testes/";
	// "/Users/vitoroliveira/Downloads/clinicmanagement/lib-testes/";
	private static WebDriver driver;
	private static WebDriverWait wait;
	private static Actions actions;

	@Before
	public void iniciarDriver() {
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 20);
		actions = new Actions(driver);
	}

	@After
	public void fecharDriver() {
		driver.close();
	}

	@Ignore
	public void testarInserirEspecialidade() {
		driver.navigate().to(URL);

		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Especialidade")));

		driver.findElement(By.linkText("Especialidade")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Nova Especialidade")));

		driver.findElement(By.linkText("Nova Especialidade")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Descrição']")));

		driver.findElement(By.xpath("//input[@placeholder='Descrição']")).sendKeys("Chupetinha");
		driver.findElement(By.xpath("//input[@value='Cadastrar']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Chupetinha')]")));
	}

	@Test
	public void testarAtualizarEspecialidade() {
		driver.navigate().to(URL);

		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Especialidade")));

		driver.findElement(By.linkText("Especialidade")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		driver.findElement(By.name("j_idt32:j_idt36:0:j_idt45")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Descrição']")));

		driver.findElement(By.xpath("//input[@placeholder='Descrição']")).clear();

		driver.findElement(By.xpath("//input[@placeholder='Descrição']")).sendKeys("Teste Alterando Selenium");

		driver.findElement(By.xpath("//input[@value='Cadastrar']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Teste Alterando Selenium')]")));
	}

}
