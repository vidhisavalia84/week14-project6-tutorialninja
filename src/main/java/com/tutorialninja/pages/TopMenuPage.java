package com.tutorialninja.pages;

import com.tutorialninja.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TopMenuPage extends Utility {
    public void selectMenu(String menu) {
        List<WebElement> topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        try {
            for (WebElement element : topMenuList) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            topMenuList = driver.findElements(By.xpath("//nav[@id='menu']//ul/li[contains(@class, 'open')]/div/child::*"));
        }
    }

    /****************************DeskTop page****************************************************************************/
    By deskTopTab = By.linkText("Desktops");

    public void mouseHoverOnDeskTopTabAndClick() {
        mouseHoverToElementAndClick(deskTopTab);
    }

    // By allDesktops = By.xpath("//a[contains(text(),'Show All Desktops')]");

    public void selectALlDesktops() {
        // clickOnElement(allDesktops);
        selectMenu("Show All Desktops");
    }

    By verifyDesktopsText = By.xpath("//h2[contains(text(),'Desktops')]");

    //Desktops
    public String verifyDesktopsTextMessage() {
        return getTextFromElement(verifyDesktopsText);
    }


    /**************************************Laptops and Notebook page******************************************/

    By laptopAndNotebook =By.linkText("Laptops & Notebooks");
    public void mouseHoverOnlaptopAndNotebookAndClick(){
        clickOnElement(laptopAndNotebook);
    }
    public void selectOnShowAllLaptopsAndNotebook(){
        selectMenu("Show All Laptops & Notebooks");
    }
    By laptopsAndNotebooksMessage=By.xpath("//h2[contains(text(),'Laptops & Notebooks')]");
    public String verifyLaptopsAndNotebooksMessage(){
        return getTextFromElement(laptopsAndNotebooksMessage);
    }

    /***************************************Componant link***************************************/
    By componant=By.linkText("Components");

    public void mouseHoverOnComponantAndClick(){
        clickOnElement(componant);
    }
    public void selectShowAllComponant() {
        selectMenu("Show All Components");

    }
    By componantMessage= By.xpath("//h2[contains(text(),'Components')]");
    public String verifycomponantMessage(){
        return getTextFromElement(componantMessage);
    }
}
