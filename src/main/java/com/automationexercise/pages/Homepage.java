package com.automationexercise.pages;

import com.automationexercise.utility.Utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Homepage extends Utility {
    private static final Logger log = LogManager.getLogger(Homepage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Home']")
    WebElement homePageLink;

    @CacheLookup
    @FindBy(css = "a[href='/login']")
    WebElement signUpLink;

    @CacheLookup
    @FindBy(xpath = "/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/h2[1]")
    WebElement newUserSignUpText;

    @CacheLookup
    @FindBy (xpath = "//ul[@class='nav navbar-nav']/li")
    List<WebElement> headerTabs;
    @CacheLookup
    @FindBy (xpath = "//h2[normalize-space()='Subscription']")
    WebElement subscriptionText;

    @CacheLookup
    @FindBy (xpath = "//input[@id='susbscribe_email']")
    WebElement subscriptionEmail;

    @CacheLookup
    @FindBy (xpath = "//i[@class='fa fa-arrow-circle-o-right']")
    WebElement subscriptionArrowButton;

    @CacheLookup
    @FindBy (xpath = "//div[@class='alert-success alert']")
    WebElement subscriptionSuccessMessage;
    @CacheLookup
    @FindBy (xpath = "//h2[normalize-space()='recommended items']")
    WebElement recommendedItemsText;
    @CacheLookup
    @FindBy (xpath = "//i[@class='fa fa-angle-up']")
    WebElement bottomRightArrowButton;

    @CacheLookup
    @FindBy (xpath = "//div[@class='item active']//h2[contains(text(),'Full-Fledged practice website for Automation Engin')]")
    WebElement fullFledgedText;




    public String verifyHomePage(){
        log.info("Verify HomePagelink " + homePageLink.toString());
        return getTextFromElement(homePageLink);
    }

    public void clickOnSignUpLink(){
        clickOnElement(signUpLink);
        log.info("click on signUpLink " + signUpLink.toString());
    }

    public String verifyNewUserSignUpText(){
        log.info("Verify new user signup " + newUserSignUpText.getText());
        return getTextFromElement(newUserSignUpText);
    }
    public void clickOnHeaderTab(String option){
        for (WebElement op: headerTabs) {
            //System.out.println(op.getText());
            if(op.getText().equalsIgnoreCase(option)){
                op.click();
                log.info("CLicking on " + option + " header tab : " + headerTabs.toString());
                break;
            }
        }
    }
    public void scrollDownToSubscriptionLink() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", subscriptionText);
        log.info("Scroll Down to Subscription");
    }

    public void scrollDownToRecommendedItems() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", recommendedItemsText);
        log.info("Scroll Down to recommended items");
    }

    public void scrollUp() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,0)", "");
        log.info("Scroll up to (0,0)");
    }

    public String getSubscriptionText() {
        log.info("Getting Subscription text : " + subscriptionText.toString());
        return getTextFromElement(subscriptionText);
    }

    public void sendDataToSubscriptionEmail(String email) {
        sendTextToElement(subscriptionEmail, email);
        log.info("Sending " + email + " to subscription email field : " + subscriptionEmail.toString());
    }

    public void  clickOnArrowToSubscribe() {
        clickOnElement(subscriptionArrowButton);
        log.info("Clicking on subscription arrow button : " + subscriptionArrowButton.toString());
    }

    public String getSubscriptionSuccessMessage() {
        log.info("Getting subscription success message : " + subscriptionSuccessMessage.toString());
        return getTextFromElement(subscriptionSuccessMessage);
    }
    public void clickOnBottomRightArrowButton() {
        log.info("Clicking on bottom right corner arrow button : " + bottomRightArrowButton.toString());
        clickOnElement(bottomRightArrowButton);
    }

    public String getFullFledgedText() {
        log.info("Getting full fledged text from top of the page : " + fullFledgedText.toString());
        return getTextFromElement(fullFledgedText);
    }


}