Feature: all login test

  Scenario: to test the login button
    Given I am on the login page
    When I enter correct usernae and password
    And I click on login button
    Then I should land on login page

    Given I am on the login page
    When I enter incorrect usernae and in correct password
    And I click on login button
    Then I should not land on login page

    Given I am on the login page
    When I enter blanck usernae and password
    And I click on login button
    Then I should not land on login page


