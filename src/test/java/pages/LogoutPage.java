package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LogoutPage {
    WebDriver driver = null;

    /*
        In future we need to change the way we locate the elements from xpath to id (in communication with developer)
        so that our test cases will be more resistant to changes of html
     */

    @FindBy(xpath = "//div[@id='content']/h1")
    WebElement mainHeading;

    public LogoutPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
    }

    public String getMainHeadingText() {
        return mainHeading.getText();
    }

}
