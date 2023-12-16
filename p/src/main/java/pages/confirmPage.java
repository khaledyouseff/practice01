package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class confirmPage {
    WebDriver driver;
    public confirmPage(WebDriver driver){
        this.driver=driver;
    }
    public String text(){
        return driver.findElement(By.xpath("/html/body/div/div")).getText();
    }
}
