@regression
Feature: As a user

  Background:
    Given I am on homepage


    #Test case 7
  @author_Amruta @sanity @smoke
  Scenario: Verify Test Cases Page
    When Click on Test Cases button
    Then Verify user is navigated to test cases page successfully

    #Test case 10
  @author_Amruta @smoke
  Scenario: Verify Subscription in home page
    When Scroll down to footer
    Then Verify text 'SUBSCRIPTION'
    And Enter email address "amruta123@gmail.com" in input and click arrow button
    And Verify success message You have been successfully subscribed! is visible

    #Test case 11
  @author_Amruta
  Scenario: Verify Subscription in Cart page
    When Click Cart button
    Then Scroll down to footer
    And Verify text 'SUBSCRIPTION'
    And Enter email address "amruta123@gmail.com" in input and click arrow button
    And Verify success message You have been successfully subscribed! is visible


     #Test case 14
  @author_Amruta
  Scenario: User should Place Order: Register while Checkout
    When I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    And I click on Proceed to Checkout button
    And I click on register link in the checkout popup
    And I send name "Amruta" and email "jeet123" to signup
    And I click on button "Signup"
    And I fill all details in signup page "Mrs","People123","1","January","2021","Amruta","Patel","449A kingston","Epsom","India","London","Kingston","KT190GB","0987654321"
    And I click on Create Account button
    Then I see account created message "ACCOUNT CREATED!"
    And I click on continue button
    Then I should see the text "Logged in as " "Amruta"
    And I click on header menu option "Cart"
    And I click on Proceed to Checkout button
    And I click on place order button
    And I enter payment details "Jeet Patel" "4263982640269299" "837" "02" and "2026"
    And I click on Pay and Confirm Order button
    #Then I should see the order confirmation message "Congratulations! Your order has been confirmed!"
    #And I click on header menu option "Delete Account"
    #And I click on continue button after deleting account


      #Test case 15
  @author_Amruta
  Scenario: User should Place Order: Register before Checkout
    When I click on header menu option "Signup / Login"
    And I send name "Amruta" and email "jeet123" to signup
    And I click on button "Signup"
    And I fill all details in signup page "Mrs","People123","1","January","2021","Amruta","Patel","449A kingston","Epsom","India","London","Kingston","KT190GB","0987654321"
    And I click on Create Account button
    Then I see account created message "ACCOUNT CREATED!"
    And I click on continue button
    Then I should see the text "Logged in as " "Amruta"
    And I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    And I click on Proceed to Checkout button
    And I click on place order button
    And I enter payment details "Amruta Patel" "4263982640269299" "837" "02" and "2026"
    And I click on Pay and Confirm Order button
    #Then I should see the order confirmation message "Congratulations! Your order has been confirmed!"
    #And I click on header menu option "Delete Account"
    #And I click on continue button after deleting account


      #test Case 16
  @author_Amruta
  Scenario: User should place the order successfully : Login before Checkout
    When I click on header menu option "Signup / Login"
    Then I should see the login page text "Login to your account"
    And I enter "Amruta123@gmail.com" email and "Amruta123" password for login
    And I click on button "Login"
    Then I should see the text "Logged in as " "Amruta"
    And I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    And I click on Proceed to Checkout button
    And I click on place order button
    And I enter payment details "Amruta Patel" "4263982640269299" "837" "02" and "2026"
    And I click on Pay and Confirm Order button
    Then I should see the order confirmation message "Congratulations! Your order has been confirmed!"
    And I click on header menu option Logout


        #Test Case 17
  @author_Amruta
  Scenario: User should remove the product from cart
    When I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    Then I click on cross button to remove the product from the cart

    #Test Case 23
  @author_Amruta
  Scenario: Verify address details in checkout page
    When I click on header menu option "Signup / Login"
    And I send name "Amruta" and email "amruta" to signup
    And I click on button "Signup"
    And I fill all details in signup page "Mrs","People123","1","January","2021","Amruta","Patel","449A kingston","Epsom","India","London","Kingston","KT190GB","0987654321"
    And I click on Create Account button
    Then I see account created message "ACCOUNT CREATED!"
    And I click on continue button
    Then I should see the text "Logged in as " "Amruta"
    And I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    And I click on Proceed to Checkout button
    Then I should see the delivery address is same address filled at the time registration of account "449A kingston"
    And I should see billing address is same address filled at the time registration of account "449A kingston"
    #And I click on header menu option "Delete Account"
    #Then I should see the account deleted message "ACCOUNT DELETED!"
   # And I click on continue button after deleting account

   # Test Case 24
  @author_Amruta
  Scenario: User should download invoice after purchase order
    When I add product "Blue Top" to the cart
    And I click on view cart in popup
    And I should see the welcome text on shopping cart page "Shopping Cart"
    And I click on Proceed to Checkout button
    And I click on register link in the checkout popup
    And I send name "Amruta" and email "amruta" to signup
    And I click on button "Signup"
    And I fill all details in signup page "Mrs","People123","1","January","2021","Amruta","Patel","449A kingston","Epsom","India","London","Kingston","KT190GB","0987654321"
    And I click on Create Account button
    Then I see account created message "ACCOUNT CREATED!"
    And I click on continue button
    Then I should see the text "Logged in as " "Amruta"
    And I click on header menu option "Cart"
    And I click on Proceed to Checkout button
    And I should see the text on checkout page "Review Your Order"
    And I should see the text on checkout page "Address Details"
    And I enter details into comment area "Please deliver it on time."
    And I click on place order button
    And I enter payment details "Jeet Patel" "4263982640269299" "837" "02" and "2026"
    And I click on Pay and Confirm Order button
    Then I should see the order confirmation message "Congratulations! Your order has been confirmed!"
    And I click on download invoice after order success
    And I click on continue button after order success
    #And I click on header menu option "Delete Account"
    #Then I should see the account deleted message "ACCOUNT DELETED!"
    #Then I click on continue button after deleting account

  # Test Case 25
  @author_Amruta
  Scenario: User should scroll down and scroll up using Arrow button at bottom right corner
    When I scroll down up to subscription link
    Then I should see the subscription "SUBSCRIPTION" text
    And I click on arrow up button at bottom right corner
    And I should see the message "Full-Fledged practice website for Automation Engineers"

    # Test Case 26
  @author_Amruta
  Scenario: User should scroll down and scroll up without Arrow button
    When I scroll down up to subscription link
    Then I should see the subscription "SUBSCRIPTION" text
    And I scroll up
    And I should see the message "Full-Fledged practice website for Automation Engineers"
