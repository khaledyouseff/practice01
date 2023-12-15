package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SwitchWindowAndAlertPage {
    private final WebDriver driver;
    public SwitchWindowAndAlertPage(WebDriver driver){
        this.driver=driver;
    }

public void clickOpenNewTabButton(){

        driver.findElement(By.xpath("/html/body/div/form/div[1]/div/button")).click();

}
    public void clickOpenAlertButton(){

        driver.findElement(By.xpath("/html/body/div/form/div[2]/div/button")).click();

    }
}
