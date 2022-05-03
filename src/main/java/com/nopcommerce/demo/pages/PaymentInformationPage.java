package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class PaymentInformationPage extends Utility {

    By clkCreditCard =By.id("CreditCardType");
    By selectCreditCard = By.id("CreditCardType");
    By holderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expMonth = By.id("ExpireMonth");
    By expYear = By.id("ExpireYear");
    By code = By.id("CardCode");
    By payMethod = By.xpath("//div[@id='payment-info-buttons-container']//button");

    public void setClkCreditCard(){
        clickOnElement(clkCreditCard);
    }
    public void setSelectCreditCard(String type){
        selectByVisibleTextFromDropDown(selectCreditCard,type);
    }
    public void setHolderName(String hname){
        sendTextToElement(holderName,hname);
    }
    public void setCardNumber(String cardnum){
        sendTextToElement(cardNumber,cardnum);
    }
    public void setExpMonth(String mnth){
        selectByVisibleTextFromDropDown(expMonth,mnth);
    }
    public void setExpYear(String year){
        selectByContainsTextFromDropDown(expYear,year);
    }
    public void setCode(String cde){
        sendTextToElement(code,cde);
    }
    public void setPayMethod(){
        clickOnElement(payMethod);
    }





}
