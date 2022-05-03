package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {

         By shoppingCartText =  By.xpath("//h1[contains(text(),'Shopping cart')]");
         By updateCart = By.xpath("//table//tbody//td[5]/input");
         By changeQnt = By.xpath("//table//tbody//td[5]/input");
         By newQnt = By.xpath("//table//tbody//td[5]/input");
         By updateShopCart = By.xpath("//button[@id='updatecart']");
         By updateCartTotalText = By.xpath("//tr[@class='order-total']");
         By shopcartTermofservice = By.xpath("//input[@id='termsofservice']");
         By clkCheckout = By.xpath("//button[@id='checkout']");
         By checkQnt = By.xpath("//li[@id='topcartlink']//span[2]");
         By subTotalText = By.xpath("//span[@class='product-subtotal']");

         public String setSubTotalText(){
             return getTextFromElement(subTotalText);
         }
         public String setCheckQnt(){
             return getTextFromElement(checkQnt);
         }
         public void clkCheckout(){
             clickOnElement(clkCheckout);
         }
         public void shopcartTerms(){
             clickOnElement(shopcartTermofservice);

         }
         public String updatecartTotalText(){
             return getTextFromElement(updateCartTotalText);
         }
         public void updateShopCart(){
             clickOnElement(updateShopCart);
         }
         public void newQnt(String qnt){
             sendTextToElement(newQnt,qnt);
         }
          public void changeQnt(){
              keyboardClear(changeQnt);
          }
         public void updateCart(){
             clickOnElement(updateCart);
         }

         public String shoppingCartText(){
         return getTextFromElement(shoppingCartText);
    }



}
