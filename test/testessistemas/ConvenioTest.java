package testessistemas;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@FixMethodOrder(MethodSorters.JVM)
public class ConvenioTest {

	private static final String URL = "http://localhost:8080/ClinicManagementFront/index.xhtml";
	public static String driverPath = "lib-testes/";
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

	@Test
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

	@Test
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
