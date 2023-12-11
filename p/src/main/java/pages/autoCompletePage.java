package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class autoCompletePage {
    WebDriver driver;
    public autoCompletePage(WebDriver driver){
        this.driver=driver;
    }
    public void setAdress(String adderss){
driver.findElement(By.id("autocomplete")).sendKeys(adderss);
    }
    public void setStreet(String street){
driver.findElement(By.id("street_number")).sendKeys(street);
    }
    public void city(String city){
driver.findElement(By.id("locality")).sendKeys(city);

    }
    public void setState(String state){
driver.findElement(By.id("administrative_area_level_1")).sendKeys(state);
    }
    public void setZipCode(String code){
driver.findElement(By.id("postal_code")).sendKeys(code);
    }
    public void setCountry(String country){
driver.findElement(By.id("country")).sendKeys(country);
    }
}
