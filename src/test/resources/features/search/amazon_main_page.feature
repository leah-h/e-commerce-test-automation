@Smoke
  Feature: Amazon Landing Page

    Scenario Outline: Validate Amazon Landing Page
    Given user is on the Amazon landing page
    When user searches for "<searchTerm>"
    Then the search results page is displayed with "<searchTerm>"

    Examples:
      | searchTerm |
      | milk       |
