package com.ZeroOnlineBanking.pages;

import com.ZeroOnlineBanking.utilities.BrowserUtilities;
import com.ZeroOnlineBanking.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountActivityPage {
    public AccountActivityPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//tr/th[contains(text(),'Date')]")
    public WebElement Date;

    @FindBy(xpath = "//tr/th[contains(text(),'Description')]")
    public WebElement Description;

    @FindBy(xpath = "//tr/th[contains(text(),'Deposit')]")
    public WebElement Deposit;

    @FindBy(xpath = "//tr/th[contains(text(),'Withdrawal')]")
    public WebElement Withdrawal;

    @FindBy(xpath = "//option[@value='1']")
    public WebElement Savings;
}
