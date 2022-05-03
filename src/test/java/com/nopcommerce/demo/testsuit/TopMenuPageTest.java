package com.nopcommerce.demo.testsuit;


import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuPageTest extends TestBase {
    //object creation
    HomePage homePage = new HomePage();
    ComputerPage computerPage = new ComputerPage();
    ApparelPage apparelPage = new ApparelPage();
    BooksPage booksPage = new BooksPage();
    DigitalDownloadsPage digitalDownloadsPage = new DigitalDownloadsPage();
    ElectronicsPage electronicsPage = new ElectronicsPage();
    JewelryPage jewelryPage = new JewelryPage();
    GiftCardsPage giftCardsPage = new GiftCardsPage();

    @Test
    public void verifyPageNavigation() throws InterruptedException {
        //click computers tab and validate
        homePage.selectMenu("Computers");
        String expectedText = "Computers";
        String actualText = computerPage.verifyComputerText();
        Assert.assertEquals(actualText, expectedText, "Not Matching");

        Thread.sleep(3000);
        //click Apparel tab and validate
        homePage.selectMenu("Apparel");
        String expectedText1 = "Apparel";
        String actualText1 = apparelPage.verifyApparelText();
        Assert.assertEquals(actualText1, expectedText1, "Not Matching");

        Thread.sleep(3000);
        //click Digital downloads tab and validate
        homePage.selectMenu("Digital downloads");
        String expectedText3 = "Digital downloads";
        String actualText3 = digitalDownloadsPage.verifyDigitalDownloadText();
        Assert.assertEquals(actualText3, expectedText3, "Not Matching");

        Thread.sleep(3000);
        //click Books tab and validate
        homePage.selectMenu("Books");
        String expectedText2 = "Books";
        String actualText2 = booksPage.verifyBooksText();
        Assert.assertEquals(actualText2, expectedText2, "Not Matching");

        Thread.sleep(3000);
        //click Electronics tab and validate
        homePage.selectMenu("Electronics");
        String expectedText4 = "Electronics";
        String actualText4 = electronicsPage.verifyElectronicsText();
        Assert.assertEquals(actualText4, expectedText4, "Not Matching");

        Thread.sleep(3000);
        //click Jewelry tab and validate
        homePage.selectMenu("Jewelry");
        String expectedText5 = "Jewelry";
        String actualText5 = jewelryPage.verifyJewelryText();
        Assert.assertEquals(actualText5, expectedText5, "Not Matching");

        Thread.sleep(3000);
        //click Gift cards tab and validate
        homePage.selectMenu("Gift cards");
        String expectedText6 = "Gift cards";
        String actualText6 = giftCardsPage.verifyGiftCardsText();
        Assert.assertEquals(actualText5, expectedText5, "Not Matching");


    }


}


