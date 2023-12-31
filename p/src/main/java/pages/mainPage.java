package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class mainPage {
    private final WebDriver driver;

    public mainPage(WebDriver driver){
        this.driver=driver;
    }
public autoCompletePage ClickAutoCompletePage(){
    driver.findElement(By.xpath("/html/body/div/div/li[1]/a")).click();
    return new autoCompletePage(driver);
}
public datePickerPage clickDatePickerPage(){
        driver.findElement(By.linkText("Datepicker")).click();
        return new datePickerPage(driver);
}
public dragAndDropPage clickDragAndDropPage(){
        driver.findElement(By.linkText("Drag and Drop")).click();
        return new dragAndDropPage(driver);
}
    public uploadFilePage clickUploadFilePage(){
        driver.findElement(By.linkText("File Upload")).click();
        return new uploadFilePage(driver);
    }
    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,1000)");
    }

    public SwitchWindowAndAlertPage clickSwitchWindowPage(){
        driver.findElement(By.linkText("Switch Window")).click();
        return new SwitchWindowAndAlertPage(driver);

    }
    public completeFormPage clickCompleteForm(){
        driver.findElement(By.linkText("Complete Web Form")).click();
        return new completeFormPage(driver);

    }
}
