package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class CellPhonesPage extends Utility {

     By cellPhoneText = By.xpath("//h1[contains(text(),'Cell phones')]");
     By clkListIcon = By.xpath("//a[contains(text(),'List')]");
     By nokiaLink = By.xpath("//a[contains(text(),'Nokia Lumia 1020')]");


     public void setNokiaLink(){
         clickOnElement(nokiaLink);
     }
     public  void setClkListIcon(){
         clickOnElement(clkListIcon);
     }
     public String setCellPhoneText(){
        return getTextFromElement(cellPhoneText);
     }





}
