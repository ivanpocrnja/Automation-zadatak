package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AccountPage;
import pages.HomePage;
import pages.RegistrationPage;

import java.util.UUID;

public class Registration {
    private HomePage homePage;
    private RegistrationPage registrationPage;
    private AccountPage accountPage;
    private static final String EXPECTED_REGISTRATION_PAGE_HEADING  = "Register Account";
    private static final String EXPECTED_ACCOUNT_PAGE_HEADING  = "Your Account Has Been Created!";

    public Registration(Setup setup) {
        this.homePage = new HomePage(setup.driver);
        this.registrationPage = new RegistrationPage(setup.driver);
        this.accountPage = new AccountPage(setup.driver);
    }

    @Given("^user is on homepage$")
    public void user_is_on_homepage() {
        //is delegated to Setup.class
    }

    @When("^user clicks in the top navigation on My Account link to open the dropdown menu$")
    public void user_clicks_in_the_top_navigation_on_my_account_link_to_open_the_dropdown_menu() {
        homePage.clickMyAccountLink();
    }

    @And("^user clicks on the Register link in the dropdown menu$")
    public void user_clicks_on_the_register_link_in_the_dropdown_menu() {
        homePage.clickRegisterLink();
    }

    @Then("^the Registration page opens$")
    public void the_registration_page_opens() {
        Assert.assertEquals(EXPECTED_REGISTRATION_PAGE_HEADING, registrationPage.getMainHeadingText());
    }

    @When("^user fill out First Name as (.+)$")
    public void user_fill_out_first_name_as(String firstname) {
        registrationPage.setFirstName(firstname);
    }

    @And("^user fill out Last Name as (.+)$")
    public void user_fill_out_last_name_as(String lastname) {
        registrationPage.setLastName(lastname);
    }

    @And("^user fill out E-Mail as (.+)$")
    public void user_fill_out_email_as(String email){
        //added random numbers to email because we cant register a user that already exists
        registrationPage.setEmail(email + UUID.randomUUID().toString());
    }

    @And("^user fill out Telephone as (.+)$")
    public void user_fill_out_telephone_as(String telephone) {
        registrationPage.setTelephone(telephone);
    }

    @And("^user fill out Password as (.+)$")
    public void user_fill_out_password_as(String password) {
        registrationPage.setPassword(password);
    }

    @And("^user fill out Confirm Password as (.+)$")
    public void user_fill_out_confirm_password_as(String confirmpassword) {
        registrationPage.setConfirmPassword(confirmpassword);
    }

    @And("^user check the Privacy Policy checkbox$")
    public void user_check_the_privacy_policy_checkbox() {
        registrationPage.checkAgreeCheckbox();
    }

    @And("^user user click on Continue button$")
    public void user_user_click_on_continue_button() {
        registrationPage.clickContinueButton();
    }

    @Then("^user will be redirected to his newly created account page$")
    public void user_will_be_redirected_to_his_newly_created_account_page() {
        Assert.assertEquals(EXPECTED_ACCOUNT_PAGE_HEADING, accountPage.getMainHeadingText());
    }
}
