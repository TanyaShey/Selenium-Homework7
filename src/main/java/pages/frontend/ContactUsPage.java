package pages.frontend;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.base.BasePage;
import utils.WaitTool;

public class ContactUsPage extends BasePage {

    @FindBy(id = "input-name")
    private WebElement yourNameInputField;

    @FindBy(id = "input-email")
    private WebElement emailInputField;

    @FindBy(id = "input-enquiry")
    private WebElement enquiryInputField;

    @FindBy(xpath = "//*[@id='form-contact']/div/button")
    private WebElement submitButton;


    public ContactUsPage(WebDriver driver) {
        super(driver);
    }

    public void contactUs(String yourName, String email, String enquiry) {
        fillInYourNameField(yourName);
        fillInEmailField(email);
        fillInEnquiryField(enquiry);
        WaitTool.waitForElementPresent(driver, By.xpath("//*[@id='form-contact']/div/button"), 10);
        //Scroll element into view
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", driver.findElement(By.xpath("//*[@id='form-contact']/div/button")));
        clickSubmitButton();
    }

    public void fillInYourNameField(String yourName) {
        yourNameInputField.sendKeys(yourName);
    }

    public void fillInEmailField(String email) {
        emailInputField.sendKeys(email);
    }

    public void fillInEnquiryField(String enquiry) {
        enquiryInputField.sendKeys(enquiry);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }








}
