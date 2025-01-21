package pages.frontend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class RegisterAccountPage extends BasePage {

    @FindBy(id = "input-firstname")
    private WebElement firstNameInputField;

    @FindBy(id = "input-lastname")
    private WebElement lastNameInputField;

    @FindBy(id = "input-email")
    private WebElement emailInputField;

    @FindBy(id = "input-password")
    private WebElement passwordInputField;

    @FindBy(xpath = "//*[@id='form-register']/div/div/input")
    private WebElement privacyPolicyCheckbox;

    @FindBy(xpath = "//*[@id='form-register']/div/button")
    private WebElement continueButton;

    private static final String URL = "https://auto.pragmatic.bg/index.php?route=account/register&language=en-gb";

    public RegisterAccountPage(WebDriver driver) {
        super(driver);
    }

    public void goToRegisterAccountPage() {
        driver.get(URL);
    }

    public void registerAccount(String firstName, String lastName, String email, String password) {
      typeTextInFirstNameInputField(firstName);
      typeTextInLastNameInputField(lastName);
      typeTextInEmailInputField(email);
      typeTextInPasswordInputField(password);
      clickPrivacyPolicyCheckbox();
      clickContinueButton();
    }

    public void typeTextInFirstNameInputField(String firstName) {
        typeText(firstNameInputField, firstName);
    }

    public void typeTextInLastNameInputField(String lastName) {
        typeText(lastNameInputField, lastName);
    }

    public void typeTextInEmailInputField(String email) {
        typeText(emailInputField, email);
    }

    public void typeTextInPasswordInputField(String password) {
        typeText(passwordInputField, password);
    }

    public void clickPrivacyPolicyCheckbox() {
        privacyPolicyCheckbox.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
