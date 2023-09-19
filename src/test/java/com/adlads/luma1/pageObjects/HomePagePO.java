package com.adlads.luma1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePagePO {
    // Define element locator (e.g. linkText) and WebElement (whatever element we're interacting
    // with on the website)
    @FindBy(linkText = "Create an Account")
    public static WebElement CreateAccountLink;
    @FindBy(linkText = "Sign In")
    public static WebElement SignInLink;

    // Initialise element using Selenium WebDriver
    public HomePagePO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Declare page specific methods (Action)
    public void clickCreateAccountLink() {
        CreateAccountLink.click();
    }

    public void clickSignInLink() {
        SignInLink.click();
    }

}