Feature: Admin Logout

  Scenario Outline:
    Given I am at the login page
    When I type in a username of <username>
    And I type in a password of <password>
    And I click the login button
    And I should be redirected to the admin page
    And I am at an Admin page
    And I click the admin logout button
    Then I am redirected to the login page

    Examples:
      | username      | password   |
      | "bobby"       | "password" |
      | "jessrabbit"  | "password" |
      | "trinity"     | "password" |
      | "Neo"         | "password" |