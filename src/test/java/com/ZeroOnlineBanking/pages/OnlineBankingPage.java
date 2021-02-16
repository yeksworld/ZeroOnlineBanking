package com.ZeroOnlineBanking.pages;

import com.ZeroOnlineBanking.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OnlineBankingPage {
    public OnlineBankingPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "onlineBankingMenu")
    public WebElement OnlineBanking;

    @FindBy(id = "account_summary_link")
    public WebElement AccountSummaryLink;

    @FindBy(id = "account_activity_link")
    public WebElement AccountActivity;

    @FindBy(id = "pay_bills_link")
    public WebElement PayBills;

}
