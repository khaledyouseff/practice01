package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import pages.autoCompletePage;
import pages.mainPage;

public class baseTest {
     protected WebDriver driver;
     protected mainPage mainPage;
     protected autoCompletePage autoCompletePage;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/");
        mainPage=new mainPage(driver);
        autoCompletePage = new autoCompletePage(driver);

    }
    /*
    @AfterTest
    public void quit(){
        driver.quit();
    }

     */
}
