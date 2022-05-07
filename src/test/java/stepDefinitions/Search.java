package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AccountPage;
import pages.HomePage;
import pages.LoginPage;
import pages.RegistrationPage;

public class Search {

    private HomePage homePage;

    public Search(Setup setup) {
        this.homePage = new HomePage(setup.driver);
    }

    @When("^user inputs product as (.+) into search field$")
    public void user_inputs_product_as_into_search_field(String product) {
        homePage.setSearchFieldText(product);
    }

    @And("^user click on search button$")
    public void user_click_on_search_button() {
        homePage.clickOnSearchButton();
    }

    @Then("^products that match the search term are listed bellow$")
    public void products_that_match_the_search_term_are_listed_bellow() {
        //If the size of product thumbnails is equal or greather than 1
        // we can for sure say that we have some products for the search term 'Mac'
        Assert.assertTrue(homePage.getNumberOfProductThumbnails() >= 1);
    }
}
