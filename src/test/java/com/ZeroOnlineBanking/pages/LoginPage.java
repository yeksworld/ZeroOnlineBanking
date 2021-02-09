package com.ZeroOnlineBanking.pages;

import com.ZeroOnlineBanking.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){PageFactory.initElements(Driver.getDriver(), this); }

//PageFactory(selenium) sayesinde tekrardan findelement yapmamiza gerek kalmiyor

    @FindBy(id = "signin_button")
    public WebElement signInButton;

    @FindBy(id = "user_login")
    public WebElement usernameInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(name = "submit")
    public WebElement submitButton;

    @FindBy(id ="primary-button")
    public WebElement backToSafety;

    @FindBy(xpath = "//div[@class='alert alert-error'][contains(text(),'Login and/or password are wrong.')]")
    public WebElement errorMessage;

    public void login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        submitButton.click();
    }
}
