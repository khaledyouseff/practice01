package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindowPage {
    private final WebDriver driver;
    public SwitchWindowPage(WebDriver driver){
        this.driver=driver;
    }

public void clickOpenNewTabButton(){

        driver.findElement(By.xpath("/html/body/div/form/div[1]/div/button")).click();
        //return new mainPage(driver);
}

}
