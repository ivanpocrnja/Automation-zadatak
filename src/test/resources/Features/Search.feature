Feature: Search Feature
  Scenario Outline: Logged in user can search for products
    Given user is on homepage
    When user clicks in the top navigation on My Account link to open the dropdown menu
    And user clicks on the Login link in the dropdown menu
    Then the Login page opens
    And user fill out existing E-Mail as <eMail>
    And user fill out Password as <password>
    And user click on Login button
    Then user will be redirected to his account page
    When user inputs product as <product> into search field
    And user click on search button
    Then products that match the search term are listed bellow
    Examples:
      |eMail                  |password |product  |
      |stipe.stipic@gmail.com |123456   |Mac      |

  Scenario Outline: Visitor user can search for products
    Given user is on homepage
    When user inputs product as <product> into search field
    And user click on search button
    Then products that match the search term are listed bellow
    Examples:
      |product  |
      |Mac      |