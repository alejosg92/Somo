Feature: Test A - Login
  As User
  I want to login with user and pass
  To look the private page

  @TestA
  Scenario: Wrong User and Pass to Login
    Given User visits heroku login
    When User logs in with user: "user" and Pass: "pass"
    Then User able to see error message: "Your username is invalid!"


  @TestA
  Scenario: Correct User and Pass to Login
    Given User visits heroku login
    When User logs in with user: "tomsmith" and Pass: "SuperSecretPassword!"
    Then User able to see pass message: "You logged into a secure area!"
