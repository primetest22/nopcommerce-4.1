package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShippingMethodPage extends Utility {

    By shipMethod = By.cssSelector("#shippingoption_1");
    By cntButton = By.xpath("//div[@id='shipping-method-buttons-container']//button");
    By shipMethod2 = By.cssSelector("#shippingoption_2");


    public void shipMethod2(){
        clickOnElement(shipMethod2);
    }

    public void cntButton(){
        clickOnElement(cntButton);
    }
    public void shipMethod(){
        clickOnElement(shipMethod);
    }
}
