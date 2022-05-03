package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterResultPage extends Utility {

       By registerText = By.xpath("//div[contains(text(),'Your registration completed')]");
       By cntButton = By.xpath("//a[contains(text(),'Continue')]");

       public void setCntButton(){
           clickOnElement(cntButton);
       }
       public String setRegisterText(){
           return getTextFromElement(registerText);
       }
}
