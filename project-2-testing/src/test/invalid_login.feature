Feature: invalid login

  Scenario Outline: Invalid login
    Given I am at the login page
    When I type in a username of <username>
    And I type in a password of <password>
    And I click the login button
    Then I should receive an alert with an error message

    Examples:
      | username      | password   |
      | "bobby"       | "prd" |
      | "ozwald"      | "pasrd" |
      | "funderdoowood"  | "password" |
      | "jessrwedabbit"  | "password" |
      | "abc"     | "password" |
      | "abcd"         | "pword" |
      | "mrsmith1"     | "password1" |