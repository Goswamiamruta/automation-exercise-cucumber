package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends Utility {
    private static final Logger log = LogManager.getLogger(NewLoginPage.class.getName());


    @CacheLookup
    @FindBy(xpath = "//input[@id='search_product']")
    WebElement searchProduct;

    @CacheLookup
    @FindBy(xpath = "//i[@class='fa fa-search']")
    WebElement searchButton;

    @CacheLookup
    @FindBy(xpath = "//h2[normalize-space()='Searched Products']")
    WebElement searchedProductText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='productinfo text-center']//p[contains(text(),'Men Tshirt')]")
    WebElement menTShirtText;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cart']")
    WebElement cart;

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Men Tshirt']")
    WebElement menTShirtShoppingCartText;

    public void enterProductName(String name){
        log.info("Enter product Name " + searchProduct.toString());
        sendTextToElement(searchProduct, name);
    }

    public void clickOnSearchButton(){
        log.info("Click On search button " + searchButton.toString());
        clickOnElement(searchButton);
    }

    public String verifySearchedProductText(){
        log.info("Verify searched Product " + searchedProductText.toString());
        return getTextFromElement(searchedProductText);
    }

    public String verifyMenTShirtText(){
        log.info("Verify Men TShirt Text " + menTShirtText.toString());
        return getTextFromElement(menTShirtText);
    }

    public void clickOnCartLink(){
        log.info("Click on cart " + cart.toString());
        clickOnElement(cart);
    }
    public String verifyMenTShirtShoppingCartText(){
        log.info("Verify men TShirt text " + menTShirtShoppingCartText.toString());
        return getTextFromElement(menTShirtShoppingCartText);
    }


}
