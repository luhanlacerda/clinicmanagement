package testessistemas;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

@FixMethodOrder(MethodSorters.JVM)
public class LoginTest {

	private static final String URL = "http://localhost:8080/ClinicManagementFront/index.xhtml";
	public static String driverPath = "lib-testes/";
	public static WebDriver driver;
	public static WebDriverWait wait;

	@Before
	public void iniciarDriver() {
		System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver");
		driver = new ChromeDriver();
		driver.navigate().to(URL);
		wait = new WebDriverWait(driver, 10);
	}

	@After
	public void fecharDriver() {
		driver.close();
	}

	@Ignore
	public void testarLogarUsuarioInvalido() {
		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("");
		// username.submit();

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();

		boolean existeMensagem = driver.getPageSource().contains("Username obrigatorio.");

		Assert.assertTrue(existeMensagem);
	}

	@Ignore
	public void testarLogarPasswordInvalido() {
		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("");
		// password.submit();

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();

		boolean existeMensagem = driver.getPageSource().contains("Password obrigatorio.");

		Assert.assertTrue(existeMensagem);
	}

	@Ignore
	public void testarLogarInvalido() {
		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("");
		// password.submit();

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();

		boolean existeMensagemErroUsername = driver.getPageSource().contains("Username obrigatorio.");
		boolean existeMensagemErroPassword = driver.getPageSource().contains("Password obrigatorio.");

		Assert.assertTrue(existeMensagemErroUsername);
		Assert.assertTrue(existeMensagemErroPassword);
	}

	@Ignore
	public void testarLogar() {
		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");
		// password.submit();

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();

		boolean existeMensagemErroUsername = driver.getPageSource().contains("Username obrigatorio.");
		boolean existeMensagemErroPassword = driver.getPageSource().contains("Password obrigatorio.");

		Assert.assertFalse(existeMensagemErroUsername);
		Assert.assertFalse(existeMensagemErroPassword);
	}

	@Ignore
	public void testarInserirLogin() {
		driver.navigate().to(URL);

		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));

		driver.findElement(By.linkText("Login")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Novo Login")));

		driver.findElement(By.linkText("Novo Login")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("selenium");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("selenium");

		driver.findElement(By.xpath("//input[@value='Cadastrar']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'selenium')]")));

	}

	@Ignore
	public void testarAlterarLogin() {
		driver.navigate().to(URL);

		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));

		driver.findElement(By.linkText("Login")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		driver.findElement(By.name("j_idt32:j_idt36:2:j_idt45")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));

		driver.findElement(By.xpath("//input[@placeholder='Username']")).clear();

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("selenium alteracao");

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));

		driver.findElement(By.xpath("//input[@placeholder='Password']")).clear();

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("selenium");

		driver.findElement(By.xpath("//input[@value='Cadastrar']")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'selenium alteracao')]")));
	}
	
	@Test
	public void testarRemoverLogin() {
		driver.navigate().to(URL);

		WebElement username = driver.findElement(By.id("formulariologin:username"));
		username.sendKeys("Teste");

		WebElement password = driver.findElement(By.id("formulariologin:password"));
		password.sendKeys("qwerty");

		WebElement btnLogar = driver.findElement(By.id("formulariologin:btnlogar"));
		btnLogar.click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Login")));

		driver.findElement(By.linkText("Login")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//div[@class='preloader']")));

		driver.findElement(By.name("j_idt32:j_idt36:1:j_idt48")).click();
	}

}
