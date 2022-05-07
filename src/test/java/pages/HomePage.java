package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import java.util.List;

public class HomePage {
    WebDriver driver = null;

    /*
        In future we need to change the way we locate the elements from xpath to id (in communication with developer)
        so that our test cases will be more resistant to changes of html
     */

    @FindBy(xpath = "//i[contains(@class, 'fa-user')]/following-sibling::span[1]")
    WebElement myAccountLink;

    @FindBy(xpath = "//ul[contains(@class, 'dropdown-menu-right')]/li/a[text()='Register']")
    WebElement registerLink;

    @FindBy(xpath = "//ul[contains(@class, 'dropdown-menu-right')]/li/a[text()='Login']")
    WebElement loginLink;

    @FindBy(xpath = "//ul[contains(@class, 'dropdown-menu-right')]/li/a[text()='Logout']")
    WebElement logoutLink;

    @FindBy(name = "search")
    WebElement searchField;

    @FindBy(xpath = "//i[contains(@class, 'fa-search')]/..")
    WebElement searchButton;

    @FindBy(xpath = "//div[contains(@class, 'product-thumb')]")
    List<WebElement> productThumbnailElements;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public void clickMyAccountLink() {
        myAccountLink.click();
    }

    public void clickRegisterLink() {
        registerLink.click();
    }

    public void clickLoginLink() {
        loginLink.click();
    }

    public void clickLogoutLink() {
        logoutLink.click();
    }

    public void setSearchFieldText(String searchTerm) {
        searchField.sendKeys(searchTerm);
    }

    public void clickOnSearchButton() {
        searchButton.click();
    }

    public int getNumberOfProductThumbnails() {
        return productThumbnailElements.size();
    }
}
