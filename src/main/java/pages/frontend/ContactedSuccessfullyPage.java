package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pages.base.BasePage;
import utils.WaitTool;

public class ContactedSuccessfullyPage extends BasePage {

    public ContactedSuccessfullyPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='content']/p")
    private WebElement confirmationMessage;


    public String confirmationGetText() {
        return confirmationMessage.getText();
    }

    public void verifyContactedSuccessfully(String expectedConfirmationText) {
        WaitTool.waitForElement(driver, By.xpath("//*[@id='content']/p"), 10);
        Assert.assertEquals(confirmationGetText(), expectedConfirmationText);

    }


}
