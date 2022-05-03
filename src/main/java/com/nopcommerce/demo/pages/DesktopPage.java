package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class DesktopPage extends Utility {

    By dropDownMenu = By.id("products-orderby");
    By verifyText = By.xpath("//option[contains(text(),'Name: Z to A')]");
    By addCart = By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]");

     public void addCart(){

         clickOnElement(addCart);
     }

    //click on sort by dropdown menu
    public void clickDropDown() {
        clickOnElement(dropDownMenu);
    }
    //click on Name: Z to A option
    public void selectZtoAoption(String option) throws InterruptedException {
        Thread.sleep(1500);
        selectByVisibleTextFromDropDown(dropDownMenu, option);
    }
    //validate order
    public String validateZtoAorder() {
        return getTextFromElement(verifyText);
    }

}
