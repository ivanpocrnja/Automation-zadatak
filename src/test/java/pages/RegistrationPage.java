package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class RegistrationPage {
    WebDriver driver = null;

    /*
        In future we need to change the way we locate the elements from xpath to id (in communication with developer)
        so that our test cases will be more resistant to changes of html
     */

    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement mainHeading;

    @FindBy(id = "input-firstname")
    WebElement firstName;

    @FindBy(id = "input-lastname")
    WebElement lastName;

    @FindBy(id = "input-email")
    WebElement email;

    @FindBy(id = "input-telephone")
    WebElement telephone;

    @FindBy(id = "input-password")
    WebElement password;

    @FindBy(id = "input-confirm")
    WebElement confirmPassword;

    @FindBy(name = "agree")
    WebElement agreeCheckbox;

    @FindBy(xpath = "//input[@value='Continue']")
    WebElement continueButton;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public String getMainHeadingText() {
        return mainHeading.getText();
    }

    public void setFirstName(String firstNameText) {
        firstName.sendKeys(firstNameText);
    }

    public void setLastName(String lastNameText) {
        lastName.sendKeys(lastNameText);
    }

    public void setEmail(String lastNameText) {
        email.sendKeys(lastNameText);
    }

    public void setTelephone(String telephoneText) {
        telephone.sendKeys(telephoneText);
    }

    public void setPassword(String passwordText) {
        password.sendKeys(passwordText);
    }

    public void setConfirmPassword(String confirmPasswordText) {
        confirmPassword.sendKeys(confirmPasswordText);
    }

    public void checkAgreeCheckbox() {
        agreeCheckbox.click();
    }

    public void clickContinueButton() {
        continueButton.click();
    }
}
