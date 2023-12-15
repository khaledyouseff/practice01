package switchPageTest;
import baseTest.baseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SwitchWindowPage;

import java.util.Set;

public class switchPageTest extends baseTest{
    @BeforeTest //null pointer exception solved by this
    public void setUpTest() {
        switchWindowPage = new SwitchWindowPage(driver);
    }


    @Test
    public void switchWindowPageTest() throws InterruptedException {

         mainPage.scrollDown();
         String mainWindowHandle = driver.getWindowHandle();
         Thread.sleep(4000);
         mainPage.clickSwitchWindowPage();
        Thread.sleep(4000);
         switchWindowPage.clickOpenNewTabButton();

         Thread.sleep(4000);
         Set<String> allWindowHandles = driver.getWindowHandles();
         for (String handle : allWindowHandles) {
             if (!handle.equals(mainWindowHandle)) {
                 driver.close();
                 driver.switchTo().window(handle);

             }
         }


        mainPage.scrollDown();
        mainPage.clickSwitchWindowPage();
     }
}