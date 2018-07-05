package br.edu.utfpr.exemplomaven;

import br.edu.utfpr.classes.*;
import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 *
 * @author renil
 */
public class Brop {

    private static String CHROMEDRIVER_LOCATION = "driver/chromedriver.exe";

    private static int scId = 0;

    WebDriver driver;

    @BeforeClass
    public static void beforeClass() {
        System.setProperty("webdriver.chrome.driver", CHROMEDRIVER_LOCATION);
    }
    @Before
    public void before() {
        ChromeOptions chromeOptions = new ChromeOptions();

        //chromeOptions.addArguments("headless");
        chromeOptions.addArguments("window-size=1200x600");
        chromeOptions.addArguments("start-maximized");

        driver = new ChromeDriver(chromeOptions);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://br.op.gg/");
   }
    @After
    public void after() {
        driver.close();
    }
    @Test
    public void BuscarUsuario(){
        Homepage hP = new Homepage(driver);
        hP.setUserSearch("DeCarli");
        UserPage userP = hP.getUser();
        userP.atualizarDados();
        assertEquals("Decarli", userP.getUser());
    }
    @Test
    public void BuscarChamp(){
        Homepage hP = new Homepage(driver);
        AnalisePage aP= hP.getAnalise();
        ChampPage cP = aP.getChamp();
        assertEquals("Talon", cP.getNameChamp());
    }
  
}
