package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LaptopsAndNotebooksPage extends Utility {

   By laptopsAndNotebooks=By.linkText("Laptops & Notebooks");
   public void mouseHoverAndClickOnLaptopsAndNotebooks(){
       mouseHoverToElementAndClick(laptopsAndNotebooks);
   }
By showAllOPtion=By.linkText("Show All Laptops & Notebooks");
public void clickOnShowAllLaptopsAndNotebooks(){
    clickOnElement(showAllOPtion);
}
public void getAllProductsWithPrice(){
    List<WebElement> products = driver.findElements(By.xpath("//p[@class ='price']"));
    List<Double> originalProductsPrice = new ArrayList<>();
    for (WebElement e : products) {
        System.out.println(e.getText());
        String[] arr = e.getText().split("Ex Tax:");
        originalProductsPrice.add(Double.valueOf(arr[0].substring(1).replaceAll(",","")));
    }
    System.out.println(originalProductsPrice);
    // Sort By Reverse order
    Collections.sort(originalProductsPrice, Collections.reverseOrder());
    System.out.println(originalProductsPrice);
}
By sortBy=By.id("input-sort");
public void selectPriseHighToLowFromDropdown(){
   //selectByVisibleTextFromDropDown(By.id("input-sort"),"Price (Low > High)");
    selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (Low > High)");
   // selectOptionsByValue(sortBy,"Price (Low > High)");

}


}
