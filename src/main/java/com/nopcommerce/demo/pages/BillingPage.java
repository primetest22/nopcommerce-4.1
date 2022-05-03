package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class BillingPage extends Utility {

    By firstName = By.id("BillingNewAddress_FirstName");
    By lstName = By.id("BillingNewAddress_LastName");
    By email = By.id("BillingNewAddress_Email");
    By country = By.xpath("//select[@id='BillingNewAddress_CountryId']");
    By city = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By zipCode = By.id("BillingNewAddress_ZipPostalCode");
    By phone = By.id("BillingNewAddress_PhoneNumber");
    By cntButton = By.xpath("//div[@id='billing-buttons-container']//button[contains(text(),'Continue')]");


        public void cntButton () {
            clickOnElement(cntButton);
        }
        public void enterFstName (String fstName){
            sendTextToElement(firstName, fstName);
        }
        public void enterLstName (String lastName){
            sendTextToElement(lstName, lastName);
        }
        public void enterEmailName (String emailId){
            sendTextToElement(email, emailId);
        }
        public void enterCountry (String count){
            selectByVisibleTextFromDropDown(country, count);
        }
        public void enterCityName (String City){
            sendTextToElement(city, City);
        }
        public void enterAddress (String adrs){
            sendTextToElement(address, adrs);
        }
        public void enterZipcode (String zip){
            sendTextToElement(zipCode, zip);
        }
        public void enterPhone (String phn){
            sendTextToElement(phone, phn);
        }

    }





