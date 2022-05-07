package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

import java.util.UUID;

public class Login {
    private HomePage homePage;
    private LoginPage loginPage;
    private RegistrationPage registrationPage;
    private AccountPage accountPage;
    private static final String EXPECTED_LOGIN_BREADCRUMB_TEXT  = "Login";
    private static final String EXPECTED_MY_ACCOUNT_HEADING  = "My Account";

    public Login(Setup setup) {
        this.homePage = new HomePage(setup.driver);
        this.loginPage = new LoginPage(setup.driver);
        this.registrationPage = new RegistrationPage(setup.driver);
        this.accountPage = new AccountPage(setup.driver);
    }
    @And("^user clicks on the Login link in the dropdown menu$")
    public void user_clicks_on_the_login_link_in_the_dropdown_menu() {
        homePage.clickLoginLink();
    }

    @Then("^the Login page opens$")
    public void the_login_page_opens() {
        Assert.assertEquals(EXPECTED_LOGIN_BREADCRUMB_TEXT, loginPage.getLoginBreadcrumbText());
    }

    @And("^user fill out existing E-Mail as (.+)$")
    public void user_fill_out_existing_email_as(String email){
        registrationPage.setEmail(email);
    }

    @And("^user click on Login button$")
    public void user_click_on_login_button() {
        loginPage.clickLoginButton();
    }

    @Then("^user will be redirected to his account page$")
    public void user_will_be_redirected_to_his_account_page() {
        Assert.assertEquals(EXPECTED_MY_ACCOUNT_HEADING, accountPage.getMyAccountHeadingText());
    }
}
