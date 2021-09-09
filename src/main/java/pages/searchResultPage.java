package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class searchResultPage {
    private WebDriver driver;

    private By searchIcon=By.xpath("//div/button[@type='button']");
    private By inputsearch= By.id("txt_search_query");
    private By searchIcon2= By.id("btn_global_search");
    private By second_link=By.xpath("(//div[@class='results']//li)[2]//a");

    public searchResultPage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void clicksearch()
    {
        driver.findElement(searchIcon).click();
    }


    public  void  writeinsearchinput (String Text)
    {
         driver.findElement(inputsearch).sendKeys(Text);
         driver.findElement(searchIcon2).click();


    }
    public The_second_link_Page choose2ndlink()
    {
        driver.findElement(second_link).click();

        return new The_second_link_Page(driver);
    }

}
