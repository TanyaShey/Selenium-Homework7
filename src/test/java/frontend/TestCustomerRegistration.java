package frontend;

import base.CustomerBaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.WaitTool;

public class TestCustomerRegistration extends CustomerBaseTest {

    @Test
    public void testCustomerRegistrationSuccessfully() {
        webApp.customerLoginPage().clickContinueButton();
        WaitTool.waitForElement(driver, By.id("input-firstname"), 10);

        //These two lines below ARE VALID and are NOT DEPRECATED
        String randomPrefix = RandomStringUtils.secure().nextAlphabetic(7);
        String randomDomain = RandomStringUtils.secure().nextAlphabetic(5);
        //Concatenate strings to assemble valid email address
        String randomEmail = randomPrefix + "tanya@" + randomDomain + ".com";

        webApp.registerAccountPage().registerAccount("Tanya", "Sheytanova", randomEmail, "parola123!");
        WaitTool.waitForElementPresent(driver, By.id("content"), 10);

        //Verification of the registration
        WaitTool.waitForElementRefresh(driver, By.xpath("//*[@id='content']/h1"), 10);
        driver.get("https://auto.pragmatic.bg/index.php?route=account/success&language=en-gb");
        webApp.registrationConfirmationPage().verifySuccessfulRegistrationText("Your Account Has Been Created!");







    }











}
