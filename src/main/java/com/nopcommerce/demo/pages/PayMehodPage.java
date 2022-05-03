package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PayMehodPage extends Utility {

      By creditCard =  By.id("paymentmethod_1");//By.cssSelector("#shippingoption_1");
      By cntButton = By.xpath("//div[@id='payment-method-buttons-container']//button");


      public void creditCard(){
          clickOnElement(creditCard);
      }
    public void cntButton(){
        clickOnElement(cntButton);
    }



}
