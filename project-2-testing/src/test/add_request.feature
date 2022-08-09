Feature: Add request

  Scenario Outline: Add request
    Given I am at the login page
    When I type in a username of <username>
    And I type in a password of <password>
    And I click the login button
    And I should be redirected to the user page
    And I click on the add request button
    And I enter a initial date of <initial_date>
    And I enter a expiration date of <expiration_date>
    And I enter a value of <value>
    And I choose a type of <type>
    And I click submit
    Then I should receive an alert with an error message

    Examples:
      | username      | password   | initial_date | expiration_date | value | type           |
      | "bobby"       | "password" | "02-02-2000" | "2002-02-02"    | 200   | "hospital bed" |
      | "funderwood"  | "password" | "2005-05-12" | "05-12-2022"    | 4500  | "MRI"          |
      | "jessrabbit"  | "password" | "2020-12-12" | "2022-12-12"    | "abc" | "syringes"     |