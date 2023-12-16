package switchPageAndAlertTest;
import baseTest.baseTest;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.SwitchWindowAndAlertPage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class switchPageAndAlertTest extends baseTest{
    @BeforeTest //null pointer exception solved by this
    public void setUpTest() {
        switchWindowPage = new SwitchWindowAndAlertPage(driver);
    }


    @Test
    public void switchWindowPageTest() throws InterruptedException {

         mainPage.scrollDown();
         String mainWindowHandle = driver.getWindowHandle();
         Thread.sleep(4000);
        //driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
         mainPage.clickSwitchWindowPage();
        Thread.sleep(4000);
        //driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
         switchWindowPage.clickOpenNewTabButton();

         Thread.sleep(4000);
       // driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
         Set<String> allWindowHandles = driver.getWindowHandles();
         System.out.println("the number of tabs after clicking open new tab icon = " + allWindowHandles.size());
         for (String handle : allWindowHandles) {
             if (!handle.equals(mainWindowHandle)) {
                 driver.close();
                 driver.switchTo().window(handle);
             }
         }


        mainPage.scrollDown();
        mainPage.clickSwitchWindowPage();
        System.out.println("the number of tabs after clicking open new tab icon = " + allWindowHandles.size());
     }
     @Test
    public void alertTest(){
        mainPage.scrollDown();
        mainPage.clickSwitchWindowPage();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        switchWindowPage.clickOpenAlertButton();
         Alert alert = driver.switchTo().alert();
         String alertText = alert.getText();
         Assert.assertEquals("This is a test alert!", alertText);
         alert.accept();
     }

}