Feature: Search KSA on BBC Learn English website and verify search.

  @Login
  Scenario Outline: Demonstrating how Cucumber works
    Given I have configured CucumberLesson
    When I run it within my IDE "<username>" and "<password>"
    Then I will be able to run connected step definitions
    Examples:
      | username   | password |
      | autotester | password |
      | tauuser    | password |

  @Login
  Scenario Outline: Demonstrating how Cucumber-JVM works
    Given I have configured CucumberLesson
    When I run it within my IDE "<username>" and "<password>"
    Then I will be able to run connected step definitions
    Examples:
      | username   | password |
      | autotester | password |
      | tauuser    | password |


