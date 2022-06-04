Feature: Test B - Add/Delete Elements
  As User
  I want to add element
  To look the element selected

  @TestB
  Scenario: Select element
    Given User visits heroku elements
    When User add an element
    Then User able to see element added with delete button

  @TestB
  Scenario: Select item and Delete item
    Given User visits heroku elements
    When User add an element
    And User delete the element selected
    Then User able to see the page with non element added