package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UserLoginPage {

    WebDriver driver;
    @FindBy(xpath = "//strong[@class='mainHeading'][contains(.,'XYZ Bank')]")
    WebElement bankName_xpath;

    @FindBy(xpath = "//button[contains(.,'Customer Login')]") WebElement loginButton_xpath;

    public UserLoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void verifyTheBanNameIsVisible(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(bankName_xpath));
        bankName_xpath.isDisplayed();
    }

    public void clickLoginButton(){
        loginButton_xpath.click();
    }
}
