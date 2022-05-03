package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.TestBase;
import org.checkerframework.checker.units.qual.A;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopPageTest extends TestBase {

    HomePage homePage = new HomePage();
    DesktopPage desktopPage = new DesktopPage();

    @Test
    public void  verifyProductsArrangedDescendingOrder() throws InterruptedException {

        homePage.hoverComputerClickDesktop();
        desktopPage.selectZtoAoption("Name: Z to A");
        String expectedText = "Name: Z to A";
        String actualText = desktopPage.validateZtoAorder();
        Assert.assertEquals(actualText,expectedText,"Not Matching");

    }

}


