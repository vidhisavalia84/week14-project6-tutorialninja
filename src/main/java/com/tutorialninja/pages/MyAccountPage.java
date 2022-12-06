package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccountPage extends Utility {
    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }

    By myAccount = By.xpath("//span[contains(text(),'My Account')]");

    public void clickonMyAccount() {
        clickOnElement(myAccount);
    }

    By register = By.xpath("//h1[contains(text(),'Register Account')]");

    public String verifyRegisterText() {
        return getTextFromElement(register);

    }

    By returning = By.xpath("//h2[contains(text(),'Returning Customer')]");

    public String verifyReturningText() {
        return getTextFromElement(returning);

    }

    By firstName = By.id("input-firstname");

    public void enterFirstName(String name) {
        sendTextToElement(firstName, name+getAlphaNumericString(3));
    }

    By lastName = By.id("input-lastname");

    public void enterLastName(String lastname) {
        sendTextToElement(lastName,lastname+getAlphaNumericString(2));
    }

    By email = By.id("input-email");

    public void enterEmailAddress(String email1) {
        sendTextToElement(email, email1);
    }

    By phone = By.id("input-telephone");

    public void enterPhoneNumber(String num) {
        sendTextToElement(phone, num);
    }

    By password = By.id("input-password");

    public void enterPassword(String num) {
        sendTextToElement(password, num);
    }

    By confirmPass = By.id("input-confirm");

    public void enterConfirmPassword(String num) {
        sendTextToElement(confirmPass, num);
    }

    By newsLetter = By.xpath("//input[@name='newsletter']");

    public void clickOnNewsLetterButton() {
        clickOnElement(newsLetter);
    }

    By privacyPolicy = By.xpath("//div[@class = 'buttons']//input[@name='agree']");

    public void clickOnPrivacyPolicy() {
        clickOnElement(privacyPolicy);
    }

    By continue1 = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");

    public void clickOnContinue1() {
        clickOnElement(continue1);
    }

    By accountCreated = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");

    public String verifyMessageYourAccount() {
        return getTextFromElement(accountCreated);

    }

    By continue3 = By.xpath("//a[contains(text(),'Continue')]");

    public void clickOnContinue3() {
        clickOnElement(continue3);
    }

    By myAccountLink = By.xpath("//span[contains(text(),'My Account')]");

    public void clickOnMyAccountLink() {
        clickOnElement(myAccountLink);
    }
//Call the method “selectMyAccountOptions” method and pass the parameter
//“Logout”
    By logout = By.xpath("//h1[contains(text(),'Account Logout')]");
//Account Logout
    public String verifyLogoutText() {
        return getTextFromElement(logout);

    }

    By continue4 = By.xpath("//a[contains(text(),'Continue')]");

    public void clickOnContinue4() {
        clickOnElement(continue4);
    }

    By loginButton = By.xpath("//form[contains(@action,'login')]//input[@type='submit']");

    public void clickOnLogin() {
        clickOnElement(loginButton);

    }



}
