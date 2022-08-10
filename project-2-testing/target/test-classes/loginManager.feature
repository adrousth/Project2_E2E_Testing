Feature: valid manager login

  Scenario Outline: Valid login
    Given I am at the login page
    When I type in a username of <username>
    And I type in a password of <password>
    And I click the manager login button
    Then I should be redirected to the manager page

    Examples:
      | username      | password   |
      | "ozwald"      | "password" |
      | "mrsmith"     | "password" |
      | "funderwood"  | "password" |