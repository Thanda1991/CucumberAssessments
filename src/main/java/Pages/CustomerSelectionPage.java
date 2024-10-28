package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CustomerSelectionPage {

    WebDriver driver;

    @FindBy(xpath = "//select[contains(@id,'userSelect')]")
    WebElement selectCustomer_xpath;

    @FindBy(xpath = "//button[contains(.,'Login')]")
    WebElement loginButton_xpath;

    public void selectCustomerName(String customerName) {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(selectCustomer_xpath));
        selectCustomer_xpath.sendKeys(customerName);
    }

    public void clickLoginButton() {
        loginButton_xpath.click();
    }
}
