package com.ZeroOnlineBanking.pages;

import com.ZeroOnlineBanking.utilities.BrowserUtilities;
import com.ZeroOnlineBanking.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountSummaryPage {
    public AccountSummaryPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//h2[contains(text(),'Cash Accounts')]")
    public WebElement CashAccounts;

    @FindBy(xpath = "//h2[contains(text(),'Investment Accounts')]")
    public WebElement InvestmentAccounts;

    @FindBy(xpath = "//h2[contains(text(),'Credit Accounts')]")
    public WebElement CreditAccounts;

    @FindBy(xpath = "//h2[contains(text(),'Loan Accounts')]")
    public WebElement LoanAccounts;

    @FindBy(id = "aa_accountId")
    public WebElement click_Account;

    public List<String> getColumnNames(String AccountType) {
        String xpath = "//h2[contains(text(),'" + AccountType + "')]//following-sibling::div[1]//th";
        return BrowserUtilities.getElementsText(By.xpath(xpath));
    }
}
