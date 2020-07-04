Feature: Prevent Withdrawal
  Scenario Outline: Unsuccessful withdrawal money from a wallet
    Given I have $200 in my wallet
    When I have requested $<ask> money from my wallet
    Then I should receive $ <get> from my wallet
    Examples:
      | ask |get |
      | -50 | 0  |
      | 0 | 0 |
      | 100 | 100|
      | 199 | 199 |
      | 200 |200 |
      | 201 |0 |
      | 300 | 0 |
