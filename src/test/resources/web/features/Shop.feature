Feature: Shop

  @Smoke @Do
  Scenario: Category functionality
    Given The client is in home page
    When The client tap on Shop menu
    And The client tap on HTML product category
    Then The client can view only that particular product