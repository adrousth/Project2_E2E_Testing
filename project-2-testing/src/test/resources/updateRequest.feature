Feature: Update Request

  Scenario Outline: Add request
    Given I am at the login page
    When I type in a username of <username>
    And I type in a password of <password>
    And I click the login button
    And I should be redirected to the manager page
    And I click on a dropdown for a request's status
    And I select a status of <status> for <warranty_id>
    And I click on the update status button
    Then I should receive an updated table with the updated status

    Examples:
      | username      | password   | status     | warranty_id |
      | "ozwald"      | "password" | "approved" | 1           |
      | "mrsmith"     | "password" | "denied"   | 5           |
