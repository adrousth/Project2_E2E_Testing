Feature: Manager Logout

  Scenario Outline:
    Given I am at the login page
    When I type in a username of <username>
    And I type in a password of <password>
    And I click the login button
    And I should be redirected to the manager page
    And I am at a Manager page
    And I click on the manager logout button
    Then I am redirected to the login page

    Examples:
      | username      | password   |
      | "ozwald"      | "password" |
      | "mrsmith"     | "password" |
      | "funderwood"  | "password" |