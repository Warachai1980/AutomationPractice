Feature: User Management page scenarios
  Scenario: Verify title of the page
    Given I navigate to homepage
    When I open User-Mgt page
    Then Title of the page should be Register New User

  Scenario: Verify Login button is present
    Given I navigate to homepage
    When I open User-Mgt page
    Then I should see Login button

  Scenario: Verify Access DB button is present
    Given I navigate to homepage
    When I open User-Mgt page
    Then I should see Access DB button

  Scenario: verify title of Access DB page
    Given I navigate to homepage
    When I open User-Mgt page
    When I open Access DB page
    Then I should see title of the page is User DB

  Scenario: Verify title of LogIn page and Image is load
    Given I navigate to homepage
    When I open User-Mgt page
    When I open Login page
    Then I should see title of the page is Login Page
    Then tla image is loaded