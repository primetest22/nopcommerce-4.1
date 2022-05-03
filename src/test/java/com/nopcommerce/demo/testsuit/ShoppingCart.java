package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCart extends TestBase {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();
    BuildYourOwnComputerPage buildYourOwnComputerPage = new BuildYourOwnComputerPage();
    ShoppingCartPage shoppingCart = new ShoppingCartPage();
    CheckOutAsGuestPage checkOutAsGuestPage = new CheckOutAsGuestPage();
    BillingPage billingPage = new BillingPage();
    ShippingMethodPage shippingMethodPage = new ShippingMethodPage();
    PayMehodPage payMehodPage = new PayMehodPage();
    PaymentInformationPage paymentInformationPage = new PaymentInformationPage();
    ConfirmOrderPage confirmOrderPage = new ConfirmOrderPage();
    CheckOutCompletePage checkOutCompletePage = new CheckOutCompletePage();

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        //arranged products A to Z
        homePage.hoverComputerClickDesktop();
        desktopPage.selectZtoAoption("Name: A to Z");
        Thread.sleep(1500);
        desktopPage.addCart();

        //validate product selected
        String expectedText = "Build your own computer";
        String actualText = buildYourOwnComputerPage.verifyBuildComputerText();
        Assert.assertEquals(actualText, expectedText, "Text not matching");

        //select correct processor
        buildYourOwnComputerPage.selectPentium("2.2 GHz Intel Pentium Dual-Core E2200");
        //select ram
        buildYourOwnComputerPage.selectRamCap("8GB [+$60.00]");
        //select hdd radio button
        buildYourOwnComputerPage.selectHddRadio();
        //select os radio button
        buildYourOwnComputerPage.osRadio();
        Thread.sleep(5000);
        buildYourOwnComputerPage.checkBox();
        Thread.sleep(2000);
        //validate total
        String expectedTotalPriceText = "$1,475.00";
        String actualTotalPriceText = buildYourOwnComputerPage.verifyTotalPrice();
        Thread.sleep(5000);
        Assert.assertEquals(actualTotalPriceText, expectedTotalPriceText, "error");

        buildYourOwnComputerPage.buildAddCart();

        //validate product added to shopping cart
        String expTopBarText = "The product has been added to your shopping cart";
        
        String actTopBarText = buildYourOwnComputerPage.topBarText();
        Assert.assertEquals(actTopBarText, expTopBarText, "error");
        buildYourOwnComputerPage.closeTopBar();
        Thread.sleep(2000);
        buildYourOwnComputerPage.topCart();
        Thread.sleep(2000);
        buildYourOwnComputerPage.clickTopCart();

        String expShoppingCartText = "Shopping cart";
        String actShoppingCartText = shoppingCart.shoppingCartText();
        Assert.assertEquals(actShoppingCartText, expShoppingCartText, "error");

        shoppingCart.updateCart();
        Thread.sleep(2000);
        shoppingCart.changeQnt();
        shoppingCart.newQnt("2");
        shoppingCart.updateShopCart();

        String expUpdateCartTotalText = "Total: $2,950.00";
        String actUpdateCartTotalText = shoppingCart.updatecartTotalText();
        Assert.assertEquals(actUpdateCartTotalText, expUpdateCartTotalText, "error");
        Thread.sleep(3000);
        shoppingCart.shopcartTerms();
        Thread.sleep(3000);
        shoppingCart.clkCheckout();

        String expWelcomeText = "Welcome, Please Sign In!";
        String actWelcomeText = checkOutAsGuestPage.welcomeText();
        Assert.assertEquals(actWelcomeText, expWelcomeText, "error");
        checkOutAsGuestPage.clkAsGuest();

        //billing information
        billingPage.enterFstName("abcd");
        billingPage.enterLstName("xyz");
        billingPage.enterEmailName("billing10@yahoo.com");
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
        paymentInformationPage.setSelectCreditCard("Master card");
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

        String expTotalText = "Total: $2,950.00";
        String actTotalText = confirmOrderPage.setTotal();
        Assert.assertEquals(actTotalText, expTotalText, "error");

        confirmOrderPage.setCnfmButton();

        String expCnfrmText = "Thank you";
        String actCnfrmText = checkOutCompletePage.setPayConfirmationText();
        Assert.assertEquals(actCnfrmText, expCnfrmText, "error");

        String expOrderText = "Your order has been successfully processed!";
        String actOrderText = checkOutCompletePage.orderText();
        Assert.assertEquals(actOrderText, expOrderText, "error");

        checkOutCompletePage.setCntButton();

        String expwlcmText = "Welcome to our store";
        String actwlcmText = homePage.setWelcmText();
        Assert.assertEquals(actwlcmText, expwlcmText, "error");

    }

}
