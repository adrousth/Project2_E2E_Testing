Feature: valid admin login

  Scenario Outline: Valid login
    Given I am at the login page
    When I type in a username of <username>
    And I type in a password of <password>
    And I click the admin login button
    Then I should be redirected to the admin page

    Examples:
    | username      | password   |
    | "bobby"       | "password" |
    | "jessrabbit"  | "password" |
    | "trinity"     | "password" |
    | "Neo"         | "password" |