package com.nopcommerce.demo.pages;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePage extends Utility {

   By computer = By.xpath("//ul[@class='top-menu notmobile']//li//a[contains(text(),'Computers')]");
   By electronics = By.partialLinkText("Electroni");
   By apparel = By.partialLinkText("Appar");
   By digitalDownloads = By.partialLinkText("Digital downloa");
   By books = By.partialLinkText("Books");
   By jewelry = By.partialLinkText("Jewel");
   By giftCards = By.partialLinkText("Gift Car");

   By hoverComputerTab = By.partialLinkText("Compute");
   By hoverAndClickDesktopTab = By.xpath("//ul[@class='top-menu notmobile']//ul/li/a[contains(text(),'Desktop')]");
   By welcmText =  By.xpath("//h2[contains(text(),'Welcome to our store')]");
   By electronicsLink = By.partialLinkText("Electroni");
   By cellphoneLink = By.xpath("//ul[@class='top-menu notmobile']//ul/li/a[contains(text(),'Cell phones')]");

   public void setCellphoneLink() throws InterruptedException {
       mouseHoverAndClick(cellphoneLink);
   }
     public void setElectronicsLink() throws InterruptedException {
         mouseHover(electronicsLink);
     }
    public String setWelcmText(){
        return getTextFromElement(welcmText);
    }
   public void hoverComputerClickDesktop() throws InterruptedException {
       mouseHover(hoverComputerTab);
       mouseHoverAndClick(hoverAndClickDesktopTab);

   }

   public void selectMenu(String menu){
       switch (menu) {
           case "Computers" :
                 clickOnComputerTab();
                  break;
           case "Electronics":
                 clickOnElectronicsTab();
               break;
           case "Apparel":
                   clickOnApparelTab();
               break;
           case "Digitaldownloads":
                  clickOnDigitalDownloadTab();
               break;
           case "Books":
                    clickOnBooksTab();
               break;
           case "Jewelry":
                clickOnJewelryTab();
               break;
           case "GiftCards":
                 clickOnGiftCardsTab();
               break;
       }
   }

    public void clickOnJewelryTab(){
        clickOnElement(jewelry);
    }

    public void clickOnGiftCardsTab(){
        clickOnElement(giftCards);
    }

    public void clickOnBooksTab(){
        clickOnElement(books);
    }

    public void clickOnDigitalDownloadTab(){
        clickOnElement(digitalDownloads);
    }

    public void clickOnApparelTab(){
        clickOnElement(apparel);
    }

    public void clickOnElectronicsTab(){
        clickOnElement(electronics);
    }

   public void clickOnComputerTab(){
       clickOnElement(computer);
   }


}
