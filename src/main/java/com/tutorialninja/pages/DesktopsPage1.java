package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class DesktopsPage1 extends Utility {
    By currency = By.xpath("//span[contains(text(),'Currency')]");

    public void clickOnCurrencyButton() {
        clickOnElement(currency);
    }

    By listOfCurrency = By.xpath("//ul[@class = 'dropdown-menu']/li");

    public void selectCurrencyFromDropDown() {
        List<WebElement> currencyList = driver.findElements(listOfCurrency);
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }
    }

    By desktops = By.linkText("Desktops");

    public void mouseHoverAndClickOnDesktops() {
        clickOnElement(desktops);
    }

    By allLaptops = By.linkText("Show All Desktops");

    public void clickOnShowAllLoptions() {
        clickOnElement(allLaptops);
    }

    By dropdown = By.id("input-sort");

    public void selectAtoZFromDropDown() {
        // selectByVisibleTextFromDropDown(By.id("input-sort"), "Name (A - Z)");
        sendTextToElement(dropdown, "Name (Z - A)");
        //selectOptionsByValue(dropdown,"http://tutorialsninja.com/demo/index.php?route=product/category&path=18&sort=pd.name&order=ASC");

    }

    By hp = By.xpath("//a[contains(text(),'HP LP3065')]");

    public void clickOnHP() {
        clickOnElement(hp);
    }

    By hPMessage = By.xpath("//h1[contains(text(),'HP LP3065')]");

    public String verifyHPMessage() {
        return getTextFromElement(hPMessage);
    }

    By monthYear = By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']");

    public void selectDeleveryDate() {
        String year = "2023";
        String month = "November";
        String date = "30";
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {

            String monthAndYear = driver.findElement(monthYear).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }

    By quantity = By.xpath("//input[@id='input-quantity']");

    public void clearQuantityAndSendQuantity(String num) {
        Actions actions = new Actions(driver);
        driver.findElement(quantity).clear();
        //clickOnElement(quantity);
        sendTextToElement(quantity, num);
    }

    By addButton = By.xpath("//button[@id='button-cart']");

    public void clickOnAddButton() {
        clickOnElement(addButton);
    }

    By successMessage = By.cssSelector("siblbody:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismise");

    public String verifySuccessfullMessage() {
        return getTextFromElement(successMessage);
    }

    By shoppingCart = By.xpath("//button[@id='button-cart']");

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCartLink);
    }


    By shoppinCartMessage = By.xpath("//h1[contains(text(),' (1.00kg)')]");

    //Shopping Cart  (1.00kg)
    public String verifyShoppinCartMessage() {
        return getTextFromElement(shoppinCartMessage);
    }

    By productName = By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.table-responsive table.table.table-bordered tbody:nth-child(2) tr:nth-child(1) td.text-left:nth-child(2) > a:nth-child(1)");
//HP LP3065
    public String verifyProductName() {
        return getTextFromElement(productName);
    }
By model21=By.cssSelector("div.container:nth-child(4) div.row div.col-sm-12 div.table-responsive table.table.table-bordered tbody:nth-child(2) tr:nth-child(1) > td.text-left:nth-child(3)");
//Product 21
    public String verifyProduct21(){
    return getTextFromElement(model21);
}
By total=By.xpath("//tbody/tr[1]/td[6]");
    //£74.73
    public String verifyTotal(){
         return getTextFromElement(total);
    }















}
