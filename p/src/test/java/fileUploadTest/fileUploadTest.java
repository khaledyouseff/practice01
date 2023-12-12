package fileUploadTest;
import baseTest.baseTest;
import org.testng.annotations.Test;
import pages.uploadFilePage;

import java.util.concurrent.TimeUnit;

public class fileUploadTest extends baseTest{
    @Test
    public void uploadFile(){

        uploadFilePage uploadFilePage = new uploadFilePage(driver);
        uploadFilePage=mainPage.clickUploadFilePage();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        uploadFilePage.fileUploader();

    }
}
