package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class The_second_link_Page {
    private WebDriver driver;
//    private By worksheetlink=By.xpath("(//h3[text()='Lesson Menu']/parent::div//a)[7]");
    private By worksheetlink=By.linkText("Lesson Worksheet");
    public The_second_link_Page(WebDriver driver)
    {
        this.driver=driver;
    }
    public WorkSheetPage clickWorkSheetLink()
    {
        driver.findElement(worksheetlink).click();
        return new WorkSheetPage(driver);
    }












}
