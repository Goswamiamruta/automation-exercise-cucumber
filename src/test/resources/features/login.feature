@regression
Feature: Login functionality
  As a user I should be able to register successfully

  Background:
    Given I am on homepage


    #Test case 2
  @author_Amruta @sanity @smoke
  Scenario: Login User with Correct email and password
    When Click Signup link
    Then Verify Login to your account is visible
    And Enter "Amruta123@gmail.com" email address and "Amruta123" password
    And Click login button
    And Click 'Delete Account button
    #And Verify that ACCOUNT DELETED! is visible

  #Test case 3
  @author_Amruta @smoke
  Scenario: Login User with incorrect email and password
    When Click Signup link
    Then Verify Login to your account is visible
    And Enter "scooper123@gmail.com" email address and "sc2023" password
    And Click login button
    And Verify error 'Your email or password is incorrect!' is visible


  #Text case 4
  @author_Amruta
  Scenario: Logout User
    When Click Signup link
    Then Verify Login to your account is visible
    And Enter "Amruta123@gmail.com" email address and "Amruta123" password
    And Click login button
    And Verify that Logged in as username is visible