Feature: Fizz Buzz
  Pass number and get correct answer
  Scenario Outline: Get answer based on passed number
    Given Chosen number is <number>
    When I pass number
    Then I should get correct <answer>
    Examples:
      | number | answer |
      | divisible by three | "Fizz" |
      | divisible by five  | "Buzz" |
      | divisible by three and five | "FizzBuzz" |
      | not divisible by three and five | "None" |
