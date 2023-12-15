package baseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import pages.SwitchWindowAndAlertPage;
import pages.autoCompletePage;
import pages.mainPage;

public class baseTest {
     protected WebDriver driver;
     protected mainPage mainPage;
     protected autoCompletePage autoCompletePage;
     protected SwitchWindowAndAlertPage switchWindowPage ;
    @BeforeTest
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://formy-project.herokuapp.com/");
        mainPage=new mainPage(driver);
        autoCompletePage = new autoCompletePage(driver);
        switchWindowPage = new SwitchWindowAndAlertPage(driver);

    }
    /*
    @AfterTest
    public void quit(){
        driver.quit();
    }

     */
}
