package com.ZeroOnlineBanking.step_definitions;

import com.ZeroOnlineBanking.pages.DashboardMenuPage;
import com.ZeroOnlineBanking.utilities.BrowserUtilities;
import com.ZeroOnlineBanking.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AccountSummaryStepDefs {

    DashboardMenuPage dashboardMenuPage = new DashboardMenuPage();

    @When("I click the online banking button")
    public void i_click_the_online_banking_button() {
        BrowserUtilities.waitForVisibility(dashboardMenuPage.userProfile, 5);
        dashboardMenuPage.OnlineBanking.click();
    }


    @When("I click  the account summary button")
    public void i_click_the_account_summary_button() {
        dashboardMenuPage.AccountSummaryLink.click();
    }

    @Given("Page should have the title {string}")
    public void Page_should_have_the_title(String title) {


        String actual = Driver.getDriver().getTitle();
        Assert.assertEquals(title, actual);


    }

    @Then("Account summary page should have the following account types: {string}, {string}, {string}, {string}")
    public void account_summary_page_should_have_the_following_account_types(String Cash_Accounts, String Investment_Accounts, String Credit_Accounts, String Loan_Accounts) {
        String actual = dashboardMenuPage.CashAccounts.getText();
        Assert.assertEquals(Cash_Accounts, actual);

        String actual2 = dashboardMenuPage.InvestmentAccounts.getText();
        Assert.assertEquals(Investment_Accounts, actual2);

        String actual3 = dashboardMenuPage.CreditAccounts.getText();
        Assert.assertEquals(Credit_Accounts, actual3);

        String actual4 = dashboardMenuPage.LoanAccounts.getText();
        Assert.assertEquals(Loan_Accounts, actual4);


    }

    @Then("{string} table must have columns")
    public void table_must_have_columns(String Account_Title) {

        List<String> expectedColumnNames = new ArrayList<>(Arrays.asList("Account","Credit Card","Balance"));
        List<String> columnNames = dashboardMenuPage.getColumnNames(Account_Title);
        System.out.println(columnNames.size());
        Assert.assertEquals(expectedColumnNames,columnNames);


    }

/*
    @Then("Credit Accounts table must have columns {string}, {string} and {string}")
    public void credit_Accounts_table_must_have_columns_and(String Account, String CreditCard, String Balance) {





        String actual = dashboardMenuPage.CreditAccounts_Account.getText();
        Assert.assertEquals(Account, actual);

        String actual2 = dashboardMenuPage.CreditAccounts_CreditCard.getText();
        Assert.assertEquals(CreditCard, actual2);

        String actual3 = dashboardMenuPage.CreditAccounts_Balance.getText();
        Assert.assertEquals(Balance, actual3);



    }
*/
}
