package com.ZeroOnlineBanking.pages;

import com.ZeroOnlineBanking.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}