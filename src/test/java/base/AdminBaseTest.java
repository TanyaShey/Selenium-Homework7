package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.base.WebApp;

public class AdminBaseTest {

   protected WebDriver driver;
   protected WebApp webApp;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        webApp = new WebApp(driver);
        driver.get("https://auto.pragmatic.bg/manage/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
