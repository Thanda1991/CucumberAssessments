package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.security.auth.Refreshable;
import java.time.Duration;
import java.util.ServiceLoader;

public class TransactionsPage {

    WebDriver driver;

    @FindBy(xpath = "(//td[contains(.,'Credit')])[1]")
    WebElement transactionRecord_xpath;

    @FindBy(xpath = "//button[@class='btn'][contains(.,'Back')]")
    WebElement backButton_xpath;

//    public void verifyTransactionAppears() {
//        //new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(transactionRecord_xpath));
//        //driver.getCurrentUrl();
//        //driver.refresh(driver.getCurrentUrl());
//        transactionRecord_xpath.isDisplayed();
//    }

    public void clickBackButton() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(backButton_xpath));
        backButton_xpath.click();
    }
}
