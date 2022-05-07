Feature: Login Feature
  Scenario Outline: Registered user can login
    Given user is on homepage
    When user clicks in the top navigation on My Account link to open the dropdown menu
    And user clicks on the Login link in the dropdown menu
    Then the Login page opens
    And user fill out existing E-Mail as <eMail>
    And user fill out Password as <password>
    And user click on Login button
    Then user will be redirected to his account page
    Examples:
      |eMail                  |password |
      |stipe.stipic@gmail.com |123456   |