package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkSheetPage {

    WebDriver driver;
    By number = By.xpath("(//div[@class='instances']/div)");

    public WorkSheetPage(WebDriver driver) {
        this.driver = driver;
    }


    public int countNumberofquestions() {
       int numberofQuestions = driver.findElements(number).size();
        System.out.println("Number Of Questions: " + numberofQuestions);
        return numberofQuestions;
    }
}
