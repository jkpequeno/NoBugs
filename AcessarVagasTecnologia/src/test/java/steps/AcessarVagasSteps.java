package steps;

import static org.junit.Assert.assertEquals;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;

public class AcessarVagasSteps {
	
	WebDriver driver;
	
	@Before
	public void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jennefer\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	}
	
	@Dado("que estou no site")
	public void que_estou_no_site() {
		
		driver.get("https://www.accenture.com/br-pt");
	}

	@E("clico em Carreiras")
	public void clico_em_Carreiras() {
		
		WebElement careers = driver.findElement(By.cssSelector("#navigation-menu > div:nth-child(4) > div.gh-item.nav-submenu-label > span"));
		careers.click();
		
	}

	@E("clico no menu Vagas em tecnologia")
	public void clico_no_menu_Vagas_em_tecnologia() {
		
		WebElement vagas = driver.findElement(By.linkText("Vagas em tecnologia"));
		vagas.click();
	    
	}

	@Então("devo ver o destaque Carreiras em tecnologia")
	public void devo_ver_o_destaque_Carreiras_em_tecnologia() {
		
		WebElement title = driver.findElement(By.tagName("h1"));
		assertEquals("Carreiras em tecnologia", title.getText());
		
	}
	
	
	@After
	public void quit() {
		
		driver.quit();
		
	}

}
