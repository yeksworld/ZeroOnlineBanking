package com.ZeroOnlineBanking.step_definitions;

import com.ZeroOnlineBanking.pages.AccountActivityPage;
import com.ZeroOnlineBanking.pages.AccountSummaryPage;
import com.ZeroOnlineBanking.pages.DashboardMenuPage;
import com.ZeroOnlineBanking.pages.OnlineBankingPage;
import com.ZeroOnlineBanking.utilities.BrowserUtilities;
import com.ZeroOnlineBanking.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountActivityStepDefs {
    DashboardMenuPage dashboardMenuPage = new DashboardMenuPage();
    OnlineBankingPage onlineBankingPage = new OnlineBankingPage();
    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();
    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Given("I click the Account Activity button")
    public void I_click_the_Account_Activity_button() {
       onlineBankingPage.AccountActivity.click();

    }

    @Given("page should have the title {string}")
    public void page_should_have_the_title(String title) {
        String actual = Driver.getDriver().getTitle();
        Assert.assertEquals(title, actual);
    }

    @Given("In the Account drop down default option should be {string}.")
    public void in_the_Account_drop_down_default_option_should_be(String Savings) {
        BrowserUtilities.waitForVisibility(accountActivityPage.Savings, 5);
        Select ahmet = new Select(accountSummaryPage.click_Account);
        String actual = ahmet.getFirstSelectedOption().getText();
        Assert.assertEquals(Savings,actual);


    }

    @Then("Account drop down should have the following options: {string}, {string}, {string}, {string}, {string}")
    public void account_drop_down_should_have_the_following_options(String Savings, String Checking, String Loan, String Credit_Card, String Brokerage) {
        BrowserUtilities.waitForVisibility(accountSummaryPage.click_Account, 5);
        accountSummaryPage.click_Account.click();

        List<String> AccountNameList = new ArrayList<>(Arrays.asList(Savings,Checking,Loan,Credit_Card,Brokerage));


        Select Dropdown = new Select(accountSummaryPage.click_Account);
        List<String> AccountList = new ArrayList<>();
        Dropdown.getOptions();
        for (WebElement a : Dropdown.getOptions()) {
            AccountList.add(a.getText());
        }

        System.out.println(AccountList);
        Assert.assertEquals(AccountNameList,AccountList);

/*
        String actual = dashboardMenuPage.Checking.getText();
        String expected = Checking;
        Assert.assertEquals(expected,actual);

        String actual2 = dashboardMenuPage.Savings2.getText();
        String expected2 = Savings;
        Assert.assertEquals(expected2,actual2);

        String actual3 = dashboardMenuPage.Loan.getText();
        String expected3 = Loan;
        Assert.assertEquals(expected3,actual3);

        String actual4 = dashboardMenuPage.CreditCard.getText();
        String expected4 = Credit_Card;
        Assert.assertEquals(expected4,actual4);

        String actual5 = dashboardMenuPage.Brokerage.getText();
        String expected5 = Brokerage;
        Assert.assertEquals(expected5,actual5);

 */


    }

    @Then("Transactions table should have column names {string}, {string}, {string}, {string}")
    public void transactions_table_should_have_column_names(String Date, String Description, String Deposit, String Withdrawal) {

        BrowserUtilities.waitForVisibility(accountActivityPage.Date, 5);

        String actual = accountActivityPage.Date.getText();
        Assert.assertEquals(Date, actual);

        String actual2 = accountActivityPage.Description.getText();
        Assert.assertEquals(Description, actual2);

        String actual3 = accountActivityPage.Deposit.getText();
        Assert.assertEquals(Deposit, actual3);

        String actual4 = accountActivityPage.Withdrawal.getText();
        Assert.assertEquals(Withdrawal, actual4);


    }


}
