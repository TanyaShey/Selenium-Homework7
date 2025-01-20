package frontend;

import base.BaseTest;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.WaitTool;

public class ContactUsPageTest extends BaseTest {

    @Test
    public void testContactUsSuccessfully() {
        driver.get("https://auto.pragmatic.bg/index.php?route=information/contact&language=en-gb");
        WaitTool.waitForElement(driver, By.id("input-name"), 10);

        //These two lines below ARE VALID and are NOT DEPRECATED
        String randomPrefix = RandomStringUtils.secure().nextAlphabetic(7);
        String randomDomain = RandomStringUtils.secure().nextAlphabetic(5);
        //Concatenate strings to assemble valid email address
        String randomEmail = randomPrefix + "tanya@" + randomDomain + ".com";

        webApp.contactUsPage().contactUs("Tanya", randomEmail, "This is a test of the contact us form.");


        //Verification of the registration
        WaitTool.waitForElementRefresh(driver, By.xpath("//*[@id='content']/p"), 10);
        driver.get("https://auto.pragmatic.bg/index.php?route=information/contact.success&language=en-gb");
        webApp.contactedSuccessfullyPage().verifyContactedSuccessfully("Your enquiry has been successfully sent to the store owner!");

    }





}
