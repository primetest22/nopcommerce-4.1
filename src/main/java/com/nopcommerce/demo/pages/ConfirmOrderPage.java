package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ConfirmOrderPage extends Utility {

    By payCreditText = By.xpath("//li[@class='payment-method']");
    By payShipText = By.xpath("//li[@class='shipping-method']");
    By total = By.xpath("//tr[@class='order-total']");
    By cnfmButton = By.xpath("//button[contains(text(),'Confirm')]");

    public void setCnfmButton() {
        clickOnElement(cnfmButton);
    }

    public String setTotal() {
        return getTextFromElement(total);
    }

    public String setPayCreditText() {
        return getTextFromElement(payCreditText);
    }

    public String setPayShipText() {
        return getTextFromElement(payShipText);
    }


}
