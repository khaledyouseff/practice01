package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class datePickerPage {
    WebDriver driver;
    public datePickerPage(WebDriver driver){
        this.driver=driver;
    }
public void chooseDate(){

        driver.findElement(By.id("datepicker")).click();

}
public void chooseYear(){
        driver.findElement(By.id("datepicker")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/thead/tr[2]/th[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/thead/tr[2]/th[2]")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div[3]/table/tbody/tr/td/span[2]")).click();


}
public void chooseMonth(){
    driver.findElement(By.xpath("/html/body/div[2]/div[2]/table/tbody/tr/td/span[8]")).click();
}
public void chooseDay(){
    driver.findElement(By.xpath("/html/body/div[2]/div[1]/table/tbody/tr[3]/td[7]")).click();
}
}
