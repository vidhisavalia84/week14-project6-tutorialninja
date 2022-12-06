package com.tutorialninja.testsuite;

import com.tutorialninja.pages.LaptopsAndNotebooksPage;
import com.tutorialninja.pages.LaptopsAndNotebooksPage1;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LaptopsAndNotebookPageTest extends BaseTest {

    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    LaptopsAndNotebooksPage1 laptopsAndNotebooksPage1 = new LaptopsAndNotebooksPage1();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {
        laptopsAndNotebooksPage.mouseHoverAndClickOnLaptopsAndNotebooks();
        laptopsAndNotebooksPage.clickOnShowAllLaptopsAndNotebooks();
        laptopsAndNotebooksPage.getAllProductsWithPrice();
        Thread.sleep(2000);
        laptopsAndNotebooksPage.selectPriseHighToLowFromDropdown();
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {
        laptopsAndNotebooksPage1.clickOnCurrencyAndSelectPoundSterling();
        laptopsAndNotebooksPage1.mouseHoverAndClickOnlaptopsAndNotebooks();
        laptopsAndNotebooksPage1.clickOnShowAllLaptops();
        //laptopsAndNotebooksPage1.selectPrice();
        laptopsAndNotebooksPage1.clickOnSortBy();
        laptopsAndNotebooksPage1.clickOnMacBook();
        Assert.assertEquals(laptopsAndNotebooksPage1.verifyMacBookMessage(), "MacBook");
        laptopsAndNotebooksPage1.clickOnAddToCart();
        // Assert.assertEquals(laptopsAndNotebooksPage1.verifySuccessfulMessage(),"Success: You have added MacBook to your shopping cart!");
        laptopsAndNotebooksPage1.clickOnShoppingCartLink();
        Assert.assertEquals(laptopsAndNotebooksPage1.verifyShoppingCartMessage(), "Shopping Cart  (0.00kg)");
        Assert.assertEquals(laptopsAndNotebooksPage1.verifyMacBookText(), "MacBook");
        laptopsAndNotebooksPage1.clearQuantityAndSendQuantity("2");
        laptopsAndNotebooksPage1.clickOnUpadte();
        Assert.assertEquals(laptopsAndNotebooksPage1.verifyModifiedMessage(), "Success: You have modified your shopping cart!" + "\n×");
        Assert.assertEquals(laptopsAndNotebooksPage1.verifyText(), "£737.45");
        laptopsAndNotebooksPage1.clickCheckout();
//Assert.assertEquals(laptopsAndNotebooksPage1.verifyTextCheckout(),"Checkout");
        Assert.assertEquals(laptopsAndNotebooksPage1.verifyTextNewCustomer(), "New Customer");
        laptopsAndNotebooksPage1.clickGuestRadioButton();
        laptopsAndNotebooksPage1.clickContinue1();
        laptopsAndNotebooksPage1.enterFirstName("Reva");
        laptopsAndNotebooksPage1.enterLastName("Patel");
        laptopsAndNotebooksPage1.enterEmail("RavaP@gmail.com");
        laptopsAndNotebooksPage1.enterTelephoneNumber("07896584569");
        laptopsAndNotebooksPage1.enterCompanyName("Telepad");
        laptopsAndNotebooksPage1.enterAddress("123 block");
        laptopsAndNotebooksPage1.enterCity("Agra");
        laptopsAndNotebooksPage1.enterPostcode("SA1 W32");
       // laptopsAndNotebooksPage1.selectCountry();
        laptopsAndNotebooksPage1.selectZone();
        laptopsAndNotebooksPage1.clickOnContinue2();
        laptopsAndNotebooksPage1.clickOnTermsAndCondition();
        laptopsAndNotebooksPage1.clickOnContinue3();
        Assert.assertEquals(laptopsAndNotebooksPage1.lastMessage(),"Warning: Payment method required!\n"+"×");





    }


}
