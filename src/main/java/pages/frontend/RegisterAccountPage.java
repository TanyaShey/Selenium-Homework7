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

    public RegisterAccountPage(WebDriver driver) {
        super(driver);
    }

    public void registerAccount(String firstName, String lastName, String email, String password) {
      fillInFirstNameInputField(firstName);
      fillInLastNameInputField(lastName);
      fillInEmailInputField(email);
      fillInPasswordInputField(password);
      clickPrivacyPolicyCheckbox();
      clickContinueButton();
    }

    public void fillInFirstNameInputField(String firstName) {
        firstNameInputField.sendKeys(firstName);
    }

    public void fillInLastNameInputField(String lastName) {
        lastNameInputField.sendKeys(lastName);
    }

    public void fillInEmailInputField(String email) {
        emailInputField.sendKeys(email);
    }

    public void fillInPasswordInputField(String password) {
        passwordInputField.sendKeys(password);
    }

    public void clickPrivacyPolicyCheckbox() {
        privacyPolicyCheckbox.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
