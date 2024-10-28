# Automation Test Framework

## Overview

This repository contains an object-oriented automation test framework designed to automate test cases for the banking application available at [Way2Automation](http://www.way2automation.com/angularjs-protractor/banking/#/login). The framework is built using an open-source automation framework, emphasizing best practices in object-oriented programming, reporting, and maintainability.

## Features

- **Object-Oriented Design**: Implements OOP principles for better structure and reusability.
- **Rich Reporting**: Generates detailed reports with outputs and screenshots of the test execution.
- **Easy to Use**: Simple commands to execute tests and generate reports.

## Tools Used
- **Intellij**: JavaScript runtime for server-side development.
- **Java with Maven**: For enhanced code quality and readability.
### Reporting Tools
- **Allure Report**
- **Extents Report**


## Prerequisites

- **Intellij**: Ensure Node.js is installed on your machine. You can download it from [nodejs.org](https://nodejs.org/).
- **Git**: Version control system to clone the repository.

## Installation

1. **Clone the Repository**:
   
   git clone https://github.com/Thanda1991/CucumberAssessments.git

2. **Installed Dependencies**:

https://mvnrepository.com/artifact/io.cucumber/cucumber-jvm
https://mvnrepository.com/artifact/io.cucumber/cucumber-testng
https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
https://mvnrepository.com/artifact/tech.grasshopper/extentreports-cucumber7-adapter
https://mvnrepository.com/artifact/io.qameta.allure/allure-testng

## Running the Tests

To execute the test cases, run on the runner file otherwise you can specify which feature to executes by modifying the tags in the runner file

### Test Cases

1. **Test 1: Customer Login and Deposit**
    - Login as a Customer.
    - Deposit **1500**.
    - Validate that the deposit was successful.
    - Logout.

2. **Test 2: Multiple Account Deposits**
    - Login as a Customer.
    - For each account:
        - Deposit **1500**.
        - Validate that the deposit was successful.
    - Logout.

3. **Test 3: Advanced Transaction Management**
    - Login as a Customer.
    - Deposit **31459** into the first account.
    - Validate that the deposit was successful.
    - Open Transactions and validate that the transaction appears.
    - Open Withdrawal and withdraw **31459**.
    - Validate that the current balance is the original balance.
    - Open Transactions and validate that the transaction appears.
    - Logout.

## Reporting

After running the tests, a detailed report will be generated in the `reports/` directory. This report includes:

- Test execution results.
- Screenshots for each test step.
- Logs for any failures or exceptions.

## Contribution

To add a contributor for evaluation, navigate to your repository on Bitbucket or GitHub, go to the repository settings, and invite the user as a collaborator.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- Thanks to the developers Tman and other tools that made this automation possible.

---

For any questions or issues, please open an issue in the repository. Happy testing!