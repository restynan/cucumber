Feature: Application Login
  #Background:
  # Given validate the browser
  # When  Browser is triggered
  # Then check if Browser is started

  @RegTest
  Scenario: HomePage default login
    Given User is on landing page
    When User login into application with username "jim" and password "123"
    Then Home page is populated
    And cards are displayed "true"


  @SmokeTest
  Scenario: HomePage default login
    Given User is on landing page
    When User login into application with username "resty" and password "678"
    Then Home page is populated
    And cards are displayed "false"

  @SmokeTest
  Scenario: HomePage default login
    Given User is on landing page
    When User login into application with following details
    | jenny | abcd | john@abcd.com | Austria | 457256901 |
    Then Home page is populated
    And cards are displayed "false"

  @RegTest
  Scenario Outline: HomePage default login
    Given User is on landing page
    When User login in to application with username <username> and password <password>
    Then Home page is populated
    And cards are displayed "false"
    Examples:
    |username|password|
    |user1   |pass1   |
    |user2   |pass2   |
    |user3   |pass3   |
