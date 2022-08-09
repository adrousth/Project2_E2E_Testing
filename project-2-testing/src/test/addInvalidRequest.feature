Feature: Add invalid request

  Scenario Outline: Add invalid request
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
    Then I should be redirected to the user page with the new request added

    Examples:
      | username      | password   | initial_date | expiration_date | value | type           |
      | "bobby"       | "password" | "2000-02-02" | "2002-02-02"    | 200   | "hospital bed" |
      | "funderwood"  | "password" | "2005-05-12" | "2007-05-12"    | 4500  | "MRI"          |
      | "jessrabbit"  | "password" | "2020-12-12" | "2022-12-12"    | 35000 | "syringes"     |
      | "trinity"     | "password" | "1999-01-01" | "2001-01-01"    | 12500 | "EKGs"         |
      | "Neo"         | "password" | "2012-01-01" | "2014-01-01"    | 10    | "heart moniter"|
      | "Neo"         | "password" | "1997-12-12" | "1999-12-12"    | 50000 | "respirator"   |