@Regression
@testcasekey=SWL-TC-1
Feature: Login Test
  Scenario Outline: Check whether user is able to login with valid credentials
    Given User navigate to the login page
    When user should enter <username> and <password>
    Then user able to view the product page
    Examples:
      | username          | password         |
      | "<standard_user>" | "<secret_sauce>" |

