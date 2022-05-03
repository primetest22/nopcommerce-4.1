package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BuildYourOwnComputerPage extends Utility {

       By buildComputerText = By.xpath("//h1[contains(text(),'Build your own computer')]");
       By selectIntelPentium =  By.id("product_attribute_1");
       By selectRam = By.cssSelector("#product_attribute_2");
       By Hdd = By.cssSelector("#product_attribute_3_7");
       By OsRadio   = By.cssSelector("#product_attribute_4_9");
       By checkBox = By.cssSelector("#product_attribute_5_12");
       By verifyPrice = By.cssSelector("#price-value-1");
       By buildAddCart = By.cssSelector("#add-to-cart-button-1");
       By topBarText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
       By closeTopBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
       By topCart = By.xpath("//span[contains(text(),'Shopping cart')]");
       By clickTopCart = By.xpath("//button[contains(text(),'Go to cart')]");



    public void clickTopCart() throws InterruptedException {
        mouseHoverAndClick(clickTopCart);
    }
            public void topCart() throws InterruptedException {
                mouseHover(topCart);
            }
            public void closeTopBar(){
                clickOnElement(closeTopBar);
            }
            public String topBarText(){
               return getTextFromElement(topBarText);
            }
    public void buildAddCart(){
        clickOnElement(buildAddCart);
    }
    public String verifyTotalPrice(){
        return getTextFromElement(verifyPrice);
    }
    public void checkBox(){
        clickOnElement(checkBox);
    }
    public void osRadio(){
        clickOnElement(OsRadio);
    }
       public void selectHddRadio(){
           clickOnElement(Hdd);
       }
       public void selectRamCap(String option){
        selectByVisibleTextFromDropDown(selectRam,option);
    }
       public void selectPentium(String option){
           selectByVisibleTextFromDropDown(selectIntelPentium,option);
       }
       public String verifyBuildComputerText(){
           return getTextFromElement(buildComputerText);

       }






}
