package datePickerPageTest;
import baseTest.baseTest;
import org.testng.annotations.Test;
import pages.datePickerPage;

import java.util.concurrent.TimeUnit;

public class datePickerPageTest extends baseTest{
    @Test
            public void clickDatepickerPage(){
        datePickerPage datePickerPage=  mainPage.clickDatePickerPage();
      driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        datePickerPage.chooseYear();
      driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        datePickerPage.chooseMonth();
      driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        datePickerPage.chooseDate();
    }

}
