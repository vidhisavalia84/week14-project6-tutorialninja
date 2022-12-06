package com.tutorialninja.testsuite;

import com.tutorialninja.pages.TopMenuPage;
import com.tutorialninja.testbase.BaseTest;
import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TopMenuPageTest extends BaseTest  {
TopMenuPage topMenuPage=new TopMenuPage();

@Test
public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
    topMenuPage.mouseHoverOnDeskTopTabAndClick();
    topMenuPage.selectALlDesktops();
    Assert.assertEquals(topMenuPage.verifyDesktopsTextMessage(),"Desktops");
}
@Test
public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
    topMenuPage.mouseHoverOnlaptopAndNotebookAndClick();
    topMenuPage.selectOnShowAllLaptopsAndNotebook();
    Assert.assertEquals(topMenuPage.verifyLaptopsAndNotebooksMessage(),"Laptops & Notebooks");
}
@Test
public void verifyUserShouldNavigateToComponentsPageSuccessfully()throws InterruptedException{
    topMenuPage.mouseHoverOnComponantAndClick();
    topMenuPage.selectShowAllComponant();
    Thread.sleep(2000);
    Assert.assertEquals(topMenuPage.verifycomponantMessage(),"Components");
}
}