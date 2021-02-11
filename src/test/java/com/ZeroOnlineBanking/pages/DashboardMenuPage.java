package com.ZeroOnlineBanking.pages;

import com.ZeroOnlineBanking.utilities.BrowserUtilities;
import com.ZeroOnlineBanking.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardMenuPage {
    public DashboardMenuPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement userProfile;

    @FindBy(id = "onlineBankingMenu")
    public WebElement OnlineBanking;

    @FindBy(id = "account_summary_link")
    public WebElement AccountSummaryLink;

    @FindBy(xpath = "//title[contains(text(),'Zero - Account Summary')]")
    public WebElement AccountSummaryTitle;

    @FindBy(xpath = "//h2[contains(text(),'Cash Accounts')]")
    public WebElement CashAccounts;

    @FindBy(xpath = "//h2[contains(text(),'Investment Accounts')]")
    public WebElement InvestmentAccounts;

    @FindBy(xpath = "//h2[contains(text(),'Credit Accounts')]")
    public WebElement CreditAccounts;

    @FindBy(xpath = "//h2[contains(text(),'Loan Accounts')]")
    public WebElement LoanAccounts;

    @FindBy(xpath = "(//tr/th[contains(text(),'Account')])[3]")
    public WebElement CreditAccounts_Account;

    @FindBy(xpath = "//th[contains(text(),'Credit Card')]")
    public WebElement CreditAccounts_CreditCard;

    @FindBy(xpath = "(//th[contains(text(),'Balance')])[3]")
    public WebElement CreditAccounts_Balance;

    @FindBy(id = "account_activity_link")
    public WebElement AccountActivity;

    @FindBy(xpath = "//option[@value='1']")
    public WebElement Savings;

    @FindBy(id = "aa_accountId")
    public WebElement click_Account;

    @FindBy(xpath = "//option[@value='2']")
    public WebElement Checking;

    @FindBy(xpath = "//option[@value='3']")
    public WebElement Savings2;

    @FindBy(xpath = "//option[@value='4']")
    public WebElement Loan;

    @FindBy(xpath = "//option[@value='5']")
    public WebElement CreditCard;

    @FindBy(xpath = "//option[@value='6']")
    public WebElement Brokerage;

    @FindBy(xpath = "//tr/th[contains(text(),'Date')]")
    public WebElement Date;

    @FindBy(xpath = "//tr/th[contains(text(),'Description')]")
    public WebElement Description;

    @FindBy(xpath = "//tr/th[contains(text(),'Deposit')]")
    public WebElement Deposit;

    @FindBy(xpath = "//tr/th[contains(text(),'Withdrawal')]")
    public WebElement Withdrawal;


    public List<String> getColumnNames(String AccountType){
        String xpath="//h2[contains(text(),'"+AccountType+"')]//following-sibling::div[1]//th";
        return BrowserUtilities.getElementsText(By.xpath(xpath));
    }

}
