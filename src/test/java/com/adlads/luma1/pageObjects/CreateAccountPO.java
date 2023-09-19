package com.adlads.luma1.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAccountPO {
    // Define element locator (e.g. linkText) and WebElement (whatever element we're interacting
    // with on the website)
    @FindBy(id = "firstname")
    public static WebElement FirstNameField;
    @FindBy(id = "lastname")
    public static WebElement LastNameField;
    @FindBy(id = "email_address")
    public static WebElement EmailAddressField;
    @FindBy(id = "password")
    public static WebElement PasswordField;
    @FindBy(id = "password-confirmation")
    public static WebElement PasswordConfirmationField;

    @FindBy(xpath = "//*[@id=\"form-validate\"]/div/div[1]/button/span")
    public static WebElement CreateAccountButton;


    // Initialise element using Selenium WebDriver
    public CreateAccountPO(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    // Declare page specific methods (Action)
    public void enterFirstNameField(String FirstName) {
        FirstNameField.sendKeys(FirstName);
    }

    public void enterLastNameField(String LastName) {
        LastNameField.sendKeys(LastName);
    }

    public void enterEmailAddressField(String EmailAddress) {
        EmailAddressField.sendKeys(EmailAddress);
    }

    public void enterPasswordField(String Password) {
        PasswordField.sendKeys(Password);
    }

    public void enterPasswordConfirmationField(String PasswordConfirmation) {
        PasswordConfirmationField.sendKeys(PasswordConfirmation);
    }

    public void clickCreateAnAccountButton() {
        CreateAccountButton.click();
    }


}
