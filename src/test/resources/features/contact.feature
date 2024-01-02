@regression
Feature: Contact Us Page

  Background:
    Given I am on homepage


      #Test case 6
  @author_Amruta @sanity @smoke
  Scenario: Contact Us Form
    When Click on 'Contact Us' button
    And  Verify GET IN TOUCH is visible
    Then Enter "Amruta","amruta123@gmail.com","about product","This product is good"
    And Click Submit button
    And Click OK button
    And Verify success message 'Success! Your details have been submitted successfully.' is visible
    And Click 'Home' button and verify that landed to home page successfully


    #Test case 18
  @author_Amruta @smoke
  Scenario: User should view category products
    When I click on products tab
    Then I click on Women category
    And I click on Dress in women category
    And I should see "WOMEN - DRESS PRODUCTS" page title
    Then I click on Men category
    And I click on T-shirts in men category
    And I should see MEN - T-shirts PRODUCTS page title