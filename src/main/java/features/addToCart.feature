Feature: Bookcart application demo

  Scenario Outline: Add a product to the cart

    Given User navigate to the BookCart application
    And User should login as "<username>" and "<password>"
    And user search a "<book>"
    When User add the book to the cart
    Then the cart badge should be updated

    Examples:
      | username | password | book              |
      | ortoni   | pass1234 | Birthday Girl     |
      | ortonikc | pass1234 | Like a Love Story |
