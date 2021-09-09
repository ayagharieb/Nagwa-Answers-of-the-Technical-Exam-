package BaseTests;

import org.testng.annotations.AfterClass;
import pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
public class BaseTests {
    private WebDriver driver;
    protected HomePage homepage;

    @BeforeClass
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
//      driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
        driver.get("https://www.nagwa.com/");
        homepage = new HomePage(driver);
    }
    @AfterClass
    public void TearsDown() {
        driver.quit();
    }
}
