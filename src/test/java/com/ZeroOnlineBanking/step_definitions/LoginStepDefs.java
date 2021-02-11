package com.ZeroOnlineBanking.step_definitions;

import com.ZeroOnlineBanking.pages.DashboardMenuPage;
import com.ZeroOnlineBanking.pages.LoginPage;
import com.ZeroOnlineBanking.utilities.BrowserUtilities;
import com.ZeroOnlineBanking.utilities.ConfigurationReader;
import com.ZeroOnlineBanking.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;


public class LoginStepDefs {

    LoginPage loginPage = new LoginPage();
    DashboardMenuPage dashboardMenuPage = new DashboardMenuPage();
    String globalUsername;

    @Given("I am on the Login page")
    public void i_am_on_the_Login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        BrowserUtilities.waitForVisibility(loginPage.signInButton, 5);
        loginPage.signInButton.click();

    }

    @Given("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String username, String password) {
        globalUsername = username;
        BrowserUtilities.waitForVisibility(loginPage.passwordInput, 5);
        loginPage.usernameInput.sendKeys(username);
        loginPage.passwordInput.sendKeys(password);
        loginPage.submitButton.click();
        try {
            loginPage.backToSafety.click();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Then("the Account Summary page should be displayed")
    public void the_Account_Summary_page_should_be_displayed() {
        BrowserUtilities.waitForVisibility(dashboardMenuPage.userProfile, 5);
        String actual = dashboardMenuPage.userProfile.getText();
        String expected = globalUsername;
        Assert.assertEquals(expected, actual);
    }


    @Then("Error message {string} should be displayed.")
    public void error_message_should_be_displayed(String erorMessage) {
        String actual = loginPage.errorMessage.getText();
        String expected = erorMessage;
        Assert.assertEquals(expected, actual);


    }


}










