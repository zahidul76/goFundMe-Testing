Feature: Login Functionality Test
  Description: Login Functionality Test of GoFundME application

  Scenario: Login Functionality test  correct credentials

    Given User opens browser
    When The user goes to URL "https://www.gofundme.com/"
    And The user click in the Sign In button
    And The user enters correct Email Address
    And The user enters correct password
    And The user click on the Sign in to GoFundMe button
    Then The user successfully log in the GoFundME account