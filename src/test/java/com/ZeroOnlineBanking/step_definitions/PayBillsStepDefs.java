package com.ZeroOnlineBanking.step_definitions;

import com.ZeroOnlineBanking.pages.OnlineBankingPage;
import com.ZeroOnlineBanking.pages.PayBillsPage;
import com.ZeroOnlineBanking.utilities.BrowserUtilities;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class PayBillsStepDefs {
    PayBillsPage payBillsPage = new PayBillsPage();
    OnlineBankingPage onlineBankingPage = new OnlineBankingPage();
    Random random = new Random();

    @Given("I click the Pay Bills button")
    public void i_click_the_Pay_Bills_button() {
        onlineBankingPage.PayBills.click();
        BrowserUtilities.waitForVisibility(payBillsPage.ClickPay,5);

    }

    @Then("I click the Payee and click any options")
    public void i_click_the_Payee_and_click_any_options() {
        Select payeeOptions = new Select(payBillsPage.SelectPayee);
        int rand = random.nextInt(payeeOptions.getOptions().size());
        payeeOptions.selectByIndex(rand);

    }

    @Then("I click the Account and click any options")
    public void i_click_the_Account_and_click_any_options() {
        Select accountOptions = new Select(payBillsPage.SelectAccount);
        int rand =random.nextInt(accountOptions.getOptions().size());
        accountOptions.selectByIndex(rand);

    }

    @When("I should fill in Amount ,Date and Description")
    public void i_should_fill_in_Amount_Date_and_Description() {
        int amountRandom = random.nextInt(100000);
        payBillsPage.SelectAmount.sendKeys(amountRandom+"");

        DateFormat df = new SimpleDateFormat("yy-MM-dd");
        Date dateobj = new Date();
        payBillsPage.SelectDate.sendKeys(df.format(dateobj));

        payBillsPage.SelectDescription.sendKeys("Sending money");



    }

    @Then("I click the Pay button")
    public void i_click_the_Pay_button() {
        payBillsPage.ClickPay.click();

    }

    @Then("I should be have this message {string}")
    public void i_should_be_have_this_message(String expectedMessage) {
        if (expectedMessage.contains("The payment was successfully submitted.")) {
            Assert.assertTrue("Alert Box is not displayed", payBillsPage.alertMessageBox.isDisplayed());
            String actualMessage = payBillsPage.alertMessageBox.getText();
            Assert.assertEquals("Alert Box Message does not match: " + actualMessage, expectedMessage, actualMessage);
        } else {
            if (payBillsPage.SelectAmount.getAttribute("value").isEmpty()) {
                String actualValidationMessage = payBillsPage.SelectAmount.getAttribute("validationMessage");
                Assert.assertEquals("Alert Box Message does not match",expectedMessage,actualValidationMessage);
            } else {
                String actualValidationMessage = payBillsPage.SelectDate.getAttribute("validationMessage");
                Assert.assertEquals("Alert Box Message does not match",expectedMessage,actualValidationMessage);
            }
        }
    }

    }

