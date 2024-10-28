package StepsDefinition;

import Pages.AccountInformationPage;
import Pages.CustomerSelectionPage;
import Pages.TransactionsPage;
import Pages.UserLoginPage;
import Utils.BrowserFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Base {

    BrowserFactory browserFactory = new BrowserFactory();
    WebDriver driver = BrowserFactory.startBrowser("Chrome","https://www.way2automation.com/angularjs-protractor/banking/#/login");
    UserLoginPage userLoginPage = PageFactory.initElements(driver,UserLoginPage.class);
    CustomerSelectionPage customerSelectionPage = PageFactory.initElements(driver,CustomerSelectionPage.class);
    AccountInformationPage accountInformationPage = PageFactory.initElements(driver,AccountInformationPage.class);
    TransactionsPage transactionsPage = PageFactory.initElements(driver,TransactionsPage.class);

}
