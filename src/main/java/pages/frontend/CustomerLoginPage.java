package pages.frontend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class CustomerLoginPage extends BasePage {

    public CustomerLoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@class='col mb-3']/div/div/a")
    private WebElement continueButton;

    public void clickContinueButton() {
        continueButton.click();
    }

}
