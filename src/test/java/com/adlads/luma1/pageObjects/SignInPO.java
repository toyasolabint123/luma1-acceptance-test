package com.adlads.luma1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPO {
    @FindBy(id = "email")
    public static WebElement EmailAddressField;
    @FindBy(id = "pass")
    public static WebElement PasswordField;

    @FindBy(id = "send2")
    public static WebElement SignInButton;

    // Initialise element using Selenium WebDriver
    public SignInPO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Declare page specific methods (Action)
    public void enterEmailAddress(String Email) {
        EmailAddressField.sendKeys(Email);
    }

    public void enterPassword(String Password) {
        PasswordField.sendKeys(Password);
    }

    public void clickSignInButton() {
        SignInButton.click();
    }

}
