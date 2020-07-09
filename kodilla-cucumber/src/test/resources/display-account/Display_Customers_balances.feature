Feature: Display Customers Balances
  Scenario Outline: Users check their balances
    Given User<name> credited account with $<paidIn>
    When User <name> checks balance
    Then User <name> should see account balance $ <balance>
      Examples:
        | name | paidIn | balance |
        | "Rogers" | 100 | 100 |
        | "Carter" | 200 | 200 |
        | "Smith" | 300 | 300 |