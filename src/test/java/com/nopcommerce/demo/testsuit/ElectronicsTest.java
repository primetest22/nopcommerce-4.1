package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ElectronicsTest extends TestBase {

    //object creation
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    CheckOutCompletePage checkOutCompletePage = new CheckOutCompletePage();
    CellPhonesPage cellPhonesPage = new CellPhonesPage();
    NokiaLumiaPage nokiaLumiaPage = new NokiaLumiaPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutAsGuestPage checkOutAsGuestPage = new CheckOutAsGuestPage();
    RegisterPage registerPage = new RegisterPage();
    RegisterResultPage registerResultPage = new RegisterResultPage();
    BillingPage billingPage = new BillingPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PayMehodPage payMehodPage = new PayMehodPage();
    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();


    @Test
    public void textVerified() throws InterruptedException {
        //validate cell phones page
        homePage.setElectronicsLink();
        homePage.setCellphoneLink();
        String actCellPhoneText = cellPhonesPage.setCellPhoneText();
        Assert.assertEquals(actCellPhoneText, "Cell phones", "Not Matching");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
       //validate cell phones page
        homePage.setElectronicsLink();
        homePage.setCellphoneLink();
        String actCellPhoneText = cellPhonesPage.setCellPhoneText();
        Assert.assertEquals(actCellPhoneText, "Cell phones", "Not Matching");

        cellPhonesPage.setClkListIcon();
        Thread.sleep(1500);
        cellPhonesPage.setNokiaLink();
        nokiaLumiaPage.setQntField();
        Thread.sleep(2000);

        //update quantity
        nokiaLumiaPage.setClrQntField();
        nokiaLumiaPage.setUpdateQntField("2");
        nokiaLumiaPage.setClkAddCart();
        //validate product added to cart
        Assert.assertEquals(nokiaLumiaPage.setTopBarText(), "The product has been added to your shopping cart", "Not Matching");
        nokiaLumiaPage.setxTopBar();
        Thread.sleep(3000);
        nokiaLumiaPage.setTopShopCart();
        // click on go to cart from top
        nokiaLumiaPage.setGoToCart();

        //validate on shopping cart page
        Assert.assertEquals(shoppingCartPage.shoppingCartText(), "Shopping cart", "Not MAtching");
        Thread.sleep(2000);

        //validate quantity and total
        Assert.assertEquals(shoppingCartPage.setCheckQnt(), "(2)", "Qauntity not matching");
        Assert.assertEquals(shoppingCartPage.setSubTotalText(), "$698.00", "error");

        shoppingCartPage.shopcartTerms();
        Thread.sleep(2000);

        // click on checkout
        shoppingCartPage.clkCheckout();

        Assert.assertEquals(checkOutAsGuestPage.welcomeText(), "Welcome, Please Sign In!", "error");
        checkOutAsGuestPage.setRegisterBtn();

        //Registration details
        registerPage.enterFname("abc");
        registerPage.enterLname("xyz");
        registerPage.enteremail("uiuiui1234@yahoo.com");
        registerPage.enterPassword("password");
        registerPage.entercnfmPass("password");
        registerPage.regbtn();

        //validate registration completed
        Assert.assertEquals(registerResultPage.setRegisterText(), "Your registration completed", "error");

        registerResultPage.setCntButton();
        Assert.assertEquals(shoppingCartPage.shoppingCartText(), "Shopping cart", "error");
        Thread.sleep(3000);
        shoppingCartPage.shopcartTerms();
        Thread.sleep(3000);
        shoppingCartPage.clkCheckout();

        //billing information
        billingPage.enterFstName("abcd");
        billingPage.enterLstName("xyz");
        billingPage.enterCountry("India");
        billingPage.enterCityName("amdavad");
        billingPage.enterAddress("jdlkfjkf");
        billingPage.enterZipcode("000000");
        billingPage.enterPhone("00000000000");
        billingPage.cntButton();

        //shipping
        shippingMethodPage.shipMethod();
        shippingMethodPage.cntButton();
        
        //payment
        payMehodPage.creditCard();
        Thread.sleep(2000);
        payMehodPage.cntButton();
        Thread.sleep(1500);
        paymentInformationPage.setClkCreditCard();
        paymentInformationPage.setSelectCreditCard("Visa");
        paymentInformationPage.setHolderName("abcd");
        paymentInformationPage.setCardNumber("0000000000000000");
        paymentInformationPage.setExpMonth("09");
        paymentInformationPage.setExpYear("2025");
        paymentInformationPage.setCode("000");
        paymentInformationPage.setPayMethod();

        String expPamentText = "Payment Method: Credit Card";
        String actPamentText = confirmOrderPage.setPayCreditText();
        Assert.assertEquals(actPamentText, expPamentText, "error");

        String expShipText = "Shipping Method: Next Day Air";
        String actPayText = confirmOrderPage.setPayShipText();
        Assert.assertEquals(actPayText, expShipText, "error");

        String expTotalText = "Total: $698.00";
        String actTotalText = confirmOrderPage.setTotal();
        Assert.assertEquals(actTotalText, expTotalText, "error");

        confirmOrderPage.setCnfmButton();

        String expCnfrmText = "Thank you";
        String actCnfrmText = checkOutCompletePage.setPayConfirmationText();
        Assert.assertEquals(actCnfrmText, expCnfrmText, "error");

        String expOrderText = "Your order has been successfully processed!";
        String actOrderText = checkOutCompletePage.orderText();
        Assert.assertEquals(actOrderText, expOrderText, "error");

        checkOutCompletePage.setLogOut();

        String expwlcmText = "Welcome to our store";
        String actwlcmText = homePage.setWelcmText();
        Assert.assertEquals(actwlcmText, expwlcmText, "error");

        String currentUrl = driver.getCurrentUrl();
        //validate current url
        Assert.assertEquals(currentUrl, "https://demo.nopcommerce.com/", "error");


    }


}
