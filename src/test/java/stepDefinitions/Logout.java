package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AccountPage;
import pages.HomePage;
import pages.LogoutPage;
import pages.RegistrationPage;

public class Logout {
    private HomePage homePage;
    private LogoutPage logoutPage;
    private static final String EXPECTED_LOGOUT_PAGE_HEADING  = "Account Logout";

    public Logout(Setup setup) {
        this.homePage = new HomePage(setup.driver);
        this.logoutPage = new LogoutPage(setup.driver);
    }

    @And("^user clicks on the Logout link in the dropdown menu$")
    public void user_clicks_on_the_logout_link_in_the_dropdown_menu() {
        homePage.clickLogoutLink();
    }

    @Then("^user will be redirected to the log out page$")
    public void user_will_be_redirected_to_the_log_out_page() {
        Assert.assertEquals(EXPECTED_LOGOUT_PAGE_HEADING, logoutPage.getMainHeadingText());
    }

}
