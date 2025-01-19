package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pages.base.BasePage;
import utils.WaitTool;

import java.time.Duration;

public class RegistrationConfirmationPage extends BasePage {

    public RegistrationConfirmationPage(WebDriver driver) {
        super(driver);
//        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//*[@id='content']/h1")
    private WebElement confirmationMessageHeader;


    public String confirmationGetText() {
        return confirmationMessageHeader.getText();
    }

    public void verifySuccessfulRegistrationText(String expectedConfirmationText) {
        WaitTool.waitForElement(driver, By.xpath("//*[@id='content']/h1"), 10);
        Assert.assertEquals(confirmationGetText(), expectedConfirmationText);

    }


}
