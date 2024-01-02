package com.automationexercise.steps;

import com.automationexercise.pages.CategoryPage;
import com.automationexercise.pages.ContactPage;
import com.automationexercise.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ContactUsSteps {
    @When("Click on {string} button")
    public void clickOnContactUsButton(String contact) {
        new ContactPage().clickOnContactUs();
    }

    @And("Verify GET IN TOUCH is visible")
    public void verifyGETINTOUCHIsVisible() {
        String actualText = new ContactPage().verifyGetInTouch();
        Assert.assertEquals(actualText, "GET IN TOUCH");
    }

    @Then("Enter {string},{string},{string},{string}")
    public void enter(String name, String email, String subject, String message) {
        new ContactPage().enterName(name);
        new ContactPage().enterEmail(email);
        new ContactPage().enterSubject(subject);
        new ContactPage().enterMessage(message);
    }

    @And("Upload file")
    public void uploadFile() {
        new ContactPage().uploadFile();
    }

    @And("Click Submit button")
    public void clickSubmitButton() {
        new ContactPage().clickOnSubmit();
    }

    @And("Click OK button")
    public void clickOKButton() {
        new ContactPage().acceptPopupMessage();
    }

    @And("Verify success message {string} is visible")
    public void verifySuccessMessageSuccessYourDetailsHaveBeenSubmittedSuccessfullyIsVisible(String text) {
        String actualText2 = new ContactPage().verifySuccessText();
        Assert.assertEquals(actualText2, "Success! Your details have been submitted successfully.");
    }

    @And("Click {string} button and verify that landed to home page successfully")
    public void clickHomeButtonAndVerifyThatLandedToHomePageSuccessfully(String home) {
        new ContactPage().clickOnHomeButton();
    }


    @When("I click on products tab")
    public void iClickOnProductsTab() throws InterruptedException {
        Thread.sleep(5000);
        new ProductPage().clickOnProduct();
    }
    @Then("I click on Women category")
    public void iClickOnWomenCategory() throws InterruptedException {
        Thread.sleep(5000);
        new CategoryPage().clickOnWomen();
    }

    @And("I click on Dress in women category")
    public void iClickOnDressInWomenCategory() {
        new CategoryPage().clickOnDress();
    }

    @And("I should see {string} page title")
    public void iShouldSeePageTitle(String dress) {
        String actualText = new CategoryPage().verifyWomenTopsProductText();
        Assert.assertEquals(actualText, "WOMEN - DRESS PRODUCTS");
    }

    @Then("I click on Men category")
    public void iClickOnMenCategory() {
        new CategoryPage().clickOnMen();
    }

    @And("I click on T-shirts in men category")
    public void iClickOnTshirtsInMenCategory() {
        new CategoryPage().clickOnTShirt();
    }

    @And("I should see MEN - T-shirts PRODUCTS page title")
    public void iShouldSeeMENTSHIRTSPRODUCTSPageTitle() {
        String actualText1 = new CategoryPage().verifyMenTShirtProductsText();
        Assert.assertEquals(actualText1, "MEN - T-shirts PRODUCTS");
    }
}
