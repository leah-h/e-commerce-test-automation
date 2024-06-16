#@Smoke
#Feature: Publix Landing Page
#
#  Scenario: Validate landing page
#    Given user is on the Publix landing page
#    Then the landing page should display correctly
#
#
#  Scenario Outline: Search for a product
#    Given user is on the Publix landing page
#    When the user searches for "<keyword>"
#    Then the search results page is displayed with "<keyword>"
#
#    Examples:
#    | keyword |
#    | milk    |
#    | bread   |
#    |eggs     |