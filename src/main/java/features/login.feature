Feature: Bookcat Application tests


  Background:
    Given User navigate to the BookCart application

@reg
  Scenario:
    Login should be success

    Given User navigate to the BookCart application
    And User clicks on the login button
    And User enter the username as ortoni
    And User enter the password as Pass1234
    When User click on the login button
    Then Login should be success
@smoke
  Scenario:
  Login should not be success

    Given User navigate to the BookCart application
    And User clicks on the login button
    And User enter the username as Koushik
    And User enter the password as Pass21
    When User click on the login button
    But Login should fail

