package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    private By choose_Lang =By.xpath("(//div//a)[3]");



    public  HomePage(WebDriver driver)
    {
        this.driver=driver;
    }


    public searchResultPage chooseLanguage()
    {
        driver.findElement(choose_Lang).click();
        return  new searchResultPage(driver);
    }


}
