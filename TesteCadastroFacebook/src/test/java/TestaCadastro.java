
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class TestaCadastro {

    // Variáveis globais
    WebDriver driver;
    WebDriverWait wait;

    // Variáveis de usuario
    String nome = "joão paulo";
    String sobrenome = "menezes";
    String email = "jpaulo.mnz@gmail.com";
    String confirmaEmail = "jpaulo.mnz@gmail.com";
    String senha = "12345abcd";

    String tipoSexo = "M";

    @Before
    public void setup(){

        // Configura selenium
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Configura tempo especifico
        wait	=	new	WebDriverWait(driver,	15);

    }

    @Test
    public void iniciaMetodoGeral(){

        driver.get("https://www.facebook.com/r.php?locale=pt_BR");

        // Preenche campos de cadastro
        driver.findElement(By.name("firstname")).sendKeys(nome);
        driver.findElement(By.name("lastname")).sendKeys(sobrenome);
        driver.findElement(By.name("reg_email__")).sendKeys(email);
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys(confirmaEmail);
        driver.findElement(By.name("reg_passwd__")).sendKeys(senha);

        // Preenche os select de data
        WebElement	comboDia	=	driver.findElement(By.id("day"));
        Select	select	=	new	Select(comboDia);
        select.selectByVisibleText("24");

        WebElement	comboMes	=	driver.findElement(By.id("month"));
        select	=	new	Select(comboMes);
        select.selectByVisibleText("Jun");

        WebElement	comboAno	=	driver.findElement(By.id("year"));
        select	=	new	Select(comboAno);
        select.selectByVisibleText("1999");

        if (tipoSexo.equals("F")){
            driver.findElement(By.xpath("//input[@value='1']")).click();
        } if (tipoSexo.equals("M")){
            driver.findElement(By.xpath("//input[@value='2']")).click();
        }

        // Clica no btn entrar
        driver.findElement(By.name("websubmit")).click();

        /*
        // Espera elemento aparecer, quando aparece valida texto
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("uiHeaderTitle")));

        String msgDeValidacao = driver.findElement(By.className("uiHeaderTitle")).getText();

        Assert.assertEquals("Insira o código de segurança", msgDeValidacao);
         */

    }
}