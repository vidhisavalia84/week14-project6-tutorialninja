package com.tutorialninja.testsuite;

import com.tutorialninja.browserfactory.ManageBrowser;
import com.tutorialninja.pages.DesktopsPage;
import com.tutorialninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DesktopsPageTest extends BaseTest {
    DesktopsPage desktopsPage=new DesktopsPage();


    @Test
    public void verifyProductArrangeInAlphaBaticalOrder()throws InterruptedException {
        desktopsPage.mouseHoverAndClickOnDesktops();
        desktopsPage.clickOnAllDesktops();
        //desktopsPage.getAllTheProductsFromAllDeskTopPageAndSortInReverseOrder();
        Thread.sleep(2000);
        String aftersort= String.valueOf(desktopsPage.getAllTheProductsFromAllDeskTopPageAndSortInReverseOrder());
       // desktopsPage.clickOnZtoA();
        desktopsPage.selectZtoAoption();
        desktopsPage.afterFilterZtoAGetAllProduct();
       // String aftersort= String.valueOf(desktopsPage.getAllTheProductsFromAllDeskTopPageAndSortInReverseOrder());
        String afterclickZtoA= String.valueOf(desktopsPage.afterFilterZtoAGetAllProduct());
        //Assert.assertEquals(desktopsPage.getAllTheProductsFromAllDeskTopPageAndSortInReverseOrder(),desktopsPage.afterFilterZtoAGetAllProduct());
//Assert.assertEquals(desktopsPage.getAllTheProductsFromAllDeskTopPageAndSortInReverseOrder(),desktopsPage.selectZtoAoption());

    Assert.assertEquals(aftersort,afterclickZtoA);
    }



}
