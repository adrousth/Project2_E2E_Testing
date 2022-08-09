Feature: valid login

  Scenario Outline: Valid login
    Given I am at the login page
    When I type in a username of <username>
    And I type in a password of <password>
    And I click the login button
    Then I should be redirected to the user page

    Examples:
    | username      | password   |
    | "bobby"       | "password" |
    | "ozwald"      | "password" |
    | "funderwood"  | "password" |
    | "jessrabbit"  | "password" |
    | "trinity"     | "password" |
    | "Neo"         | "password" |
    | "mrsmith"     | "password" |