package StepsDefinition;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class MyStepDefs {

    WebDriver driver;

    @Given("I have launched the site and I see appropriate login button")
    public void iHaveLaunchedTheSiteAndISeeAppropriateLoginButton() {
        driver = new ChromeDriver();
        driver.get("http://www.way2automation.com/angularjs-protractor/banking/#/login");
        driver.manage().window().maximize();
    }

    @And("I click the customer login button")
    public void iClickTheCustomerLoginButton() {
    }

    @And("I select my name from the dropdown list of customers (.*)$")
    public void iSelectMyNameFromTheDropdownListOfCustomersCustomerName(String customerName) {
    }

    @When("I click the Login button to login")
    public void iClickTheLoginButtonToLogin() {
    }

    @Then("The welcome message is displayed and I see my account information")
    public void theWelcomeMessageIsDisplayedAndISeeMyAccountInformation() {
    }

    @And("I verify the customer's original balance")
    public void iVerifyTheCustomerSOriginalBalance() {
    }

    @And("I click the deposit button to make a deposit")
    public void iClickTheDepositButtonToMakeADeposit() {
    }

    @And("I enter the deposit amount (.*)$")
    public void iEnterTheDepositAmountDepositAmount(Double depositAmount) {
    }

    @Then("I validate that the deposit was successful")
    public void iValidateThatTheDepositWasSuccessful() {
    }

    @And("I click the logout button to logout")
    public void iClickTheLogoutButtonToLogout() {
    }

}
