package com.ZeroOnlineBanking.pages;

import com.ZeroOnlineBanking.utilities.BrowserUtilities;
import com.ZeroOnlineBanking.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DashboardMenuPage extends BasePage{


    @FindBy(xpath = "(//a[@class='dropdown-toggle'])[2]")
    public WebElement userProfile;





}
