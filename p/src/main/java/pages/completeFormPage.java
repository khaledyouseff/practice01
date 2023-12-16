package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class completeFormPage {
    WebDriver driver;
    public completeFormPage(WebDriver driver){
        this.driver=driver;
    }
    public void firstName( String s1){
        driver.findElement(By.id("first-name")).sendKeys(s1);
    }
    public void lastName(String s2){
        driver.findElement(By.id("last-name")).sendKeys(s2);
    }
    public void jopTitle( String s3){
        driver.findElement(By.id("job-title")).sendKeys(s3);
    }
    public void education(){
        driver.findElement(By.id("radio-button-1")).click();
    }
    public void sex(){
        driver.findElement(By.id("checkbox-1")).click();
    }
    //drop down-----------------------------
    public Select findDropDownElement(){
        return new Select(driver.findElement(By.id("select-menu")));
    }
    public void selectDropDownElement(String option){
        findDropDownElement().selectByVisibleText(option);
    }
    public List<String> getSelectedElement(){
        List<WebElement>  selectedElement = findDropDownElement().getAllSelectedOptions();
        return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    //end od drop down ---------------------------
    public void pickDate(){
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[3]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[2]/td[5]")).click();

    }
    public Select findDateText(){
      return new Select( driver.findElement(By.id("datepicker")))  ;
    }
    public List<String> getPickedDateText(){
        List<WebElement>  selectedDate= findDateText().getAllSelectedOptions();
        return  selectedDate.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    public confirmPage clickSubmit(){
        driver.findElement(By.cssSelector("a.btn.btn-lg.btn-primary")).click();
        return new confirmPage(driver);
    }


}
