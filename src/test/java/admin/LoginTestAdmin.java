package admin;

import base.AdminBaseTest;

import org.testng.annotations.Test;


public class LoginTestAdmin extends AdminBaseTest {

    @Test
    public void testLoginSuccessfully() {
        webApp.loginPage().login("admin", "parola123!");
        webApp.dashboardPage().verifyUsernameText("   John Doe");

    }

    @Test
    public void testLoginSuccessfully1() {
        webApp.loginPage().fillInUsernameInputField("admin");
        webApp.loginPage().fillInPasswordInputField("parola123!");
        webApp.loginPage().clickLoginButton();
        webApp.dashboardPage().verifyUsernameText("   John Doe");

    }





}
