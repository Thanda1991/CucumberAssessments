package StepsDefinition;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;

public class MyStepDefinition extends Base {

    @Given("I have launched the site and I see appropriate login button")
    public void iHaveLaunchedTheSiteAndISeeAppropriateLoginButton() {
        userLoginPage.verifyTheBanNameIsVisible();
    }

    @And("I click the customer login button")
    public void iClickTheCustomerLoginButton() {
        userLoginPage.clickLoginButton();
    }

    @And("I select customer name from the dropdown list of customers (.*)$")
    public void iSelectCustomerNameFromTheDropdownListOfCustomersCustomerName(String customerName) {
        customerSelectionPage.selectCustomerName(customerName);
    }

    @When("I click the Login button to login")
    public void iClickTheLoginButtonToLogin() {
        customerSelectionPage.clickLoginButton();
    }

    @Then("The welcome message is displayed and I see my account information")
    public void theWelcomeMessageIsDisplayedAndISeeMyAccountInformation() {
        accountInformationPage.verifyTheWelcomeMessageIsDisplayed();
    }

    @And("I get the customer's initial account balance")
    public void iGetTheCustomerSInitialAccountBalance() {
        accountInformationPage.getHarryAccountBalanceBeforeDeposit();
    }

    @And("I click the deposit button to make a deposit")
    public void iClickTheDepositButtonToMakeADeposit() {
        accountInformationPage.clickDepositButton();
    }

    @And("I enter the deposit amount (.*)$")
    public void iEnterTheDepositAmountDepositAmount(double depositAmount) {
        accountInformationPage.enterDepositAmount(depositAmount);
    }

    @And("I click the deposit button to submit deposit amount")
    public void iClickTheDepositButtonToSubmitDepositAmount() {
        accountInformationPage.clickToSubmitDepositAmount();
    }

    @Then("I validate that the deposit was successful")
    public void iValidateThatTheDepositWasSuccessful() {
        accountInformationPage.verifyDepositSuccess();
    }

    @And("I check if the new deposit reflect in the customer account")
    public void iCheckIfTheNewDepositReflectInTheCustomerAccount() {
        accountInformationPage.getHarryAccountBalanceAfterDeposit();
    }

    @And("I get the customer's first account balance before deposit")
    public void iGetTheCustomerSFirstAccountInitialBalanceBeforeDeposit() {
        accountInformationPage.getRonsFirstAccountBalanceBeforeDeposit();
    }
    @And("I get the customer's second account balance before deposit")
    public void iGetTheCustomerSSecondAccountInitialBalanceBeforeDeposit() {
        accountInformationPage.getRonsSecondAccountBalanceBeforeDeposit();
    }

    @And("I click the deposit button to make a deposit in customer first account")
    public void iClickTheDepositButtonToMakeADepositInCustomerFirstAccount() {
        accountInformationPage.clickDepositButton();
    }

    @Then("I select the customer's second account (.*)$")
    public void iSelectTheCustomerSSecondAccountCustomerSecondAccountNumber(String customerSecondAccountNumber) {
        accountInformationPage.selectCustomersSecondAccount(customerSecondAccountNumber);
    }

    @And("I get the customer's first account balance after deposit")
    public void iGetTheCustomerSFirstAccountBalanceAfterDeposit() {
        accountInformationPage.getRonsFirstAccountBalanceAfterDeposit();
    }

    @And("I get the customer's second account balance after deposit")
    public void iGetTheCustomerSSecondAccountBalanceAfterDeposit() {
        accountInformationPage.getRonsSecondAccountBalanceAfterDeposit();
    }

    @Then("I select the customer's third account (.*)$")
    public void iSelectTheCustomerSThirdAccountCustomerThirdAccountNumber(String customerThirdAccountNumber) {
        accountInformationPage.selectCustomersThirdAccount(customerThirdAccountNumber);
    }

    @And("I get the customer's third account balance before deposit")
    public void iGetTheCustomerSThirdAccountBalanceBeforeDeposit() {
        accountInformationPage.getRonsThirdAccountBalanceBeforeDeposit();

    }

    @And("I get the customer's third account balance after deposit")
    public void iGetTheCustomerSThirdAccountBalanceAfterDeposit() {
        accountInformationPage.getRonsThirdAccountBalanceAfterDeposit();
    }

    @And("I get the customer's initial account balance before deposit")
    public void iGetTheCustomerSInitialAccountBalanceBeforeDeposit() {
        accountInformationPage.getNevilleAccountBalanceBeforeDeposit();
    }

    @Then("I get the customer's account balance after deposit")
    public void iGetTheCustomerSAccountBalanceAfterDeposit() {
        accountInformationPage.getNevilleAccountBalanceAfterDeposit();
    }

    @And("I click the transaction button to view transactions")
    public void iClickTheTransactionButtonToViewTransactions() {
        accountInformationPage.clickTransactionButton();
    }

   @Then("I verify that the transaction appears")
    public void iVerifyThatTheTransactionAppears() {

       transactionsPage.verifyTransactionAppears();
   }

    @And("I click the back button to go back")
    public void iClickTheBackButtonToGoBack() {
        transactionsPage.clickBackButton();
    }

    @Then("I click the withdrawal button to open withdrawals")
    public void iClickTheWithdrawalButtonToOpenWithdrawals() {
        accountInformationPage.clickWithdrawalsButton();
    }

    @And("I put the withdrawal amount (.*)$")
    public void iPutTheWithdrawalAmountWithdrawalAmount(double withdrawalAmount) {
        accountInformationPage.enterWithdrawalAmount(withdrawalAmount);
    }

    @Then("I click the withdrawal button to confirm withdrawal")
    public void iClickTheWithdrawalButtonToConfirmWithdrawal() {
        accountInformationPage.clickWithdrawalButtonToConfirmWithdrawal();
    }

    @And("I verify that the withdrawal was successful")
    public void iVerifyThatTheWithdrawalWasSuccessful() {
        accountInformationPage.verifyWithdrawalSuccess();
    }

    @And("I get customer's balance after withdrawal")
    public void iGetCustomerSBalanceAfterWithdrawal() {
        accountInformationPage.getNevilleAccountBalanceAfterWithdrawal();
    }

    @And("I click the logout button to logout")
    public void iClickTheLogoutButtonToLogout() {
        accountInformationPage.clickLogoutButton();
    }

    @AfterStep
    public void addScreenshot(Scenario scenario){
        if(scenario.isFailed()){
            byte[] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","image");
        }
    }

    @After
    public void quitBrowser(){
        driver.quit();
    }
}
