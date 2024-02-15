Feature: Verify Admin

  #Author: ShrineeJ
  Scenario: Login Validation
    Given Enter the URL
    When Enter valid username and password <"Admin"> and <"admin123">
    Then Login Successful

  