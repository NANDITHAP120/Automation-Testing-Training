Feature: Login

  Scenario Outline: Positive Login test
    Given I opened the app using following <URL>
    When I enter username <username> and password <password>
    And I click on the Submit button
    Then I verify new page URL contains <expectedUrlPart>
    And I verify new page contains expected text <expectedText> or <expectedText2>
    And I verify logout button is displayed on the new page

    Examples: 
      | URL                                                     | username | password    | expectedUrlPart                                    | expectedText    | expectedText2          |
      | https://practicetestautomation.com/practice-test-login/ | student  | Password123 | practicetestautomation.com/logged-in-successfully/ | Congratulations | Successfully logged in |

  Scenario Outline: Negative username test
    Given I opened the app using following <URL>
    When I enter username <username> and password <password>
    And I click on the Submit button
    Then I verify error message is displayed
    And I verify error message text is <expectedErrorMessage>

    Examples: 
      | URL                                                     | username      | password    | expectedErrorMessage      |
      | https://practicetestautomation.com/practice-test-login/ | incorrectUser | Password123 | Your username is invalid! |

  Scenario Outline: Negative password test
    Given I opened the app using following <URL>
    When I enter username <username> and password <password>
    And I click on the Submit button
    Then I verify error message is displayed
    And I verify error message text is <expectedErrorMessage>

    Examples: 
      | URL                                                     | username | password          | expectedErrorMessage      |
      | https://practicetestautomation.com/practice-test-login/ | student  | incorrectPassword | Your password is invalid! |
