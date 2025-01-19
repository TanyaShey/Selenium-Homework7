package pages.admin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;

public class LoginPage extends BasePage {

    @FindBy (id = "input-username")
    private WebElement usernameInputField;

    @FindBy (id = "input-password")
    private WebElement passwordInputField;

    @FindBy (className = "btn-primary")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        fillInUsernameInputField(username);
        fillInPasswordInputField(password);
        clickLoginButton();
    }

    public void fillInUsernameInputField(String username) {
        usernameInputField.sendKeys(username);
    }

    public void fillInPasswordInputField(String password) {
        passwordInputField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }


}
