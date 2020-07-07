Feature: Prevent users from going overdrawn
  Scenario Outline: : User tries to withdraw more than their balance
    Given Customer<name> credited account with $<paidIn>
    When Customer<name> try to withdraw $<withdraw>
    Then nothing should be dispensed to <name>
    And Customer <name> want <withdraw> should be told that he has insufficient balance
      Examples:
        | name | paidIn | withdraw |
        | "Rogers" | 100 | 200 |
        | "Carter" | 200 | 300 |
        | "Smith" | 300 | 400 |