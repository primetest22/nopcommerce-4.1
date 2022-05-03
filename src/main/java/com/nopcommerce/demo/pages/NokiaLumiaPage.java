package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class NokiaLumiaPage extends Utility {

     By qntField = By.cssSelector("#product_enteredQuantity_20");
     By clrQntField = By.cssSelector("#product_enteredQuantity_20");
     By updateQntField = By.cssSelector("#product_enteredQuantity_20");
     By clkAddCart = By.cssSelector("#add-to-cart-button-20");
     By topBarText = By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]");
     By xTopBar = By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]");
     By topShopCart = By.xpath("//span[contains(text(),'Shopping cart')]");
     By goToCart = By.xpath("//button[contains(text(),'Go to cart')]");

     public void setGoToCart() throws InterruptedException {
         mouseHoverAndClick(goToCart);
     }
     public  void setTopShopCart() throws InterruptedException {
         mouseHover(topShopCart);
     }
     public void setxTopBar(){
         clickOnElement(xTopBar);
     }
     public String setTopBarText(){
         return getTextFromElement(topBarText);
     }
     public void setClkAddCart(){
         clickOnElement(clkAddCart);
     }
     public void setUpdateQntField(String updateField){
         sendTextToElement(updateQntField,updateField);
     }
     public void setClrQntField(){
         keyboardClear(clrQntField);
     }
     public void setQntField(){
         clickOnElement(qntField);
     }

}
