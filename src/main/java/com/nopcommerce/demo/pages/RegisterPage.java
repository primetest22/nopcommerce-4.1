package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By frstName = By.id("FirstName");
    By lstName = By.id("LastName");
    By email = By.id("Email");
    By password = By.xpath("//input[@id='Password']");
    By cnfmPassword = By.xpath("//input[@id='ConfirmPassword']");
    By regButton = By.id("register-button");

    public void enterFname(String first) {
        sendTextToElement(frstName, first);
    }

    public void enterLname(String last) {
        sendTextToElement(lstName, last);
    }

    public void enteremail(String eemail) {
        sendTextToElement(email, eemail);
    }

    public void enterPassword(String pass) {
        sendTextToElement(password, pass);
    }

    public void entercnfmPass(String cnfm) {
        sendTextToElement(cnfmPassword, cnfm);
    }

    public void regbtn() {
        clickOnElement(regButton);
    }


}
