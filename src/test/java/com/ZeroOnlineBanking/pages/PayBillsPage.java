package com.ZeroOnlineBanking.pages;

import com.ZeroOnlineBanking.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPage {
    public PayBillsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "sp_payee")
    public WebElement SelectPayee;

    @FindBy(xpath = "//select[@id='sp_payee']//option[@value='apple']")
    public WebElement apple;

    @FindBy(id = "sp_account")
    public WebElement SelectAccount;

    @FindBy(xpath = "//select[@id='sp_account']//option[@value='2']")
    public WebElement Checking;

    @FindBy(id = "sp_amount")
    public WebElement SelectAmount;

    @FindBy(id = "sp_date")
    public WebElement SelectDate;

    @FindBy(id = "sp_description")
    public WebElement SelectDescription;

    @FindBy(id = "pay_saved_payees")
    public WebElement ClickPay;

    @FindBy(id = "alert_content")
    public WebElement alertMessageBox;



}
