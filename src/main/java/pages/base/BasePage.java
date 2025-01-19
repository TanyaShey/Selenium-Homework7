package pages.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getWebElementAttribute(WebElement element, String nameOfTheAttribute) {
        return element.getDomProperty(nameOfTheAttribute);
    }

    public String getWebElementAttributeByLocator(By locator, String nameOfTheAttribute) {
        return driver.findElement(locator).getDomProperty(nameOfTheAttribute);
    }

    public void typeText(WebElement element, String textToTypeInTheElement) {
        element.sendKeys(textToTypeInTheElement);
    }

    public void typeTextByLocator(By locator, String textToTypeInTheElement) {
        driver.findElement(locator).sendKeys(textToTypeInTheElement);
    }


}
