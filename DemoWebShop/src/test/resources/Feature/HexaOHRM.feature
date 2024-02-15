Feature: Validate Admin

  #Author: ShrineeJ
  Scenario: Admin Validation
    Given Enter the URL
    When Enter valid username and password <"Admin"> and <"admin123">
    Then Login Successful
    And Click Admin
    Then Admin Clicked