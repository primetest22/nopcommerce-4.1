package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By electronicText = By.xpath("//h1[contains(text(),'Electronics')]");

    public String verifyElectronicsText(){
        return getTextFromElement(electronicText);

    }
}
