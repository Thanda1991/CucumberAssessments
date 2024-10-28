package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = {"StepsDefinition"},
        tags = "@Test3",
        plugin = {"pretty", "html:Reports/XYZ_Bank.html",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        publish = true)
public class Runner extends AbstractTestNGCucumberTests {
}
