package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AccountInformationPage {

    WebDriver driver;

    @FindBy(xpath = "//span[contains(@class,'fontBig ng-binding')]")
    WebElement welcomeText_xpath;

    @FindBy(xpath = "(//div[contains(@class,'center')])[1]")
    WebElement accountBal_xpath;

    @FindBy(xpath = "//button[contains(.,'Deposit')]")
    WebElement depositButton_xpath;

    @FindBy(xpath = "//input[contains(@type,'number')]")
    WebElement depositAmount_xpath;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Deposit')]")
    WebElement submitDepositButton_xpath;

    @FindBy(xpath = "//span[contains(.,'Deposit Successful')]")
    WebElement successfulDepositMessage_xpath;

    @FindBy(xpath = "//button[contains(.,'Logout')]")
    WebElement logoutButton_xpath;

    @FindBy(xpath = "//select[@id='accountSelect']")
    WebElement customerSecondAccount_xpath;

    @FindBy(xpath = "//select[@id='accountSelect']")
    WebElement customerThirdAccount_xpath;

    @FindBy(xpath = "//button[contains(.,'Transactions')]") WebElement transaction_xpath;

    @FindBy(xpath = "//button[@ng-class='btnClass3'][contains(.,'Withdrawl')]") WebElement withdrawalsButton_xpath;

    @FindBy(xpath = "//input[contains(@type,'number')]") WebElement withdrawalAmount_xpath;

    @FindBy(xpath = "//button[@type='submit'][contains(.,'Withdraw')]") WebElement confirmWithdrawalButton_xpath;

    @FindBy(xpath = "//span[contains(.,'Transaction successful')]") WebElement successfulWithdrawalMessage_xpath;

    public void verifyTheWelcomeMessageIsDisplayed() {
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(welcomeText_xpath));
        welcomeText_xpath.isDisplayed();
    }

    String accBalance1;
    Double accBalance;

    public void getHarryAccountBalanceBeforeDeposit() {
        accBalance1 = accountBal_xpath.getText().replace("Account Number : 1004 , Balance : ", "");
        accBalance = Double.parseDouble(accBalance1.replace(" , Currency : Dollar", ""));
        System.out.println("Harry Account Balance before deposit " + accBalance + " for account number 1004");
    }

    public void clickDepositButton() {
        depositButton_xpath.click();
    }

    public void enterDepositAmount(double depositAmount) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(depositAmount_xpath));
        depositAmount_xpath.sendKeys((String.valueOf(depositAmount)));
    }

    public void clickToSubmitDepositAmount() {
        submitDepositButton_xpath.click();
    }

    public void verifyDepositSuccess() {
        successfulDepositMessage_xpath.isDisplayed();
    }

    public void getHarryAccountBalanceAfterDeposit() {
        accBalance1 = accountBal_xpath.getText().replace("Account Number : 1004 , Balance : ", "");
        accBalance = Double.parseDouble(accBalance1.replace(" , Currency : Dollar", ""));
        System.out.println("Harry Account Balance after deposit " + accBalance + " for account number 1004");
    }

    public void getRonsFirstAccountBalanceBeforeDeposit() {
        accBalance1 = accountBal_xpath.getText().replace("Account Number : 1007 , Balance : ", "");
        accBalance = Double.parseDouble(accBalance1.replace(" , Currency : Dollar", ""));
        System.out.println("Rons Account Balance before deposit " + accBalance + " for account number 1007");
    }

    public void getRonsFirstAccountBalanceAfterDeposit() {
        accBalance1 = accountBal_xpath.getText().replace("Account Number : 1007 , Balance : ", "");
        accBalance = Double.parseDouble(accBalance1.replace(" , Currency : Dollar", ""));
        System.out.println("Rons Account Balance after deposit " + accBalance + " for account number 1007");
    }

    public void selectCustomersSecondAccount(String customerSecondAccountNumber) {
        customerSecondAccount_xpath.sendKeys(customerSecondAccountNumber);
    }

    public void getRonsSecondAccountBalanceBeforeDeposit() {
        accBalance1 = accountBal_xpath.getText().replace("Account Number : 1008 , Balance : ", "");
        accBalance = Double.parseDouble(accBalance1.replace(" , Currency : Pound", ""));
        System.out.println("Rons Account Balance before deposit " + accBalance + " for account number 1008");
    }

    public void getRonsSecondAccountBalanceAfterDeposit() {
        accBalance1 = accountBal_xpath.getText().replace("Account Number : 1008 , Balance : ", "");
        accBalance = Double.parseDouble(accBalance1.replace(" , Currency : Pound", ""));
        System.out.println("Rons Account Balance after deposit " + accBalance + " for account number 1008");
    }

    public void selectCustomersThirdAccount(String customerThirdAccountNumber) {
        customerThirdAccount_xpath.sendKeys(customerThirdAccountNumber);
    }

    public void getRonsThirdAccountBalanceBeforeDeposit() {
        accBalance1 = accountBal_xpath.getText().replace("Account Number : 1009 , Balance : ", "");
        accBalance = Double.parseDouble(accBalance1.replace(" , Currency : Rupee", ""));
        System.out.println("Rons Account Balance before deposit " + accBalance + " for account number 1009");
    }

    public void getRonsThirdAccountBalanceAfterDeposit() {
        accBalance1 = accountBal_xpath.getText().replace("Account Number : 1009 , Balance : ", "");
        accBalance = Double.parseDouble(accBalance1.replace(" , Currency : Rupee", ""));
        System.out.println("Rons Account Balance after deposit " + accBalance + " for account number 1009");
    }

    public void getNevilleAccountBalanceBeforeDeposit() {
        accBalance1 = accountBal_xpath.getText().replace("Account Number : 1013 , Balance : ", "");
        accBalance = Double.parseDouble(accBalance1.replace(" , Currency : Dollar", ""));
        System.out.println("Neville Account Balance before deposit " + accBalance + " for account number 1013");
    }

    public void getNevilleAccountBalanceAfterDeposit() {
        accBalance1 = accountBal_xpath.getText().replace("Account Number : 1013 , Balance : ", "");
        accBalance = Double.parseDouble(accBalance1.replace(" , Currency : Dollar", ""));
        System.out.println("Neville Account Balance after deposit " + accBalance + " for account number 1013");
    }

    public void clickTransactionButton(){
        transaction_xpath.click();
    }

    public void clickWithdrawalsButton(){
        new WebDriverWait(driver, Duration.ofSeconds(20)).until(ExpectedConditions.visibilityOf(withdrawalsButton_xpath));
        withdrawalsButton_xpath.click();
    }

    public void enterWithdrawalAmount(double withdrawalAmount){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(withdrawalAmount_xpath));
        withdrawalAmount_xpath.sendKeys(String.valueOf(withdrawalAmount));
    }

    public void clickWithdrawalButtonToConfirmWithdrawal(){
        confirmWithdrawalButton_xpath.click();
    }

    public void verifyWithdrawalSuccess(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(successfulWithdrawalMessage_xpath));
        successfulWithdrawalMessage_xpath.isDisplayed();
    }

    public void getNevilleAccountBalanceAfterWithdrawal() {
        accBalance1 = accountBal_xpath.getText().replace("Account Number : 1013 , Balance : ", "");
        accBalance = Double.parseDouble(accBalance1.replace(" , Currency : Dollar", ""));
        System.out.println("Neville Account Balance after withdrawal " + accBalance + " for account number 1013");
    }

    public void clickLogoutButton() {
        logoutButton_xpath.click();
    }
}
