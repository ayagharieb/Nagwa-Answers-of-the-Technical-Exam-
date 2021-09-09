package secondlink;

import BaseTests.BaseTests;
import org.testng.annotations.Test;
import pages.The_second_link_Page;
import pages.WorkSheetPage;

public class secondlinktests extends BaseTests {

    @Test
    public void testseconedlink()
    {
     var page= homepage.chooseLanguage();
     page.clicksearch();
     page.writeinsearchinput("addition");

     The_second_link_Page chooseLink= page.choose2ndlink();
     chooseLink.clickWorkSheetLink();
     WorkSheetPage num=chooseLink.clickWorkSheetLink();
     num.countNumberofquestions();
    }



}
