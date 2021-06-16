package steps;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class ProcuraVagaAccentureSteps {
	
	WebDriver driver;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jennefer\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Dado("que eu estou no site da accenture")
	public void que_eu_estou_no_site_da_accenture() {

		driver.get("https://www.accenture.com/br-pt");

	}

	@Quando("acessa a área de carreiras")
	public void acessa_a_área_de_carreiras() {

		driver.findElement(By.cssSelector("#navigation-menu > div:nth-child(4) > "
										+ "div.gh-item.nav-submenu-label > span")).click();

	}

	@E("clica em procure por vagas")
	public void clica_em_procure_por_vagas() {

		driver.findElement(By.linkText("Procure Por Vagas")).click();

	}

	@E("digite no campo de busca desenvolvedor")
	public void digite_no_campo_de_busca_desenvolvedor() {

		driver.findElement(By.id("job-search-hero-bar")).click();
		driver.findElement(By.id("job-search-hero-bar")).sendKeys("desenvolvedor");

	}

	@E("clico no botão procurar")
	public void clico_no_botão_procurar() {

		driver.findElement(By.cssSelector("#redesign-main > div.ui-container.hero-module > div > form >"
										+ " div > div > div > div.search-bar-container >"
										+ "div.button-container.col-xs-2 > button")).click();

	}

	@Então("devo encontrar vagas para programadores")
	public void devo_encontrar_vagas_para_programadores() {
		
		String resultadoEsperado = "Search Jobs | Accenture";
	    assertEquals(resultadoEsperado, driver.getTitle());
		
	}


	@After
	public void fecha() {
		
		driver.quit();
	}
}
