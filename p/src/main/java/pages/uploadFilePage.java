package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class uploadFilePage {
    WebDriver driver;
    public uploadFilePage(WebDriver driver){
        this.driver=driver;
    }
    public void fileUploader(){

        WebElement file = driver.findElement(By.xpath("/html/body/div/form/div/input"));
        String filePath = "E:\\valeo prepration\\cv\\apdated\\updated01\\khaled yousef CV.pdf";
        file.sendKeys(filePath);

    }
}
