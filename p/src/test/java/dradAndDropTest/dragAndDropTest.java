package dradAndDropTest;
import baseTest.baseTest;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.datePickerPage;
import pages.dragAndDropPage;

import java.util.concurrent.TimeUnit;


public class dragAndDropTest extends baseTest{
    @Test
    public void dragAndDrop() throws InterruptedException {
        dragAndDropPage dragAndDrop = mainPage.clickDragAndDropPage();

       Thread.sleep(2000);
        driver.get(driver.getCurrentUrl());
        Thread.sleep(5000);
        dragAndDrop.dragAndDrop();
        Thread.sleep(2000);
        Assert.assertEquals("Dropped!", driver.findElement(By.id("box")).getText());

    }
}
