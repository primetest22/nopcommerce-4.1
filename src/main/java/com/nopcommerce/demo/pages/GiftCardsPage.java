package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {

    By giftCardsText = By.partialLinkText("Gift Car");

    public String verifyGiftCardsText(){
        return getTextFromElement(giftCardsText);

    }

}
