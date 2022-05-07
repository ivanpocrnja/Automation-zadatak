Feature: Registration Feature
  Scenario Outline: Visitor user can create an account
    Given user is on homepage
    When user clicks in the top navigation on My Account link to open the dropdown menu
    And user clicks on the Register link in the dropdown menu
    Then the Registration page opens
    When user fill out First Name as <firstName>
    And user fill out Last Name as <lastName>
    And user fill out E-Mail as <eMail>
    And user fill out Telephone as <telephone>
    And user fill out Password as <password>
    And user fill out Confirm Password as <confirmPassword>
    And user check the Privacy Policy checkbox
    And user user click on Continue button
    Then user will be redirected to his newly created account page
    Examples:
      |firstName    |lastName   |eMail                  |telephone  |password |confirmPassword  |
      |Stipe        |Stipic     |stipe.stipic@gmail.com |123456     |123456   |123456           |