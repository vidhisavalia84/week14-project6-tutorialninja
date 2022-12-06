package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class LaptopsAndNotebooksPage1 extends Utility {
    By currency = By.xpath("//span[contains(text(),'Currency')]");

    public void clickOnCurrencyAndSelectPoundSterling() {
        clickOnElement(currency);
        List<WebElement> currencyList = driver.findElements(By.xpath("//ul[@class = 'dropdown-menu']/li"));
        for (WebElement e : currencyList) {
            if (e.getText().equalsIgnoreCase("£ Pound Sterling")) {
                e.click();
                break;
            }
        }
    }

    By laptopsAndNotebooks = By.linkText("Laptops & Notebooks");

    public void mouseHoverAndClickOnlaptopsAndNotebooks() {
        mouseHoverToElementAndClick(laptopsAndNotebooks);
    }

    By allLaptops = By.linkText("Show All Laptops & Notebooks");

    public void clickOnShowAllLaptops() {
        clickOnElement(allLaptops);
    }

    public void selectPrice() {
        selectByVisibleTextFromDropDown(By.id("input-sort"), "Price (High > Low)");
    }

    By sortBy = By.id("input-sort");

    public void clickOnSortBy() {
        sendTextToElement(sortBy, "Price (High > Low)");
    }

    By macBook = By.linkText("MacBook");

    public void clickOnMacBook() {
        clickOnElement(macBook);
    }

    By macBookMessage = By.xpath("//h1[contains(text(),'MacBook')]");

    public String verifyMacBookMessage() {
        return getTextFromElement(macBookMessage);
    }

    By cartButton = By.xpath("//button[@id='button-cart']");

    public void clickOnAddToCart() {
        clickOnElement(cartButton);
    }

    By successMessage = By.cssSelector("body:nth-child(2) div.container:nth-child(4) > div.alert.alert-success.alert-dismissible");

    public String verifySuccessfulMessage() {
        return getTextFromElement(successMessage);
    }

    By shoppingCart = By.xpath("//a[contains(text(),'shopping cart')]");

    public void clickOnShoppingCartLink() {
        clickOnElement(shoppingCart);
    }

    By shoppingCartMessage = By.xpath("//h1[contains(text(),' (0.00kg)')]");

    //shopping cart
    public String verifyShoppingCartMessage() {
        return getTextFromElement(shoppingCartMessage);
    }

    By macBookText = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");

    //MacBook
    public String verifyMacBookText() {
        return getTextFromElement(macBookText);
    }

    By quantity = By.xpath("//input[contains(@name, 'quantity')]");

    //2
    public void clearQuantityAndSendQuantity(String num) {
        Actions actions = new Actions(driver);
        driver.findElement(quantity).clear();
        //clickOnElement(quantity);
        sendTextToElement(quantity, num);
    }

    By update = By.xpath("//button[contains(@data-original-title, 'Update')]");

    public void clickOnUpadte() {
        clickOnElement(update);
    }

    By modifiedMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");

    //Success: You have modified your shopping cart!\n"+"×
    public String verifyModifiedMessage() {
        return getTextFromElement(modifiedMessage);
    }

    By text = By.xpath("//tbody/tr[1]/td[6]");

    //$1,204.00
    public String verifyText() {
        return getTextFromElement(text);
    }

    By textCheckout = By.xpath("//a[contains(text(),'Checkout')]");

    public void clickCheckout() {
        clickOnElement(textCheckout);
    }

    By newCustomer = By.xpath("//h2[contains(text(),'New Customer')]");

    //New Customer
    public String verifyTextNewCustomer() {
        return getTextFromElement(newCustomer);
    }

    By guestRadioButton = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/label[1]/input[1]");

    public void clickGuestRadioButton() {
        clickOnElement(guestRadioButton);
    }

    By continue1 = By.xpath("//input[@id='button-account']");

    public void clickContinue1() {
        clickOnElement(continue1);
    }
/*By firstName=By.id("");
    public void enter(){
        sendTextToElement(,"");
    }*/

    By firstName = By.id("input-payment-firstname");

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name);
    }

    By lastName = By.id("input-payment-lastname");

    public void enterLastName(String name) {
        sendTextToElement(lastName, name);
    }

    By email = By.id("input-payment-email");

    public void enterEmail(String email1) {
        sendTextToElement(email, email1);
    }


    By telephone = By.id("input-payment-telephone");

    public void enterTelephoneNumber(String num) {
        sendTextToElement(telephone, num);
    }

    By company = By.id("input-payment-company");

    public void enterCompanyName(String name) {
        sendTextToElement(company, name);
    }

    By address = By.id("input-payment-address-1");

    public void enterAddress(String add) {
        sendTextToElement(address, add);
    }

    By city = By.id("input-payment-city");

    public void enterCity(String c) {
        sendTextToElement(city, c);
    }

    By postcode = By.id("input-payment-postcode");

    public void enterPostcode(String num) {
        sendTextToElement(postcode, num);
    }

    By country = By.xpath("//select[@id='input-payment-country']");

    public void selectCountry() {
        selectByVisibleTextFromDropDown(country, "Antarctica");
    }

    public void selectZone() {
        selectByVisibleTextFromDropDown(By.xpath("//select[@id='input-payment-zone']"), "Berkshire");
    }

    By continue2 = By.xpath("//input[@id='button-guest']");

    public void clickOnContinue2() {
        clickOnElement(continue2);
    }

    By termsAndCondition = By.xpath("//body/div[@id='checkout-checkout']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/input[1]");

    public void clickOnTermsAndCondition() {
        clickOnElement(termsAndCondition);
    }

    By continue3=By.xpath("//input[@id='button-payment-method']");

    public void clickOnContinue3() {
        clickOnElement(continue3);
    }

By lastMessage=By.xpath("//div[@class='alert alert-danger alert-dismissible']");
//Warning: Payment method required!\n"+"×
    public String lastMessage(){
        return getTextFromElement(lastMessage);
    }













}
