package com.automationexercise.steps;


import com.automationexercise.pages.Homepage;
import com.automationexercise.pages.LoginPage;
import com.automationexercise.pages.NewLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginSteps {
        @When("Click Signup link")
        public void clickSignupLink() {
            new Homepage().clickOnSignUpLink();
        }

        @Then("Verify Login to your account is visible")
        public void verifyLoginToYourAccountIsVisible() {
            new NewLoginPage().verifyLoginText();
        }

        @And("Enter {string} email address and {string} password")
        public void enterEmailAddressAndPassword(String email, String password) {
            new NewLoginPage().enterLoginEmail(email);
            new NewLoginPage().enterLoginPassword(password);
        }

        @And("Click login button")
        public void clickLoginButton() {
            new NewLoginPage().iClickOnLoginButtonOnLoginPage();
        }

        @And("Click 'Delete Account button")
        public void clickDeleteAccountButton() {
            new LoginPage().clickOnDeleteAccountLink();
        }

        @And("Verify that ACCOUNT DELETED! is visible")
        public void verifyThatACCOUNTDELETEDIsVisible() {
            String actualText = new LoginPage().verifyDeleteAccountText();
            Assert.assertEquals(actualText, "ACCOUNT DELETED!");
        }

        @And("Verify error {string} is visible")
        public void verifyErrorYourEmailOrPasswordIsIncorrectIsVisible(String text) {
            String actualText1 = new NewLoginPage().verifyIncorrectText();
            Assert.assertEquals(actualText1, "Your email or password is incorrect!");

        }

        @And("Verify that Logged in as username is visible")
        public void verifyThatLoggedInAsUsernameIsVisible() {
            String actualText2 = new NewLoginPage().verifyLoggedInText();
            Assert.assertEquals(actualText2, "Logged in as Amruta");
        }
    }

