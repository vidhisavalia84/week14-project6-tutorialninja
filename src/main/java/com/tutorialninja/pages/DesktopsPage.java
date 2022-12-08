package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopsPage extends Utility {
    By desktops = By.linkText("Desktops");

    public void mouseHoverAndClickOnDesktops() {
        mouseHoverToElementAndClick(desktops);
    }

    By alldesktops = By.linkText("Show All Desktops");

    public void clickOnAllDesktops() {
        clickOnElement(alldesktops);
    }

    public ArrayList<String> getAllTheProductsFromAllDeskTopPageAndSortInReverseOrder() {
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        System.out.println("Original Products"+originalProductsName);
        // Sort By Reverse order
        Collections.reverse(originalProductsName);
       // System.out.println("After sort it to reverse order "+originalProductsName);
return originalProductsName;
    }

    By sortByZtoA =By.xpath("//select[@id='input-sort'and@class='form-control']");
public void clickOnZtoA(){
   // clickOnElement(sortByZtoA);
   // selectByVisibleTextFromDropDown(sortByZtoA,"Name (Z - A)");
    selectOptionByIndex(sortByZtoA,2);
}
    public void selectZtoAoption() {
        //selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (Z - A)");
       // selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-sort']"),"Name (A - Z)");
        selectOptionByIndex(sortByZtoA,2);
    }

    public ArrayList<String> afterFilterZtoAGetAllProduct()
    {
        selectOptionByIndex(sortByZtoA,2);
        List<WebElement> products = driver.findElements(By.xpath("//h4/a"));
        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        System.out.println(afterSortByZToAProductsName);
return afterSortByZToAProductsName;
    }
}
