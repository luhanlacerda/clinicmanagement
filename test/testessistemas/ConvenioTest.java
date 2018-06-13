package testessistemas;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConvenioTest {

	private static final String URL = "http://localhost:8080/ClinicManagementFront/index.xhtml";
	public static String driverPath = "/Users/luhanlacerda/Documents/Developer/Git/clinicmanagement/lib-testes/";
	public static WebDriver driver;
	public static WebDriverWait wait;

	@Before
	public void iniciarDriver() {
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, 10);
	}

	@After
	public void fecharDriver() {
		driver.close();
	}

	@Ignore
	public void testarInserirConvenio() {
		driver.navigate().to(URL);

		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Convenio")));

		driver.findElement(By.linkText("Convenio")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Novo Convenio")));

		driver.findElement(By.linkText("Novo Convenio")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Descrição']")));

		driver.findElement(By.xpath("//input[@placeholder='Descrição']")).sendKeys("Teste Inserir Selenium");

		driver.findElement(By.xpath("//input[@value='Cadastrar']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("//td[contains(text(),'Teste Inserindo Selenium')]")));

	}

	@Ignore
	public void testarAtualizarConvenio() {
		driver.navigate().to(URL);

		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Convenio")));

		driver.findElement(By.linkText("Convenio")).click();

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

	@Test
	public void testeRemoverConvenio() {
		driver.navigate().to(URL);

		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Convenio")));

		driver.findElement(By.linkText("Convenio")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		driver.findElement(By.name("j_idt32:j_idt36:0:j_idt48")).click();
	}

}
