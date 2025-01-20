package admin;

import base.BaseTest;

import org.testng.annotations.Test;


public class LoginPageTest extends BaseTest {

    @Test
    public void testLoginSuccessfully() {
        driver.get("https://auto.pragmatic.bg/manage/");
        webApp.loginPage().login("admin", "parola123!");
        webApp.dashboardPage().verifyUsernameText("   John Doe");

    }

    @Test
    public void testLoginSuccessfully1() {
        driver.get("https://auto.pragmatic.bg/manage/");
        webApp.loginPage().fillInUsernameInputField("admin");
        webApp.loginPage().fillInPasswordInputField("parola123!");
        webApp.loginPage().clickLoginButton();
        webApp.dashboardPage().verifyUsernameText("   John Doe");

    }





}
