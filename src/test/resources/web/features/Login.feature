Feature: Login

  @Smoke
  Scenario: Success login with valid mail and password
    Given The client is in home page
    When The client tap on My Account menu
    And The client put "Ramiro" in user input
    And The client put "Ra15987" in password input
    And The client tap on Login
    Then The client is in login page

  @Smoke
  Scenario: login with valid mail and empty password
    Given The client is in home page
    When The client tap on My Account menu
    And The client put "Ramiro" in user input
    And The client put "" in password input
    And The client tap on Login
    Then The client can see a error message

  @Smoke
  Scenario: login with Handles case sensitive
    Given The client is in home page
    When The client tap on My Account menu
    And The client put "rAMIRO" in user input
    And The client put "rA15987" in password input
    And The client tap on Login
    Then The client can see a error message

