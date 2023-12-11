package autoCompleteTest;
import baseTest.baseTest;
import org.testng.annotations.Test;
import pages.mainPage;
import pages.autoCompletePage;

import java.util.concurrent.TimeUnit;

public class autoCompletePageTest extends baseTest {
    @Test
    public void clickAutoCompletePage(){
       // mainPage mainPage = new mainPage(driver);
     autoCompletePage autoCompletePage   =mainPage.ClickAutoCompletePage();
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
     autoCompletePage.setAdress("downtown");
     autoCompletePage.setStreet("13 al tahrir square");
     autoCompletePage.city("cairo");
     autoCompletePage.setState("cairo");
     autoCompletePage.setZipCode("321351");
     autoCompletePage.setCountry("egypt");





    }

}
