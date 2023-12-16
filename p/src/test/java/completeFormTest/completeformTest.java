package completeFormTest;
import baseTest.baseTest;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.completeFormPage;
import pages.confirmPage;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class completeformTest extends baseTest{
    @Test
    public void completeFormTest(){
        completeFormPage completeform = mainPage.clickCompleteForm();
        confirmPage  confirmPage = new confirmPage(driver);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        completeform.firstName("Khaled");
        completeform.lastName("yousef");
        completeform.education();
        completeform.sex();
        mainPage.scrollDown();
        String option = "0-1" ;
        completeform.selectDropDownElement(option);
        var e = completeform.getSelectedElement();
        assertTrue(e.contains(option),"incorrect option");
        completeform.pickDate();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       // assertTrue(e.contains("03/09/2023") ,"error");
        completeform.clickSubmit();
        assertEquals(confirmPage.text(),"The form was successfully submitted!");





    }
}
