package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CheckOutCompletePage extends Utility {

        By payConfirmationText = By.xpath("//h1[contains(text(),'Thank you')]");
        By orderText =  By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]");
        By cntButton = By.xpath("//button[contains(text(),'Continue')]");
        By logOut = By.xpath("//a[contains(text(),'Log out')]");

        public void setLogOut(){
            clickOnElement(logOut);
        }
        public void setCntButton(){
            clickOnElement(cntButton);
        }
        public String setPayConfirmationText(){
               return getTextFromElement(payConfirmationText);
        }
    public String orderText(){
        return getTextFromElement(orderText);
    }

}
