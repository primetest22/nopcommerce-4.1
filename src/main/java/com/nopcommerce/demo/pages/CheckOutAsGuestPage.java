package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutAsGuestPage extends Utility {

         By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
         By clkAsGuest = By.xpath("//button[contains(text(),'Checkout as Guest')]");
         By registerBtn = By.xpath("//button[contains(text(),'Register')]");




         public void setRegisterBtn(){
             clickOnElement(registerBtn);
         }
         public void clkAsGuest(){
             clickOnElement(clkAsGuest);
         }
         public String welcomeText(){
             return getTextFromElement(welcomeText);
         }















}
