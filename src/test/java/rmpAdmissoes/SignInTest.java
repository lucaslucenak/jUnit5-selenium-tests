package rmpAdmissoes;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SignInTest {
    private static final String URL = "https://onvio.com.br/clientcenter/pt/actions/service-request/employee-registration/add";
    private WebDriver driver;

    @BeforeAll
    public static void beforeAll() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
    }

    @BeforeEach
    public void beforeEach() {
        this.driver = new ChromeDriver();
        this.driver.navigate().to(URL);
    }

    @AfterEach
    public void afterEach() {
        this.driver.quit();
    }

    @Test
    public void TestShouldInsertEmailIntoEmailField() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        String email = "123";

        this.driver.findElement(new By.ByXPath("/html/body/app-root/app-authn/fieldset/div/div/section/form[1]/label[1]/span[2]/input")).sendKeys(email);
    }

    @Test
    public void TestShouldInsertPasswordIntoPasswordField() throws Exception {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        String password = "123";

        this.driver.findElement(By.name("pwd")).sendKeys(password);
    }

    @Test
    public void TestShouldSingInIntoOnvio() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        String email = "123";

        this.driver.findElement(new By.ByXPath("/html/body/app-root/app-authn/fieldset/div/div/section/form[1]/label[1]/span[2]/input")).sendKeys(email);

        String password = "123";
        this.driver.findElement(By.name("pwd")).sendKeys(password);

        this.driver.findElement(By.xpath("/html/body/app-root/app-authn/fieldset/div/div/section/form[1]/div/button")).click();

        Thread.sleep(6000);
        String actualMessage = this.driver.findElement(By.xpath("/html/body/app-root/app-authn/fieldset/div/div/section/form[2]/h3/p")).getText();

        Assertions.assertEquals("Torne sua conta ainda mais segura!", actualMessage);
    }
}
