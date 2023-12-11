package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropPage {
    WebDriver driver;
    public dragAndDropPage(WebDriver driver){
        this.driver=driver;
    }

    public void dragAndDrop(){
        WebElement drag = driver.findElement(By.id("image"));
        WebElement drop = driver.findElement(By.id("box"));
        Actions a = new Actions(driver);
        a.dragAndDrop(drag,drop).perform();

    }
}
