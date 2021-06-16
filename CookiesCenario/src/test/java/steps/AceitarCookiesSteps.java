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

public class AceitarCookiesSteps {

	WebDriver driver;

	@Before
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jennefer\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@Dado("que estou no site da accenture")
	public void que_estou_no_site_da_accenture() {

		driver.get("https://www.accenture.com/br-pt?");

	}

	@E("abro as configurações de cookies")
	public void abro_as_configurações_de_cookies() {

		driver.findElement(By.id("onetrust-pc-btn-handler")).click();

	}

	@E("clico em Confirmar minhas escolhas")
	public void clico_em_confirmar_minhas_escolhas() {

		driver.findElement(By.className("onetrust-close-btn-handler")).click();

	}

	@Então("deve fechar o modal")
	public void deve_fechar_o_modal() {
		
		String texto = driver.findElement(By.id("optanon-minimize-button")).getText();
		assertEquals("Configuração dos cookies", texto);
		
	}

	@Dado("e clico em configurações de cookie")
	public void e_clico_em_configurações_de_cookie() {

		driver.findElement(By.className("cookie-setting-link")).click();

	}

	@E("devo ver o item de sua privacidade")
	public void devo_ver_o_item_de_sua_privacidade() {

		assertEquals("Sua privacidade", driver.findElement(By.id("privacy-text")));

	}

	@E("devo ver Cookies estritamente necessárias")
	public void devo_ver_cookies_estritamente_necessárias() {

		driver.findElement(By.id("ot-header-id-1")).click();
		assertEquals("Cookies estritamente necessárias", driver.findElement(By.id("ot-header-id-1")));

	}

	@E("devo ver Cookies Analíticos de Primeira Parte")
	public void devo_ver_cookies_analíticos_de_primeira_parte() {

		driver.findElement(By.id("ot-header-id-2")).click();
		assertEquals("Cookies Analíticos de Primeira Parte", driver.findElement(By.id("ot-header-id-2")));

	}

	@E("devo ver Cookies de Desempenho e Cookies Funcionais")
	public void devo_ver_cookies_de_desempenho_e_cookies_funcionais() {

		driver.findElement(By.id("ot-header-id-3")).click();
		assertEquals("Cookies de Desempenho e Cookies Funcionais", driver.findElement(By.id("ot-header-id-3")));

	}

	@Então("devo ver Cookies de Publicidade e Redes Sociais")
	public void devo_ver_cookies_de_publicidade_e_redes_sociais() {

		driver.findElement(By.id("ot-header-id-4")).click();
		assertEquals("Cookies de Publicidade e Redes Sociais", driver.findElement(By.id("ot-header-id-4")));

	}

	@After
	public void sair() {
		driver.quit();
	}

}
