package pages.base;

import org.openqa.selenium.WebDriver;
import pages.admin.DashboardPage;
import pages.admin.LoginPage;
import pages.frontend.*;

public class WebApp {

    private WebDriver driver;
    private LoginPage loginPage;
    private DashboardPage dashboardPage;
    private CustomerLoginPage customerLoginPage;
    private RegisterAccountPage registerAccountPage;
    private RegistrationConfirmationPage registrationConfirmationPage;
    private ContactUsPage contactUsPage;
    private ContactedSuccessfullyPage contactedSuccessfullyPage;

    public WebApp(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage(driver);
        }
        return loginPage;
    }

    public DashboardPage dashboardPage() {
        if (dashboardPage == null) {
            dashboardPage = new DashboardPage(driver);
        }
        return  dashboardPage;
    }

    public CustomerLoginPage customerLoginPage() {
        if (customerLoginPage == null) {
            customerLoginPage = new CustomerLoginPage(driver);
        }
        return  customerLoginPage;
    }

    public RegisterAccountPage registerAccountPage() {
        if (registerAccountPage == null) {
            registerAccountPage = new RegisterAccountPage(driver);
        }
        return  registerAccountPage;
    }

    public RegistrationConfirmationPage registrationConfirmationPage() {
        if (registrationConfirmationPage == null) {
            registrationConfirmationPage = new RegistrationConfirmationPage(driver);
        }
        return  registrationConfirmationPage;
    }

    public ContactUsPage contactUsPage() {
        if (contactUsPage == null) {
            contactUsPage = new ContactUsPage(driver);
        }
        return  contactUsPage;
    }

    public ContactedSuccessfullyPage contactedSuccessfullyPage() {
        if (contactedSuccessfullyPage == null) {
            contactedSuccessfullyPage = new ContactedSuccessfullyPage(driver);
        }
        return  contactedSuccessfullyPage;
    }

}
