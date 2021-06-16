package steps;

import static org.junit.Assert.assertTrue;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class TesteMenuSobreSteps {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jennefer\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}

	@Dado("que eu estou no site da accenture")
	public void que_eu_estou_no_site_da_accenture() {
		
		driver.get("https://www.accenture.com/br-pt");
		
	}

	@Quando("clico no menu sobre a accenture")
	public void clico_no_menu_sobre_a_accenture() {
		
		driver.findElement(By.cssSelector("#navigation-menu > div:nth-child(5) > div.gh-item.nav-submenu-label > span")).click();
		
	}

	@Quando("clico no item do menu sobre a accenture")
	public void clico_no_item_do_menu_sobre_a_accenture() {
		
		driver.findElement(By.partialLinkText("Sobre a Accenture")).click();
		
	}

	@Então("devo ver o destaque em {string}")
	public void devo_ver_o_destaque_em(String tituloDestaque) {
		
		String destaqueAtual = driver
				.findElement(By.className("sectionTitle")).getText();
		String destaqueEsperado = tituloDestaque;

		assertTrue("não são iguais", destaqueAtual.equals(destaqueEsperado));
		
	}

	@After
	public void posCondicao() {
		
		driver.quit();
		
	}

}
