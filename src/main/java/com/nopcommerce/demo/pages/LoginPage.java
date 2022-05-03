package com.nopcommerce.demo.pages;



import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.className("page__heading");
    By emailField = By.id("user[email]");
    By passwordField = By.id("user[password]");
    By loginButton = By.xpath("//input[@value='Sign in']");
    By errorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterEmail(String username) {
        sendTextToElement(emailField, username);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }


}
