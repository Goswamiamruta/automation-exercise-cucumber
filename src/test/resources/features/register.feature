@regression
Feature: Login functionality
  As a user I should be able to register successfully

  Background:
    Given I am on homepage

    #Test case 1
  @author_Amruta @sanity @smoke
  Scenario: Verify that user can register successfully
    When Click 'Signup' link
    And Verify 'New User Signup!' is visible
    Then Enter name and email address
    And Click 'Signup' button
    And Verify that 'ENTER ACCOUNT INFORMATION' is visible
    And enter "Mrs","People123","1","January","2021","Amruta","Patel","449A kingston","Epsom","India","London","Kingston","KT190GB","0987654321"
    And Select checkbox 'Sign up for our newsletter!'
    And Select checkbox 'Receive special offers from our partners!'
    And Click 'Create Account button'
    And Verify that ACCOUNT CREATED! is visible
    And Click Continue button
    And Click Delete Account button
    And Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button

  @author_Amruta @smoke
  Scenario: Register User with existing email
    When Click 'Signup' link
    And Verify 'New User Signup!' is visible
    Then Enter name and already registered email address
    And Click 'Signup' button
    And Verify error Email Address already exist! is visible
