Feature: LoggedIn user view

  Scenario:  Validate user is able to view after log in.
    Given User navigates to the login page.
    When  user successfully enters the log in details.
    Then  user should be able to view the product category page.