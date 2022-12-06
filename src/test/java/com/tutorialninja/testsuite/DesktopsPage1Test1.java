package com.tutorialninja.testsuite;

import com.tutorialninja.pages.DesktopsPage1;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsPage1Test1 extends BaseTest {
    DesktopsPage1 desktopsPage1 = new DesktopsPage1();

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        desktopsPage1.clickOnCurrencyButton();
        desktopsPage1.selectCurrencyFromDropDown();
        desktopsPage1.mouseHoverAndClickOnDesktops();
        desktopsPage1.clickOnShowAllLoptions();
        Thread.sleep(2000);
        desktopsPage1.selectAtoZFromDropDown();
        desktopsPage1.clickOnHP();
        Assert.assertEquals(desktopsPage1.verifyHPMessage(), "HP LP3065", " Product not display");
        desktopsPage1.selectDeleveryDate();
        desktopsPage1.clearQuantityAndSendQuantity("1");
        desktopsPage1.clickOnAddButton();
        //Assert.assertEquals(desktopsPage1.verifySuccessfullMessage(), "Success: You have added HP LP3065 to your shopping cart!");
        desktopsPage1.clickOnShoppingCart();
        Thread.sleep(2000);
        desktopsPage1.clickOnShoppingCartLink();
        Assert.assertEquals(desktopsPage1.verifyShoppinCartMessage(), "Shopping Cart  (1.00kg)");
        Assert.assertEquals(desktopsPage1.verifyProductName(), "HP LP3065");
        Assert.assertEquals(desktopsPage1.verifyProduct21(), "Product 21");
        Assert.assertEquals(desktopsPage1.verifyTotal(), "£74.73");
    }
}