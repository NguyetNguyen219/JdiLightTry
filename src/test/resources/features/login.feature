Feature: Login
  Background: Open the browser and launch the application to home page
    Given Application is opened in browser

  Scenario Outline: Valid login with user Roman
    When Enter the username "<username>" and password "<password>"
    Then Roman's name is displayed on top bar

    Examples:
      |username |password |
      |Roman    |Jdi1234  |

  Scenario: Invalid login
    When Enter wrong username and password
    Then Error message is displayed